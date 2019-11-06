package com.gmail.wmilosz88.pythonSyntax

fun blockCode(code: String): String {
    var currentIndent = 0

    return code.split('\n')
        .filter { it.length != 0 }
        .map {
            var ret = it

            if (ret.indent() < currentIndent) {
                ret = "}$ret"
            }

            if (ret[ret.lastIndex] == ':') {
                ret = ret.slice(0..ret.length-2) + "{"
            }

            currentIndent = it.indent()
            ret
        }.joinToString("\n") + '}'
}
