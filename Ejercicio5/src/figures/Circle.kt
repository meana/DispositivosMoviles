package figures

class Circle(val radio: Double): Figure("Circle"){
    override fun area(): Double {
        return radio*radio*Math.PI
    }
}