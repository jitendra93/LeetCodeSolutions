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



/*
 * Complete the 'sumOfUnique' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun sumOfUnique(arr: Array<Int>): Int {
    val mapOfInt = mutableMapOf<Int,Int>()

    arr.forEach {
        val count = mapOfInt[it]
        mapOfInt[it] = count?.plus(1) ?: 1
    }
    return mapOfInt.filterValues {
        it == 1
    }.keys.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sumOfUnique(a)

    println(result)
}
