fun main(args: Array<String>) {
    val person = Person("Mike")
    val student = Student("Alicja", "Uniwersytet Warszawski")
    person.showPerson()
    student.showStudent()
}

class Student(private val name: String, private val university: String = "Politechnika Krakowska") : Person(name) {
    fun showStudent() {
        println( name.replaceFirstChar { c -> c.uppercaseChar() } + " " + university )
    }
}

open class Person(private val name: String) {
    fun showPerson() {
        println(name.replaceFirstChar { c -> c.uppercaseChar() })
    }
}
