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
 * Complete the 'replaceStringPattern' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING inputStr
 *  2. STRING pattern
 *  3. STRING replaceStr
 */

fun replaceStringPattern(inputStr: String, pattern: String, replaceStr: String): String {

    var result = inputStr
    while (result.contains(pattern)){
        result = result.replace(pattern,replaceStr)
    }
    return result
}

fun main(args: Array<String>) {
    val inputStr = readLine()!!

    val pattern = readLine()!!

    val replaceStr = readLine()!!

    val result = replaceStringPattern(inputStr, pattern, replaceStr)

    println(result)
}
