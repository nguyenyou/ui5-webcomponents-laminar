import type * as CEM from "@ui5/webcomponents-tools/lib/cem/types-internal.d.ts";
import type { CodeBlockWriter } from "ts-morph";
import { AbstractRenderer, RenderingPhase } from "./AbstractRenderer.js";
import {
  camelCaseToKebabCase,
  capitalizeFirstLetter,
  propDescriptionFormatter,
  sinceFilter,
  snakeCaseToCamelCase,
} from "../../util/formatters.js";
import { resolveReferenceImports } from "../../util/referenceResolver.js";
import { WebComponentWrapper } from "./WebComponentWrapper.js";

export class PropTypesRenderer extends AbstractRenderer {
  public phase = RenderingPhase.props;

  private _slots: CEM.Slot[] = [];
  private _events: CEM.Event[] = [];
  private eventNames = new Set<string>();

  public setSlots(slots: CEM.Slot[]) {
    this._slots = slots
      .map((s) => {
        if (s.name === "default") {
          return {
            ...s,
            name: "children",
          } as CEM.Slot;
        }
        return s;
      })
      .toSorted((a, b) => a.name.localeCompare(b.name));
    return this;
  }

  public setEvents(events: CEM.Event[]) {
    this._events = events.toSorted((a, b) => a.name.localeCompare(b.name));
    return this;
  }

  private eventHasDetails(event: CEM.Event) {
    return (
      Array.isArray(event.type.references) && event.type.references.length > 0
    );
  }

  private printSlots(
    context: WebComponentWrapper,
    writer: CodeBlockWriter
  ): void {
    this._slots.forEach((slot) => {
      const isDefaultSlot = slot.name === "children" || slot.name === "";
      const descriptionParts = [];
      descriptionParts.push(
        ` * ${propDescriptionFormatter(slot.description ?? "")}`
      );

      if (!isDefaultSlot) {
        descriptionParts.push(` *`);
        descriptionParts.push(
          ` * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (\`slot="${slot.name}"\`).`
        );
        descriptionParts.push(
          ` * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.`
        );
        descriptionParts.push(` *`);
        descriptionParts.push(
          " * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component."
        );
        descriptionParts.push(
          `* Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).`
        );
      }

      if (sinceFilter(slot._ui5since)) {
        descriptionParts.push(` *`);
        descriptionParts.push(
          ` * **Note:** Available since [v${slot._ui5since}](https://github.com/SAP/ui5-webcomponents/releases/tag/v${slot._ui5since}) of **${context.packageName}**.`
        );
      }

      if (slot.deprecated) {
        descriptionParts.push(` *`);
        if (typeof slot.deprecated === "string") {
          descriptionParts.push(` * @deprecated ${slot.deprecated}`);
        } else {
          descriptionParts.push(` * @deprecated`);
        }
      }

      if (!isDefaultSlot) {
        writer.writeLine(`/**\n${descriptionParts.join("\n")}\n */`);
        writer.writeLine(
          `lazy val ${snakeCaseToCamelCase(
            slot.name
          )}: Slot = new Slot("${slot.name}")`
        );
      }
    });
  }

  private printEvents(
    context: WebComponentWrapper,
    writer: CodeBlockWriter
  ): void {
    this._events.forEach((event) => {
      const descriptionParts = [];

      descriptionParts.push(
        ` * ${propDescriptionFormatter(event.description ?? "")}`
      );
      if (event._ui5allowPreventDefault) {
        descriptionParts.push(` *`);
        descriptionParts.push(
          ` * **Note:** Call \`event.preventDefault()\` inside the handler of this event to prevent its default action/s.`
        );
      }
      if (sinceFilter(event._ui5since)) {
        descriptionParts.push(` *`);
        descriptionParts.push(
          ` * **Note:** Available since [v${event._ui5since}](https://github.com/SAP/ui5-webcomponents/releases/tag/v${event._ui5since}) of **${context.packageName}**.`
        );
      }
      if (event.deprecated) {
        descriptionParts.push(` *`);
        if (typeof event.deprecated === "string") {
          descriptionParts.push(` * @deprecated ${event.deprecated}`);
        } else {
          descriptionParts.push(` * @deprecated`);
        }
      }
      if (
        Object.prototype.hasOwnProperty.call(event, "_ui5Bubbles") ||
        Object.prototype.hasOwnProperty.call(event, "_ui5Cancelable")
      ) {
        descriptionParts.push(` *`);
        descriptionParts.push(`* | cancelable | bubbles |`);
        descriptionParts.push(`* | :--------: | :-----: |`);
        descriptionParts.push(
          `* | ${event._ui5Cancelable ? "✅" : "❌"}|${
            event._ui5Bubbles ? "✅" : "❌"
          }|`
        );
      }

      const domRef = `${context.componentName}DomRef`;
      const reactEventName = `on${capitalizeFirstLetter(
        snakeCaseToCamelCase(event.name)
      )}`;

      writer.writeLine(`/**\n${descriptionParts.join("\n")}\n */`);

      if (event.type.text?.startsWith("CustomEvent")) {
        const hasDetails = this.eventHasDetails(event);
        if (hasDetails) {
          writer.writeLine(
            `lazy val ${reactEventName}: EventProp[Ui5CustomEvent[Ref] & EventDetail[${
              event.type.references!.at(0)!.name
            }]]  = new EventProp("${event.name}")`
          );
        } else {
          writer.writeLine(
            `lazy val ${reactEventName}: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("${event.name}")`
          );
        }
      } else if (event.type.text === "Event") {
        switch (event.name) {
          case "click":
            writer.writeLine(
              `lazy val ${reactEventName}: EventProp[dom.Event]  = new EventProp("${event.name}")`
            );
            break;
          case "drop":
            writer.writeLine(
              `lazy val ${reactEventName}: EventProp[dom.DragEvent]  = new EventProp("${event.name}")`
            );
            break;
          default:
            console.warn("Unknown Native Event", event.name);
        }
      }
    });
  }

  prepare(context: WebComponentWrapper) {
    for (const event of this._events) {
      const reactEventName = `on${capitalizeFirstLetter(
        snakeCaseToCamelCase(event.name)
      )}`;
      this.eventNames.add(reactEventName);
      if (
        event.type.text.startsWith("CustomEvent") &&
        this.eventHasDetails(event)
      ) {
        resolveReferenceImports(event.type?.references ?? [], context);
      }
    }
  }

  render(context: WebComponentWrapper, writer: CodeBlockWriter) {
    writer.blankLine().writeLine(`// -- Events --`).blankLine();
    this.printEvents(context, writer);

    writer.blankLine().writeLine(`// -- Slots --`).blankLine();
    this.printSlots(context, writer);
  }
}
