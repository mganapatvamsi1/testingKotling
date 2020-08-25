package main.func.classes


class Student(val firstName: String, val lastName: String, val grade: Int) {
    override fun toString(): String {
        return "($firstName $lastName $grade)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Student) {
            return lastName == other.lastName &&
                    firstName == other.firstName &&
                    grade == other.grade
        }
        return false
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + grade
        return result
    }

}

data class Kid(val firstName: String, val lastName: String, val grade: Int)


fun main() {
    val students = mutableListOf<Student>(
        Student("raj", "malhotra", 10),
        Student("raj", "malhotra", 10),
        Student("betty", "aryan", 12)
    )
    println()
    println(students[0])
    println(students[2])
    println()

    println("Does ${students[0]} == ${students[1]}: ${students[0] == students[1]}") //false
    //Note: Kotlin would consider 2 objects as identical only if they both reference same memory location.
    // However, we can use the equals method to

    val kids = mutableListOf<Kid>(
        Kid("raj", "malhotra", 10),
        Kid("raj", "malhotra", 10),
        Kid("betty", "aryan", 12)
    )

    println("Does ${kids[0]} == ${kids[1]}: ${kids[0] == kids[1]}") //true
    println()

    val charlie = kids[0].copy(firstName = "charlie")
    kids.add(charlie)
    println()

    for (kid in kids) {
        println(kid)
    }


}