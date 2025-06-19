import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
	`version-catalog`
	alias(libs.plugins.kotlin)
	alias(libs.plugins.serialization)
}
repositories {
	mavenCentral()
}

kotlin {
	js(IR) {
		nodejs {
			binaries.executable()
		}
		generateTypeScriptDefinitions()
	}
	sourceSets {
		val commonMain by getting {
			dependencies {
			
			}
		}
		val jsMain by getting {
			dependencies {
				implementation(libs.expressjs)
				npmImplementation("express")
			}
		}
	}
}

tasks.withType<KotlinJsCompile>().configureEach {
	compilerOptions {
		target = "es2015"
	}
}
project.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin::class) {
	project.extensions.getByType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec::class).download = false
}
rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin::class.java) {
	rootProject.the<YarnRootExtension>().yarnLockAutoReplace = true
}
fun KotlinDependencyHandler.npmImplementation(packageName: String, version: String = "latest") =
	implementation(npm(packageName, version))