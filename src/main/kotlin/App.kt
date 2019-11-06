package com.gmail.wmilosz88.pythonSyntax

import java.io.File

fun File.readAll(): String {
    var content = ""

    this.forEachLine {
        content += it + "\n"
    }

    return content
}

fun save(directory: String, fileName: String, content: String) {
    File(directory).mkdir()

    val file =  File("$directory/$fileName")
    file.createNewFile()
    file.writeText(content)
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
        save("output", fileName.let { it.split("/", "\\").last() }, transformed)
    } catch(e: Exception) {
        println(e)
    }
}
