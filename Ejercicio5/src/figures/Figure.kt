package figures

abstract class Figure(val tipo:String){
    abstract fun area():Double

    companion object {
        fun areas(figures: List<Figure>) {
            var result: Double = 0.0
            figures.forEach { result+=(it.area()) }
        }
        fun areArchenemy(fig1: Figure, fig2: Figure) = fig1.tipo == fig2.tipo
    }
}