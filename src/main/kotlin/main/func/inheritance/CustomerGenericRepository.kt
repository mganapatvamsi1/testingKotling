package main.func.inheritance

class CustomerGenericRepository<T>: GenericRepository<T> {
    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}


class MyRepo: Repo {
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <T> getAll(): List<T> {
        TODO("Not yet implemented")
    }

}
