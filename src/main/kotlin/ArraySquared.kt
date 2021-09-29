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
 * Complete the 'squareArray' function below.
 *
 * The function is expected to return an IntArray
 * The function accepts IntArrat arr as parameter.
 */

fun squareArray(arr: Array<Int>): Array<Int> {
    if(arr.isEmpty()){
        return arr
    }
    val negativePart = mutableListOf<Int>()
    val positivePart = mutableListOf<Int>()
    var leftCount = 0
    var rightCount = 0
    arr.forEach { num ->
        if (num < 0) {
            leftCount++
            negativePart.add(0, num * num)
        } else {
            rightCount++
            positivePart.add(num * num)
        }
    }
    val res = IntArray(arr.size)
    var tempLeftCount: Int = 0
    var tempRightCount: Int = 0
    var count = 0
    while (tempLeftCount < leftCount && tempRightCount < rightCount) {

        if (negativePart[tempLeftCount] < positivePart[tempRightCount]) {
            res[count] = negativePart[tempLeftCount]
            tempLeftCount++
        } else {
            res[count] = positivePart[tempRightCount]
            tempRightCount++
        }
        count++
    }

    while (tempLeftCount < leftCount) {
        res[count] = negativePart[tempLeftCount]
        tempLeftCount++
        count++
    }
    while (tempRightCount < rightCount) {
        res[count] = positivePart[tempRightCount]
        tempRightCount++
        count++
    }

    return res.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = squareArray(a)

    println(result.joinToString(" "))
}
