package figures

class Square(val with: Double, val height: Double): Figure("Square"){
    override fun area(): Double {
        return with*height
    }

}

