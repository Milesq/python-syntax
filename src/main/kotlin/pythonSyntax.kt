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

fun pythonSyntax(code: String, insertSemi: Boolean = true): String {
    val transformCode = blockCode(code)
    return if (insertSemi) insertSemicolons(transformCode) else transformCode
}
