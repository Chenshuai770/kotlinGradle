package com.cs

import java.io.*
import java.nio.CharBuffer

fun main(args: Array<String>) {

    //readlin()
    //readBiteArray()
    //wirteLine()
    //wirteBuffer()
    fileCopy()
}

fun readlin() {
    val file = File("build.gradle")
    val bufferedReader = BufferedReader(FileReader(file))
    var line: String
    while (true) {
        line = bufferedReader.readLine() ?: break
        println(line)
    }
    bufferedReader.close()
}

fun readBiteArray() {
    val file = File("build.gradle")
    val bufferedInputStream = BufferedInputStream(FileInputStream(file))
    val buffer = ByteArray(1024)

    while (bufferedInputStream.read(buffer) != -1) {
        val s = String(buffer)
        println(s)
    }
    bufferedInputStream.close()
}

fun wirteLine() {
    val context = "我是kotlin的中使用的witerLine方法"
    val fileWriter = FileWriter(File("ktWiterLine.txt"))
    fileWriter.write(context)
    fileWriter.close()

}

fun wirteBuffer() {

    val context = "我是kotlin的中使用的writeBuffer方法"
    val bufferedOutputStream = BufferedOutputStream(FileOutputStream(File("ktWiterBuffer.txt")))
    bufferedOutputStream.write(context.toByteArray(), 0, context.toByteArray().size)
    bufferedOutputStream.flush()
    bufferedOutputStream.close()

}


fun fileCopy() {
    val file = File("custom.txt")
    val bufferedReader = file.bufferedReader()

    val copyFile = File("copyKotlin.txt")
    var bufferedWriter = copyFile.bufferedWriter()
    val buffer = CharArray(1024)

    while (bufferedReader.read(buffer) != -1) {
        bufferedWriter.write(buffer, 0, buffer.size)

    }
    bufferedReader.close()
    bufferedWriter.close()

}
