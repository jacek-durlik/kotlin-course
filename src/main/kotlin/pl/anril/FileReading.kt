package pl.anril

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream
import java.util.Scanner

fun main() {
    val lines = File("testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    hr()
    val scanner = Scanner(File("testfile.txt"))
    while (scanner.hasNextLine()) {
        println(scanner.nextLine())
    }

    hr()
    val use = File("testfile.txt").reader().use { it.readText() }
    println(use)

    // Binary file
    hr()
    val di = DataInputStream(FileInputStream(File("testfile.bin")))
    var si: String
    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }

}