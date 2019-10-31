package com.gmail.wmilosz88.pythonSyntax

import java.io.File

fun File.readAll(): String {
    var content = ""

    this.forEachLine {
        content += it + "\n"
    }

    return content
}

fun main(args: Array<String>) {
    try {
        val switches = args.filter { it[0] == '-' }.map { it.trim('-') }
        val fileName = args.find { it[0] != '-' } ?: throw Exception("Expected filename!")

        val content = File(fileName)

        if (!content.exists()) {
            throw Exception("File not exists!")
        }

        val transformed = pythonSyntax(content.readAll(), switches.find { it == "no-semi" } == null)
        println(transformed)
    } catch(e: Exception) {
        println(e)
    }
}
