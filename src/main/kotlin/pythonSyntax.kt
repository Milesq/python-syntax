package com.gmail.wmilosz88.pythonSyntax

fun insert(code: String): String = code

fun pythonSyntax(code: String, insertSemi: Boolean = true): String {
    var transformCode: String = if (insertSemi) insert(code) else code

    return code
}
