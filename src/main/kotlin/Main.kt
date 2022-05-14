
fun main(arg: String){

    val season = when (arg.toInt()) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Зима"
    }

    println(season)
}