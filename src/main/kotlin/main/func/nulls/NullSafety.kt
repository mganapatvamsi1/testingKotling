package main.func.nulls

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils


class Services {
    fun evaluate() {
        println("testing super class")
    }
}

class ServiceProvider {
    fun createServices(): Services? {
        TODO("to be implemented")
    }
}

fun main(args: Array<String>) {
    val message: String? = null

    println(message?.length)

    val serviceProvider = PolicyUtils.ServiceProvider()
    println(serviceProvider.createServices()?.evaluate())
    val csp = createsServiceProvider()
   println(csp?.createServices()?.evaluate())

}

fun createsServiceProvider(): PolicyUtils.ServiceProvider? = PolicyUtils.ServiceProvider()