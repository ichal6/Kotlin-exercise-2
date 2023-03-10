fun main(args: Array<String>) {
    val studentStatus = { name: String, auraColour: String -> "$name has a $auraColour face color"}
    println(studentStatus("Mike", "red"))
}
