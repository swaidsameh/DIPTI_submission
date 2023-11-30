fun main() {
    println("Enter the student's score:")
    val score = readLine()?.toDoubleOrNull()

    if (score != null) {
        val grade = calculateGrade(score)
        println("Grade: $grade")
    } else {
        println("Invalid input. Please enter a valid numeric score.")
    }
}

fun calculateGrade(score: Double): String {
    return when {
        score >= 90.0 -> "A"
        score >= 80.0 -> "B"
        score >= 70.0 -> "C"
        score >= 60.0 -> "D"
        else -> "F"
    }
}
