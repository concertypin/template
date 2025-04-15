@file:OptIn(ExperimentalJsExport::class)

actual fun platform() = "Javascript"
@JsExport
@JsName("mainKt")
fun main() {
	console.log("Hello from ${platform()}!")
}
