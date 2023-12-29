package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking


//transform bien doi gia tri phat ra truoc khi emit nhan nguon thu
//cho phep bo qua va emit
fun main()= runBlocking {
    (1..9).asFlow().transform {
        if (it % 2 == 0) {
            emit(it * it)
            emit(it * it * it)
        }
    }.collect {response-> println(response) }
}
