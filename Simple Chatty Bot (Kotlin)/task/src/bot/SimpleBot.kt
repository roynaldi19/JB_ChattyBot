package bot

fun main() {
    hello("Aid", 2020)

}

fun hello(name: String, created: Int) {
    return println("""Hello! my name is $name.
        |I was created in $created
    """.trimMargin())
}
