# How to clone
```sh
git clone https://github.com/concertypin/template -b kotlin-expressjs
```
# How to build
```sh
gradle jsProductionExecutableValidateGeneratedByCompilerTypeScript
```
Output at `build/js`, run with `node packages/${project.name}/kotlin/${project.name}.mjs`.
There is also .d.ts and .map files generated.
# How to run
```sh
gradle jsNodeDevelopmentRun
```
