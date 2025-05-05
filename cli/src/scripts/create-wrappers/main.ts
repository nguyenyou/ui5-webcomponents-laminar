import type * as CEM from '@ui5/webcomponents-tools/lib/cem/types-internal.d.ts';
import { mkdir, writeFile } from 'node:fs/promises';
import { resolve } from 'node:path';
import { setGlobalTagNameMap } from '../../util/formatters.js';
import { recursiveManifestResolver } from '../../util/recursiveManifestResolver.js';
import { AttributesRenderer } from './AttributesRenderer.js';
import { ImportsRenderer } from './ImportsRenderer.js';
import { PropTypesRenderer } from './PropTypesRenderer.js';
import { WebComponentWrapper } from './WebComponentWrapper.js';

function filterAttributes(member: CEM.ClassField | CEM.ClassMethod): member is CEM.ClassField {
  return member.kind === 'field' && member.privacy === 'public' && !member.readonly && !member.static;
}

export default async function createWrappers(packageName: string, outDir: string) {
  const startTime = Date.now();
  const customElementManifest = recursiveManifestResolver(packageName);

  const tagNameToComponentName = customElementManifest.modules.reduce(
    (map, mod) => {
      for (const declaration of mod.declarations ?? []) {
        if ('tagName' in declaration && declaration.tagName) {
          map[declaration.tagName] = declaration.name;
        }
      }
      return map;
    },
    {} as Record<string, string>
  );
  setGlobalTagNameMap(tagNameToComponentName);
  
  await mkdir(outDir, { recursive: true });

  let count = 0

  const promiseArr = customElementManifest.modules.map(async (module) => {
    const declaration = module.declarations?.find(
      (decl) => 'customElement' in decl && decl.customElement
    ) as CEM.CustomElementDeclaration;
    const webComponentImport = `${packageName}/${module.path}`;

    if (!declaration?.tagName) {
      return Promise.resolve();
    }
    const wrapper = new WebComponentWrapper(declaration.tagName, declaration.name, webComponentImport, packageName);
    const attributes = declaration.members?.filter(filterAttributes) ?? [];
    wrapper.addRenderer(new ImportsRenderer());
    wrapper.addRenderer(new AttributesRenderer().setAttributes(attributes));
    wrapper.addRenderer(new PropTypesRenderer().setSlots(declaration.slots ?? []).setEvents(declaration.events ?? []));
    await writeFile(resolve(outDir, `${declaration.name}.scala`), wrapper.render());
    count++
  })

  await Promise.all(promiseArr);
  
  const endTime = Date.now();
  console.log(`Generated ${count} components for ${packageName} package in ${endTime - startTime}ms`);
}
