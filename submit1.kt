fun compareAges(Richi: Int,Purno: Int, Jerine: Int){
    if (Purno > Richi && Purno > Jerine) {
        println("Purno in elder then Richi and Jerine")
    } else if (Jerine > Purno && Jerine > Richi) {
        println("Jerine in elder then Richi and Purno")
    } else if (Richi > Purno && Richi > Jerine) {
        println("Richi is elder then Purno & Jerine")
    } else {
        println("all are equal")
    }
}

fun main(args:Array<String>){
    val Richi = 23
    val Purno = 24
    val Jerine = 22

    compareAges(Richi, Jerine, Purno)
