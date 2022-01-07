

fun main(){
    val res = solution2("photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
            "john.png, London, 2015-06-20 15:13:22\n" +
            "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
            "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
            "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
            "BOB.jpg, London, 2015-08-05 00:02:03\n" +
            "notredame.png, Paris, 2015-09-01 12:00:00\n" +
            "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
            "a.png, Warsaw, 2016-02-13 13:33:50\n" +
            "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
            "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
            "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
            "e.png, Warsaw, 2016-01-02 09:49:09\n" +
            "f.png, Warsaw, 2016-01-02 10:55:32\n" +
            "g.jpg, Warsaw, 2016-02-29 22:13:11")

    println(res)
}

data class Photo(val index : Int, val photoName : String, val extension : String, val city : String, val date : String
)
fun solution2(S: String): String {
    // write your code in Kotlin 1.3.11 (Linux)


    var entries = mutableListOf<Photo>()
   val photos = S.split("\n").mapIndexed { i, it ->
       val rawPhoto = it.split(",")
       val photoNameSplit = rawPhoto[0].split(".")
       Photo(i, photoNameSplit[0],photoNameSplit[1],rawPhoto[1],rawPhoto[2])
   }
    photos.groupBy {
        it.city
    }.map { entriesMappedToCity ->
        entries.addAll(entriesMappedToCity.value.sortedBy {
            it.date
        })
    }

    entries.sortBy { it.index }
    var res = ""
    entries.forEach {
        res+= it.photoName+"."+it.extension+"\n"
    }

    return res
}

