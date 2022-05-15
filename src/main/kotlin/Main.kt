
fun main(arg: String){
    val monthNumber = arg.trim().toInt()

    val season = when (monthNumber) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Зима"
    }

    print(season)
}