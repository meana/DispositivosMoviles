package model

class Team(val name: String, val coach: Coach ?= null, val players: MutableList<Player> = mutableListOf()) {

    fun addPlayer(player: Player) {
        players.add(player)
    }

    override fun toString(): String {
        var str = "Nombre: $name\n Coach:\n\t${coach ?: "No tiene"}\n Players:\n"
        players.forEach { str += "\t$it\n" }
        return str
    }
}