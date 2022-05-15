
fun main(arg: Int){

    val season = when (arg) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Зима"
    }

    print(season)
}