import kotlin.reflect.KType
import kotlin.reflect.typeOf

class Solution {
    fun climbStairs(n: Int): Int {

        var ways = 0
        var r = 0
        while ((n-r) >=0){
            print(" $n  ${(n-r)} $r")
            ways = ways + waysOfThisStep(n,r).also { print(" >$it") }
            r = r +2
            println()
        }
        return ways
    }

    private fun waysOfThisStep(n: Int, r: Int): Int {
        if(r ==0) return 1
        print("-------fact( ${n-r} + ${r/2} ) /( fact(${n-r}) * fact ${r/2})")
        var numerator = (n-r)+(r/2)
        var denom1 = n-r
        var denom2 = r/2
        var res = 1
        if(denom1 > denom2){
            while (numerator > denom1){
                res = res * numerator
                numerator--
            }
            while (denom2>1){
                res = res / denom2
                denom2--
            }
        }else{
            while (numerator > denom2){
                res = res * numerator
                numerator--
            }
            while (denom1>1){
                res /= denom1
                denom1--
            }
        }
//        return fact((n-r)+(r/2))/(fact(n-r)*fact(r/2))
        return res
    }
}
fun main() {
    val n = 6
    val res = Solution().climbStairs(n)
    println(res)
    println(fibo(n))

}

fun fact(n : Int) : Int {
    if( n == 0 || n ==1 )
        return 1
    else return (n * fact(n-1))
}

fun fibo(n : Int ) : Int{
    /*if (n == 1)
        return 1
    else if(n == 2)
        return 2
    else return fibo(n-1) + fibo(n-2)*/
    var a = 0
    var b = 1
    var res = 1
    var i = 0
    while (i < n){
        res = a + b
        a= b
        b = res
        i++
    }
    return res
}


