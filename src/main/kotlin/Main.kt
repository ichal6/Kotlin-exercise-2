fun main(args: Array<String>) {
    val student: Student = Student();
    println(student.name)
}

class Student {
    val name = "Mike"
        get() {
           return field.replaceFirstChar { c -> c.uppercaseChar() }
        }
}
