package com.gmail.wmilosz88.pythonSyntax

val statements = arrayOf("catch", "if", "switch", "while", "for")

fun wrapStatements(code: String): String {
    var skip = false

    return code.split("\n").map {
        it.split(" ").map statements@{ el ->
            if (skip) {
                println("skip")
                return@statements " "
            }
            val statement = statements.find { it == el }

            if (statement != null) {
                skip = true
                val line = it.trimEnd().let {
                    if (it.last() == ':') it.dropLast(1)
                    else it
                }

                val beg = line.indexOf(statement) + statement.length

                "$statement (${line.slice(beg..line.lastIndex)})"
            } else {
                el
            }
        }.joinToString(" ").also { skip = false }
    }.joinToString("\n")
}
