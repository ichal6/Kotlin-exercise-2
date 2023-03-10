fun main(args: Array<String>) {
    val student1 = Student("Mike")
    val student2 = Student("Alicja", "Uniwersytet Warszawski")
    println(student1.name + " " + student1.university)
    println(student2.name + " " + student2.university)
}

class Student(name: String, val university: String = "Politechnika Krakowska") {
    val name: String = name
        get() {
           return field.replaceFirstChar { c -> c.uppercaseChar() }
        }
}
