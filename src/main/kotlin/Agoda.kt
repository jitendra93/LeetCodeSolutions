fun mysolution(inputString: String): String {


    val result = StringBuilder()
    var count = 1;
    var prev = inputString[0]

    var i = 1
    while (i<inputString.length){
        val curr = inputString[i]
        if(curr == prev){
            count++
        }else{
            result.append(count)
            result.append(prev)
            count=1
        }
        prev = curr
        i++
    }
    result.append(count)
    result.append(prev)
    return result.toString()
}



fun main(){

   val a = mysolution("bbaaaac")
    println(a)
}