package com.gmail.wmilosz88.pythonSyntax

import java.io.File

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

fun pythonSyntax(code: String, insertSemi: Boolean = true): String =
    blockCode(code)
        .let { wrapStatements(it) }
        .let { if (insertSemi) insertSemicolons(it) else it }

