


fun main(){

  /*  val res = solution(
            A= arrayOf(100,100,100,-10).toIntArray(),
            D= arrayOf("2020-12-31","2020-12-22","2020-12-03","2020-12-29")
    )*/

    /*val res = solution(
            A= arrayOf(180,-50,-25,-25).toIntArray(),
            D= arrayOf("2020-01-31","2020-01-22","2020-01-03","2020-01-29"))
    */
    val res = solution(
            A= arrayOf(1,-1,0,-105,1).toIntArray(),
            D= arrayOf("2020-12-31","2020-04-22","2020-04-03","2020-04-29","2020-07-21"))

    println(res);
}

fun solution(A: IntArray, D: Array<String>): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val totalIncome = A.sum()
    val monthlyEntries = D.map { it.substring(0, it.length - 3) }
    val numberOfMonthsExempted = monthlyEntries.zip(A.toList()).
            groupBy {
               it.first
            }.filter { monthlyMap ->
                monthlyMap.value.filter { it.second <0 }.size > 2
    }.filter { monthlyMap ->
        val expenditure = expenditureForAMonth(monthlyMap)
        expenditure <= -100
    }.size
    val fee = (12 - numberOfMonthsExempted) * 5

    return totalIncome - fee
}

private fun expenditureForAMonth(monthlyMap: Map.Entry<String, List<Pair<String, Int>>>): Int {
    val entries = monthlyMap.value
    return entries.filter {
        it.second < 0
    }.map {
        it.second
    }.sum()
}

























