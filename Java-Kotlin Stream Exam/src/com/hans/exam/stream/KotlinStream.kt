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
        val numbers = listOf<Int>(1, 2, 3, 4, 5)
        numbers.filter { n -> n % 2 == 1 }.forEach { println(it) }
    }

    fun takeExam() {
        val numbers = listOf<Int>(1, 2, 3, 4, 5)
        numbers.take(3).forEach { println(it) }
        println("=========================")
        numbers.takeLast(1).forEach { println(it) }
    }

    fun takeWhileExam() {
        val numbers = listOf<Int>(1, 2, 3, 4, 5)
        println(numbers.takeWhile { it < 3 }) // 작은 것.
        println("=========================")
        println(numbers.takeLastWhile { it > 3 }) // 큰 것
    }

    fun dropExam() {
        val numbers = listOf<Int>(1, 2, 3, 4, 5)
        numbers.drop(2).forEach { println(it) }
        println("=========================")
        numbers.dropWhile { it < 3 }.forEach { println(it) }
        println("=========================")
        numbers.dropLastWhile { it < 3 }.forEach { println(it) }
    }

    fun firstAndLastExam() {
        val numbers = listOf(100, 1, 200, 300, 2, 400, 500)
        println("first: " + numbers.first())
        println("last: " + numbers.last())
    }

    fun distinctExam() {
        val numbers = listOf(100, 1, 200, 100, 2, 400, 500)
        numbers.distinct().forEach {
            print(it)
            print(", ")
        }
        println()
    }

    fun zipExam() {
        val roles = listOf<String>("아빠", "엄마", "첫째", "둘째")
        val priorities = listOf<Int>(4, 1, 2, 3)

        roles.zip(priorities) { role, priority -> role +" => "+ priority }
                .forEach { println(it) }
    }

    fun joinToStringExam() {
        val roles = listOf<String>("아빠", "엄마", "첫째", "둘째")
        println("joinToString: " + roles.joinToString())
    }

    fun countExam() {
        val roles = listOf<String>("아빠빠빠", "엄마", "첫째", "둘째")
        println("count: " + roles.count())
        println("filtered count: " + roles.count { role -> role.length > 2 })
    }

    fun anyAndNoneExam() {
        val roles = listOf<String>("아빠빠빠빠", "엄마", "첫째", "둘째")
        println("any: " + roles.any())
        println("filtered any: " + roles.any { role -> role.length > 2 })
        println("none: " + roles.none())
        println("filtered none: " + roles.none{ role -> role.length < 2})
    }

    fun maxAndMinAndAverageExam() {
        val numbers = listOf(100, 1, 200, 300, 2, 400, 500)
        println("max: " + numbers.max())
        println("min: " + numbers.min())
        println("average: " + numbers.average())
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
    KotlinStream.filterExam()
    println("=========================")
    KotlinStream.takeExam()
    println("=========================")
    KotlinStream.takeWhileExam()
    println("=========================")
    KotlinStream.dropExam()
    println("=========================")
    KotlinStream.firstAndLastExam()
    println("=========================")
    KotlinStream.distinctExam()
    println("=========================")
    KotlinStream.zipExam()
    println("=========================")
    KotlinStream.joinToStringExam()
    println("=========================")
    KotlinStream.countExam()
    println("=========================")
    KotlinStream.anyAndNoneExam()
    println("=========================")
    KotlinStream.maxAndMinAndAverageExam()
    println("=========================")


}