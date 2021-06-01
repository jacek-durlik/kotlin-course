package pl.anril.textadventure

data class Location(val locationID: Int, val description: String) {
    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destinationId: Int) {
        exits[direction] = destinationId;
    }
}