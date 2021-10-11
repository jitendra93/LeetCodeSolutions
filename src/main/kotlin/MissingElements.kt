import java.io.*;
import java.util.*
import java.text.*
import java.math.*
import java.util.regex.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val a = arrayOf<Int>(10,12,11,15)
    val low = 10
    val high = 15


    var i = low
    while(i <= high){
        if(!a.contains(i)){
            println(i)
        }
        i++
    }

}

