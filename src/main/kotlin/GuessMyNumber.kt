import java.util.*

fun main(args: Array<String>) {
    val nombreAuHasard = Random().nextInt(101)
    var pasTrouve = true
    while(pasTrouve) {
        println("Choisis un nombre entre 0 et 100")
        val nombreEssaye = readLine()!!.toInt()
        when {
            nombreEssaye < nombreAuHasard -> println("plus")
            nombreEssaye > nombreAuHasard -> println("moins")
            else -> pasTrouve = false
        }
    }
    println("OK")
}

