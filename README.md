<p align="center">
  <img src="https://raw.githubusercontent.com/nguyenyou/ui5-webcomponents-laminar/main/.github/assets/banner.png" alt="Laminar wrappers for UI5 Web Components">
</p>

# Laminar wrappers for UI5 Web Components

This library provides Laminar wrappers for UI5 Web Components, making it easy to use SAP's UI components in your Scala.js projects.

## Design Philosophy

### 1. Natural Translation Between HTML and Scala

Our wrappers mirror the structure of UI5 Web Components, allowing for intuitive translation between HTML examples and Scala code:

```html
<ui5-button design="Emphasized">
    Emphasized
</ui5-button>
```

Becomes:

```scala
Button(
  _.design := "Emphasized"
)(
  "Emphasized"
)
```

We maintain a clear separation between component properties and children.

For more examples, visit our [conversion playground](https://ui5webcomponents-to-laminar.vercel.app/) (fun fact: this site is 100% vibe coded) This tool helps you quickly translate UI5 Web Components examples into Laminar wrappers.

### 2. Leveraging Scala 3 Type Unions

Instead of traditional enums:

```scala
enum ButtonDesign {
  case Default, Positive, Negative, Transparent, Emphasized, Attention
}

Button(
  _.design := ButtonDesign.Emphasized
)(
  "Emphasized"
)
```

We use Scala 3's Type Union feature for a cleaner API:

```scala
type ButtonDesign = "Default" | "Positive" | "Negative" | "Transparent" | "Emphasized" | "Attention"

Button(
  _.design := "Emphasized"
)(
  "Emphasized"
)
```

This approach offers excellent IDE support in both IntelliJ and Metals while reducing imports and maintaining type safety. It also aligns perfectly with our goal of seamless translation from HTML.

### 3. Auto-Generated Wrappers

#### Generated from Component Elements Manifest (CEM)

UI5 Web Components evolve rapidly with frequent feature additions and changes. To keep pace, our wrappers are automatically generated from the same Component Elements Manifest (CEM) used by the official [ui5-webcomponents-react](https://github.com/SAP/ui5-webcomponents-react) library.

This approach ensures long-term maintainability and compatibility with the underlying UI5 components.

#### Leveraging ScalablyTyped for Facades Generation

We use ScalablyTyped to generate type-safe facades for the UI5 Web Components. This provides two key benefits:

1. **Type-Safe DOM References**  
   Access the underlying UI5 web component with complete type safety via the `ref` attribute. All component properties and methods are fully typed:

   ```scala
   val button = Button()("Click me")
   button.ref.accessibilityAttributes.setExpanded(true)
   ```

2. **Type-Safe Custom Events**  
   UI5 components emit custom events with detailed payloads. Our wrappers provide type-safe access to these event details:

   ```scala
   Select(
     _.onChange.map(_.detail.selectedOption.id) --> selectedOptionVar.writer
   )()
   ```

This approach eliminates the need to manually define types for complex TypeScript interfaces while ensuring your code remains type-safe.

### 4. Standing on the Shoulders of Giants

This project builds upon the excellent work of existing Laminar wrapper libraries:

- [LaminarSAPUI5Bindings](https://github.com/sherpal/LaminarSAPUI5Bindings)
- [laminar-shoelace-components](https://github.com/raquo/laminar-shoelace-components)

Their innovative approaches and well-designed patterns have greatly influenced this project. We're deeply grateful for their contributions to the Scala.js ecosystem.

## Quickstart

Following these simple steps for a quickstart.

```sh
npx degit nguyenyou/ui5-webcomponents-laminar/examples/quickstart ui5-webcomponents-laminar-quickstart
cd ui5-webcomponents-laminar-quickstart
npm install
npm run dev
```

## Setup manually

There are two pieces needed in order to use this library.

1. This library: `io.github.nguyenyou::ui5-webcomponents-laminar::0.2.9` (latest version at the moment of writing).

```scala
def ivyDeps = Agg(
  ivy"io.github.nguyenyou::ui5-webcomponents-laminar::0.2.9",
)
```

The dependency format might be different depending on your build tool. I use [Mill Build Tool](https://github.com/com-lihaoyi/mill) at the moment. For other build tools, you can take a look at my [scalawind examples](https://github.com/nguyenyou/scalawind/tree/main/examples) for preferences on how to define the dependency.

2. The actual UI5 webcomponents library because the scala library is just providing the "facades" (bindings/wrappers), or you can think of it like a bridge for our ScalaJS project to connect with the UI5 Web Components library.

```sh
npm install @ui5/webcomponents
```

That is the minimal setup. You can install all their libraries if you want, we have support for all of them:

```sh
npm install @ui5/webcomponents @ui5/webcomponents-fiori @ui5/webcomponents-ai @ui5/webcomponents-compat
```

## Community & Contributions

I'd love to hear from you! If you're using this library, have questions, or want to contribute:

- **Issues & Suggestions**: Please feel free to [open an issue](https://github.com/nguyenyou/ui5-webcomponents-laminar/issues) for bugs, feature requests, or questions.
- **Contributions**: PRs are warmly welcomed! Even small documentation improvements make a big difference.
- **Feedback**: I'm still learning and growing with this project, so your feedback and experiences are invaluable.

This project is meant to serve the community, and I'm eager to learn from your insights and experiences.

## Credits

This project wouldn't be possible without the brilliant work and generous sharing of knowledge from many wonderful people:

- **[Antoine Doeraene (sherpal)](https://github.com/sherpal)** - For creating [LaminarSAPUI5Bindings](https://github.com/sherpal/LaminarSAPUI5Bindings), which provided the foundation and inspiration for this project.em.

- **[Nikita Gazarov (raquo)](https://github.com/raquo)** - For developing [laminar-shoelace-components](https://github.com/raquo/laminar-shoelace-components) and pioneering the concept of generating bindings from CEM.

- **The UI5 Team at SAP** - For their amazing [ui5-webcomponents-react](https://github.com/SAP/ui5-webcomponents-react) project and the CEM parser that powers the wrapper generation.

I'm truly standing on the shoulders of giants, and I'm deeply grateful for all their contributions.

## What's next

This project was initially created in just a week, and I'm still learning and discovering new approaches every day. Each day brings new insights, unlocks new use cases, and yes, reveals new bugs! I will improve this project over time, so stay tuned.

## License

ui5-webcomponents-laminar is MIT licensed.

