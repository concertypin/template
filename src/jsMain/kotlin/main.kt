import express.Express

fun main() {
	val app = Express()
	app.get("/") { _, res ->
		res.status(200).send("Oh, hi!")
	}
	app.listen(port = 1080) {
		println("Server is running on port 1080")
	}
}