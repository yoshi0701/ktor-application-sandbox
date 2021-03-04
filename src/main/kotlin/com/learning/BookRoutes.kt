package com.learning

import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.put
import io.ktor.routing.post
import io.ktor.routing.delete
import io.ktor.routing.route

fun Route.books() {
    val dataManager = DataManager()
    route("/book"){
        get ("/") {
            call.respond(dataManager.allBooks())
        }

        post("/{id}"){
            val id = call.parameters.get("id")
            val book = call.receive(Book::class)
            val updatedbook = dataManager.updateBook(book)
            call.respondText { "The book has been update $updatedbook" }
        }

        put("") {
            val book = call.receive(Book::class)
            val newbook = dataManager.newBook(book)
            call.respond(newbook)
        }

        delete("/{id}"){
            val id = call.parameters.get("id").toString()
            val deletebook = dataManager.deleteBook(id)
            call.respond(deletebook)
        }
    }
}
