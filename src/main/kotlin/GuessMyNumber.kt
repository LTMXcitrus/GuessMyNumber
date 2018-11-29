import java.util.*

fun main(args: Array<String>) {
    val randomNumber = Random().nextInt(101)
    var notFound = true
    while(notFound) {
        println("Choisis un nombre entre 0 et 100")
        val chosenNumber = readLine()!!.toInt()
        when {
            chosenNumber < randomNumber -> println("plus")
            chosenNumber > randomNumber -> println("moins")
            else -> notFound = false
        }
    }
    println("OK")
}

