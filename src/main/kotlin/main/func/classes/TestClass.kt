package main.func.classes

class TestClass {}

class Temporary

//Only when the constructor has a annotation or a visibility modifier, is the keyword "constructor" mandatory
class WithoutConstructor(name: String, age: Int) {}

class WithConstructor constructor(name: String, age: Int) {}

class MandatoryConstructor internal constructor(name: String, age: Int) {}

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

class Person1(firstName: String, lastName: String, age: Int) {}

class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
    get() {
        return if (field.isNullOrBlank()) "no description" else "$field!"
    }

    fun show() {
        println(title)
    }

    override fun toString(): String {
        return "$title - $description"
    }

}


fun main() {
    val course = Course("Kotlin Essential Training..!")
    course.description = "The magic weapon of late 21st century, you should know."
    course.show()
    println(course)
}