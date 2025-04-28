package org.example.lesson1

fun main() {
    val secondsInSpace: Int = 6480
    val hours: Int = secondsInSpace / 3600
    val remainingSecondsAfterHours: Int = secondsInSpace % 3600
    val minutes: Int = remainingSecondsAfterHours / 60
    val seconds: Int = remainingSecondsAfterHours % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}

