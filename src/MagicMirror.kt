fun main(args: Array<String>) {
    var playerName = "Estragon"
    playerName = playerName.reversed()
    println(playerName)

    var drinkMenu = listOf<String>("wine", "mead", "lacroix")
    drinkMenu.forEach{
        print("$it ")
    }
}


