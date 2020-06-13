package com.hans.jk.example

object KotlinSortExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val dt0 = DateTime(2000, 1, 2)
        val dt1 = DateTime(1999, 12, 31)
        val dt2 = DateTime(2020, 6, 30)
        val dt3 = DateTime(2021, 3, 4)
        val dt4 = DateTime(2020, 3, 30)
        val dateTimes = listOf<DateTime>(dt0, dt1, dt2, dt3, dt4)

        dateTimes.sortedBy { it.year }.forEach { println(it) }
        println("===============================================")
        dateTimes.sortedByDescending { it.year }.forEach { println(it) }
        println("===============================================")
        dateTimes.sortedWith(compareBy { it.year }).forEach { println(it) }
        println("===============================================")
        dateTimes.sortedWith(compareByDescending { it.year }).forEach { println(it) }
        println("===============================================")
        dateTimes.sortedWith(compareBy<DateTime> { it.year }.thenByDescending {it.month}).forEach { println(it) }
    }
}

data class DateTime (
    var year: Int? = null,
    var month: Int? = null,
    var day: Int? = null
)