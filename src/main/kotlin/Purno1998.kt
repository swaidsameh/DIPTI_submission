fun isLeapYear(year: Int): Boolean {
    return (year % 4 ==0 && year %100 != 0) || (year % 400 == 0)
}
fun main () {
    println("Entar a year:")
    var yearToCheck = readLine()?.toIntOrNull()

    if (yearToCheck != null) {
        if (isLeapYear(yearToCheck)) {
            println("$yearToCheck is a Leap Year.")
        } else {
            println("$yearToCheck is not a leap year.")
        }
    } else {
        println("Invalid input. Please enter a valid year.")
    }
}