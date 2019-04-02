package model

class Player(val name: String, val number: Int) {

    override fun toString(): String {
        return "Nombre: $name - Número: $number"
    }
}