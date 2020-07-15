package com.hans.codeinginterview

    fun main(args: Array<String>) {
        println(calculate(5))
        println(calculate(1))
    }

    fun calculate(count:Int ): List<Int> {
        val result: ArrayList<Int> = arrayListOf(0, 1)

        if (count <= 2) return result

        sumElement(result, result[0], result[1], count )

        return result
    }

    private fun sumElement(result: ArrayList<Int>, prevNum: Int, postNum: Int, maxCount: Int) {
        val sum = prevNum + postNum
        result.add(sum)

        if (result.size == maxCount) return

        sumElement(result, postNum, sum, maxCount)
    }
