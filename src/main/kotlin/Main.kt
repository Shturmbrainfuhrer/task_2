fun main() {
    val likes = 21
    val result = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
    println("Понравилось $likes $result")
}