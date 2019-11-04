package com.gmail.wmilosz88.pythonSyntax

fun insertSemicolons(code: String): String = code.split('\n').map {
    if (it[0] == '#') it
    else it + ";"
}.joinToString("\n")
