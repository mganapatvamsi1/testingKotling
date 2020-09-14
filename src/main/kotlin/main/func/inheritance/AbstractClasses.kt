package main.func.inheritance

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.not().toString()
    }
}

data class AbstractClasses(val text: String): StoredEntity() {
    override fun store() {
        println("testing")
    }
}

fun main(args: Array<String>) {
    val storedEntity = AbstractClasses("rajAryan")
    println(storedEntity)
    println(storedEntity.isActive)
    println(storedEntity.status())

}