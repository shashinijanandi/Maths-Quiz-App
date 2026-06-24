package com.example.mathsquiz

data class question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)