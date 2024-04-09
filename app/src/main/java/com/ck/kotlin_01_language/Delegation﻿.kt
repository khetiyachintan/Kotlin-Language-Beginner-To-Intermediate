package com.ck.kotlin_01_language

import kotlin.properties.Delegates

/*======================================================================== */

interface Downloader {
    fun download()
}

interface Player {
    fun play()
}

class FileDownloader(private var file: String) : Downloader {
    override fun download() {
        println("$file is Downloaded!")
    }
}

class FilePlayer(private var file: String) : Player {
    override fun play() {
        println("$file is Playing!")
    }
}

class MediaFile(
    private val downloader: Downloader, private val player: Player
) : Downloader, Player {
    override fun download() {
        println("calling this 1!")
        downloader.download()
    }

    override fun play() {
        println("calling this 2!")
        player.play()
    }
}
/*======================================================================== */

fun main() {
    val file = "song.mp3"
    val mp = MediaFile(FileDownloader(file), FilePlayer(file))
    mp.download()
    mp.play()

    // Lazy
    val str: String by lazy {
        "ohf...I am Lazy :( ! i.e. I am only assigned when you access me the first time! "
    }
    println("Hey, Please call me now $str")


    // Observable properties
    val user = User()
    user.name = "first"
    user.name = "second"

    // typealias
    val obj1: AInner
    val obj2: BInner
}

/*======================================================================== */
// Takes two arguments: the initial value and a handler for modifications.
class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
}
/*======================================================================== */

/*Type aliases provide alternative names for existing typealias */
typealias AInner = Hello.HelloInner
typealias BInner = World.WorldInner

class Hello {
    inner class HelloInner
}

class World {
    inner class WorldInner
}

/*======================================================================== */
