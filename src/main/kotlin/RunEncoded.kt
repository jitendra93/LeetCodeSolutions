import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun runLengthEncoded(arr: Array<Int>): Array<Int> {
    var i = 1
    var size = 0
    while (i<arr.size){
        size += arr[i]
        i+=2

    }
    val res = IntArray(size)
    i=0
    var resCount = 0
    while (i<arr.size){
        val value = arr[i]
        val freq = arr[i+1]
        var count = 0
        while (count < freq){
            res[resCount] = value
            count++
            resCount++
        }
        i+=2
    }
    return res.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = runLengthEncoded(a)

    println(result.joinToString(" "))
}