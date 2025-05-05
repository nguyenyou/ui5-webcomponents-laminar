import type { CodeBlockWriter } from 'ts-morph';
import type { WebComponentWrapper } from './WebComponentWrapper.js';
export enum RenderingPhase {
  imports = 'imports',
  attributes = 'attributes',
  props = 'props',
}

export abstract class AbstractRenderer {
  public readonly phase!: RenderingPhase;

  public prepare(context: WebComponentWrapper) {
    // optional
  }
  abstract render(context: WebComponentWrapper, writer: CodeBlockWriter): void;
}
