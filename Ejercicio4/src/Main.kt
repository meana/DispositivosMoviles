import model.Coach
import model.Player
import model.Team

fun main(args: Array<String>) {
    val coach = Coach("Luis Enrique")
    val team = Team("Selección Española", coach)
    team.addPlayer(Player("De Gea", 1))
    team.addPlayer(Player("Azpilicueta", 14))
    team.addPlayer(Player("Sergio Ramos", 15))
    team.addPlayer(Player("Alba", 19))
    team.addPlayer(Player("Morata", 23))
    println(team)
}