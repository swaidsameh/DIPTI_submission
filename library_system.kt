class Book(val title: String, val author: String, val publicationYear: Int) {
    var isBorrowed: Boolean = false

    init {
        require(publicationYear > 0) { "Publication year must be greater than 0" }
    }

    

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} by ${book.author} added to the library."
    }
}

fun main() {
    val library = Library()

    while (true) {
        println("\nLibrary System Menu:")
        println("1. Add a Book")
        println("2. Display Available Books")
        println("3. Search for Books by Author")
        println("4. Search for Books by Year")
        println("5. Borrow a Book")
        println("6. Return a Book")
        println("0. Exit")

        
