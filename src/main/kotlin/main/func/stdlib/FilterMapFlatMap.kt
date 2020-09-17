package main.func.stdlib

data class Track(val title: String, val durationInSeconds: Int)

data class Album(
    val title: String, val year: Int, val chartUK: Int,
    val chartUS: Int, val tracks: List<Track> = listOf()
)

val albums = listOf(
    Album(
        "The dark side of the moon", 1973, 2, 1,
        listOf(
            Track("Speak to me", 90),
            Track("Breathe", 163),
            Track("On the run", 216),
            Track("Time", 421),
            Track("The great gig in the sky", 276),
            Track("Money", 382),
            Track("Us and them", 462),
            Track("Any color you like", 205),
            Track("Brain Damage", 228),
            Track("Eclipse", 126),
            Track("Lunar Particle", 358)
        )
    ),
    Album("The wall", 1979, 3, 1),
    Album("Wish you were here", 1975, 1, 2),
    Album("Animals", 1977, 2, 3),
    Album("The piper at the gates of dawn", 1967, 6, 131),
    Album("The final cut", 1983, 1, 6),
    Album("Meddle", 1971, 3, 70),
    Album("Atom Heart Mother", 1970, 1, 55),
    Album("Ummagumma", 1969, 5, 74),
    Album("A Sauceful of Secrets", 1968, 9, 0),
    Album("More", 1969, 9, 153)
)

fun albumAndTrackLowerThanXSeconds(durInSecs: Int, albums: List<Album>): List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < durInSecs
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun main(args: Array<String>) {
    for (album in albums) {
        if (album.chartUK == 1) {
            println("Found : ${album.title}")
        }
    }
    println()
    println()
//    albums.forEach { album -> if (album.chartUK == 1) println("Found -- ${album.title}") }
    albums.forEach { if (it.chartUK == 1) println("Found -- ${it.title}") }
    println()
    println()
//    albums.filter { album -> album.chartUK == 1 }.map { album -> println("Found .... ${album.title}") }
    albums.filter { it.chartUK == 1 }.map { println("Found .. ${it.title}") }
    println()
    println()
    albums.filter { it.chartUK == 1 }.forEach { println("Found .... ${it.title}") }
    println()
    println()
    albums.filter { it.chartUK == 1 }.map { it.title }.forEach { println(it) }
    println()
    println()
    albums.filter { it.chartUK == 1 }.map { Pair(it.title, it.year) }.forEach { println(it) }
    println()
    println()
    albumAndTrackLowerThanXSeconds(200, albums).forEach {
        println(it.second)
    }
}