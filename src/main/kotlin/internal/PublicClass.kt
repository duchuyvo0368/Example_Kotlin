package internal

import internal.packi.InternalClass

class PublicClass {
    public fun PublicFunction() {
        val internalClass= InternalClass()
        println(internalClass)
    }
}