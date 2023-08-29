package inheritance

open class Shape{
    open val vertexCount:Int=0
    open fun draw(){

    }
    fun fill(){

    }
}
class Circle(): Shape() {
    override val vertexCount: Int=4

    override fun draw() {
        super.draw()
    }

}