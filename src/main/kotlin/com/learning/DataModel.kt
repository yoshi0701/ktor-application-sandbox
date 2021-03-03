package com.learning

data class Book(var id: String, var title: String, var author: String, var price: Float)
data class ShoppingCart(var id: String, var userid: String, val items: ArrayList<ShoppingItem>)
data class ShoppingItem (var bookid: String, var qty: Int)
data class User(var id: String, var name: String, var username: String, var password: String)



