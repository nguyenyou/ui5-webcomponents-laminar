#!/usr/bin/env node
import { resolve } from 'node:path';
import { parseArgs } from 'node:util';
import * as process from 'process';

const { positionals } = parseArgs({ allowPositionals: true, strict: false });

const [command] = positionals;

switch (command) {
  case 'collect-enums': {
    const collectEnumsModule = await import('../scripts/collect-enums/main.js');
    await collectEnumsModule.default();
    break;
  }

  case 'generate-icons': {
    const generateIconsModule = await import('../scripts/generate-icons/main.js');
    await generateIconsModule.default();
    break;
  }

  case 'copy-files': {
    const copySharedFilesOptions = {
      packageName: {
        type: 'string' as const
      },
      out: {
        type: 'string' as const,
        short: 'o'
      }
    };
    const { values } = parseArgs({ options: copySharedFilesOptions, allowPositionals: true });
    const { packageName, out } = values;
    const missingParameters = [];
    if (!packageName) {
      missingParameters.push('--packageName');
    }
    if (!out) {
      missingParameters.push('--out');
    }
    if (missingParameters.length > 0) {
      console.error(`
      Missing parameters: ${missingParameters.join(', ')}
      Example: ui5-webcomponents-laminar-cli copy-files --packageName @ui5/webcomponents --out ./src/components
      
      Please add the missing parameters and try again.
      `);
      process.exit(1);
    }
    const outDir = resolve(process.cwd(), values.out!);
    console.log('outDir', outDir);
    const copySharedFilesModule = await import('../scripts/copy-files/main.js');
    await copySharedFilesModule.default(packageName!, outDir);
    break;
  }

  case 'create-wrappers': {
    const wrapperOptions = {
      packageName: {
        type: 'string' as const
      },
      out: {
        type: 'string' as const,
        short: 'o'
      }
    };
    const { values } = parseArgs({ options: wrapperOptions, allowPositionals: true });
    const { packageName, out } = values;
    const missingParameters = [];
    if (!packageName) {
      missingParameters.push('--packageName');
    }
    if (!out) {
      missingParameters.push('--out');
    }

    if (missingParameters.length > 0) {
      console.error(`
      Missing parameters: ${missingParameters.join(', ')}
      Example: ui5-webcomponents-laminar-cli create-wrappers --packageName @ui5/webcomponents --out ./src/components
      
      Please add the missing parameters and try again.
      `);
      process.exit(1);
    }

    const createWrapperModule = await import('../scripts/create-wrappers/main.js');

    const outDir = resolve(process.cwd(), values.out!);

    await createWrapperModule.default(packageName!, outDir);
    break;
  }

  case 'resolve-cem': {
    const cemOptions = {
      packageName: {
        type: 'string' as const
      },
      out: {
        type: 'string' as const,
        short: 'o'
      }
    };
    const { values } = parseArgs({ options: cemOptions, allowPositionals: true });
    const { packageName, out } = values;
    const missingParameters = [];
    if (!packageName) {
      missingParameters.push('--packageName');
    }
    if (!out) {
      missingParameters.push('--out');
    }

    if (missingParameters.length > 0) {
      console.error(`
      Missing parameters: ${missingParameters.join(', ')}
      Example: ui5-webcomponents-laminar-cli resolve-cem --packageName @ui5/webcomponents --out ./src/components
      
      Please add the missing parameters and try again.
      `);
      process.exit(1);
    }

    const resolveCEM = await import('../scripts/resolve-cem/main.js');
    const outPath = resolve(process.cwd(), out!);
    await resolveCEM.default(packageName!, outPath);
    break;
  }
  default:
    console.warn('Unknown command', command);
    process.exit(1);
}

process.exit(0);
