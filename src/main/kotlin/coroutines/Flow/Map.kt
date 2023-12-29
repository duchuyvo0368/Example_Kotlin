package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking


//map cho nguon phat->bien doi gia tri->nguon thu
//khong bo qua gia tri hoac emit
fun main()= runBlocking {
    (1..3).asFlow().map {
        it*it
    }.collect { value-> println(value) }

}