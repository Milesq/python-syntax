package com.gmail.wmilosz88.pythonSyntax

fun blockCode(code: String): String {
    return code.split('\n')
        .filter { it.length != 0 }
        .map {
            if (it[it.lastIndex] == ':') {
                println(it.indent())
                it.slice(0..it.length-2) + "{"
            } else {
                it
            }
        }.joinToString("\n")
}
