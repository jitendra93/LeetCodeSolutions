
// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")




fun main(){
    val res = solution("We test coders. Give us a try?")
    println(res)
}

fun solution(S: String): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val whitespace = "\\s"
    val delimiters = arrayOf(".","?","!")
    val sentenceList = S.split(delimiters = delimiters )
    var maxWords = 0

    sentenceList.forEach { sentence ->
        val wordsInSentence = sentence.split(Regex(whitespace)).filter { it != "" }.size
        maxWords = maxOf(maxWords,wordsInSentence)
    }
    return maxWords
}