package com.hans.exam.stream

object KotlinStream {
    fun mapExam() {
        val fruits = listOf<String>("사과", "수박", "참외", "멜론")
        fruits.map { fruit -> "가지고 있는 과일은 ? = " + fruit }.forEach{println(it)}
    }

    fun mapIndexedExam() {
        val numbers = 0..10
        numbers.mapIndexed{ index, number -> index * number }.forEach { println(it) }

        val fruits = listOf<String>("사과", "수박", "참외", "멜론")
        fruits.mapIndexed { index, fruit -> fruit + "=" + index }.forEach { println(it) }
    }

    fun mapNotNullExam() {
        val fruits = listOf<String>("사과", "수박", "참외", "멜론")
        fruits.mapNotNull { fruit -> if (fruit == "수박") null else fruit }.forEach { println(it) }
    }

    fun flatMapExam() {
        val numbers = 0..10
        numbers.flatMap { number -> 1..number }.forEach { print(it) }
    }

    fun groupByExam() {
        val fruits = listOf<String>("사과", "수박", "귤", "멜론")
        fruits.groupBy { fruit -> if (fruit.length == 1) "한글자" else "두글자" }
                .forEach { key, fruit -> println("key=$key, fruit=$fruit") }
    }

    fun filterExam() {

    }
}

fun main(args: Array<String>) {
    KotlinStream.mapExam()
    println("=========================")
    KotlinStream.mapIndexedExam()
    println("=========================")
    KotlinStream.mapNotNullExam()
    println("=========================")
    KotlinStream.flatMapExam()
    println("\n=========================")
    KotlinStream.groupByExam()
    println("=========================")
    println("=========================")
    println("=========================")
    println("=========================")
    println("=========================")
    println("=========================")


}