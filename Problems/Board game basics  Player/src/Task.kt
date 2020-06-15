class Player(val id: Int, val name: String, val hp: Int) {
    companion object Properties {
        fun create(name: String): Player {
            var ID = 0
            ID += 1
            val player = Player(ID, name, 100)
            return player
        }
    }
}