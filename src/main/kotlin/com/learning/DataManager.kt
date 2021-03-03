package com.learning

class DataManager {
    var books = ArrayList<Book>()

    fun gimmeId(): String{
        return books.size.toString()
    }

    fun init(){
        books.add(Book(gimmeId(), "Ho to grow apples", "Mr. Appleton", 100.0f))
        books.add(Book(gimmeId(), "Ho to grow orange", "Mr. Orageton", 90.0f))
        books.add(Book(gimmeId(), "Ho to grow lemons", "Mr. Lemonton", 110.0f))
        books.add(Book(gimmeId(), "Ho to grow hoge", "Mr. Hogeton", 130.0f))
        books.add(Book(gimmeId(), "Ho to grow hogehoge", "Mr. HogeHogeton", 120.0f))
    }

    fun newBook(book: Book) {
        books.add(book)
    }

    fun updateBook(book: Book): Book? {
        val foundbook = books.find{
            it.id == book.id
        }

        foundbook?.title = book.title
        foundbook?.author = book.author
        foundbook?.price = book.price
        return foundbook
    }

    fun deleteBook(book: Book): Book?{
        val bookfound = books.find{
            it.id === book.id
        }
        books.remove(bookfound)
        return bookfound
    }
}
