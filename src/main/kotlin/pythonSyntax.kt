package com.gmail.wmilosz88.pythonSyntax

import java.io.File

fun insert(code: String): String = code.split('\n').map {
    var transformed = code
    // if (it[0] == "#") code

    transformed
}.joinToString("\n")

fun String.indent(): Int {
    var indent = 0
    for (letter in this) {
        if (letter.isWhitespace())
            indent++
        else
            break
    }

    return indent
}

fun pythonSyntax(code: String, insertSemi: Boolean = true): String {
    var transformCode = code.split('\n')
        .filter { it.length != 0 }
        .map {
            if (it[it.lastIndex] == ':') {
                println(it.indent())
                it.slice(0..it.length-2) + "{"
            } else {
                it
            }
        }

    // println(transformCode.joinToString("\n"))
    // transformCode: String = if (insertSemi) insert(transformCode) else transformCode

    return " "
    // return transformCode
}
