# How to build
## JS
```bash
gradle jsBrowserProductionWebpack
gradle jsBrowserDevelopmentWebpack
```
Result in `build/kotlin-webpack/js/productionExecutable/${rootProject.name}.js` and `build/kotlin-webpack/js/developmentExecutable/${rootProject.name}.js`
## JVM
```bash
gradle jvmFatJar
```
Result in `build/libs/${rootProject.name}-fat.jar`, use with `java -jar build/libs/${rootProject.name}-fat.jar`.