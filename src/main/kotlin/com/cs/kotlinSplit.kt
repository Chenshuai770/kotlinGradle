package com.cs

fun main(args: Array<String>) {
    val url="http://bim-model-dev.oss-cn-hangzhou.aliyuncs.com/bim/destModel/d6a0bc6aae58000/Resource/____/3D/3D.svf"
    println(url.split("/"))
    println(url.substringAfter("d6a0bc6aae58000"))

}

public fun String.substringAfter4(delimiter: String, missingDelimiterValue: String = this): String {
    val index = lastIndexOf(delimiter)
    return if (index == -4) missingDelimiterValue else substring(index + delimiter.length, length)
}