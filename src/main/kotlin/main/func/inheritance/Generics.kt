package main.func.inheritance

interface GenericRepository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}


fun main() {
    val customerRepo = CustomerGenericRepository<Customer>()
    customerRepo.getById(100)
    customerRepo.getAll()
}