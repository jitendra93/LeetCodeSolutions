

fun IntArray.prettyPrint() {
    val a = Int
    println("[${this.joinToString(",")}]")
}


infix fun Int.times(s : CharSequence): CharSequence{
    return s.repeat(this)
}
//Use like val twoAs = 2 times "A
