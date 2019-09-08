package yeh.pratice.leetcode.kotlin

import java.util.*

class IntegerToRoman {
    fun intToRoman(num: Int): String {
        var roman: String
        val list = ArrayList<String>()
        if (num in 4000..0)
            return "outOfBounds"
        if (num / 1000 != 0) {
            when (num / 1000) {
                1 -> list.add("M")
                2 -> for (i in 0..1) {
                    list.add("M")
                }

                3 -> {
                    for (i in 0..2) {
                        list.add("M")
                    }
                }
            }
        }
        val hun = num % 1000 / 100
        if (hun != 0) {
            if (hun < 5) {
                when (hun) {
                    1 -> list.add("C")
                    2 -> {
                        list.add("C")
                        list.add("C")
                    }
                    3 -> {
                        list.add("C")
                        list.add("C")
                        list.add("C")
                    }
                    4 -> {
                        list.add("C")
                        list.add("D")
                    }
                }
            }
            if (hun in 5..9) {
                when (hun) {
                    5 -> list.add("D")
                    6 -> {
                        list.add("D")
                        list.add("C")
                    }
                    7 -> {
                        list.add("D")
                        list.add("C")
                        list.add("C")
                    }
                    8 -> {
                        list.add("D")
                        list.add("C")
                        list.add("C")
                        list.add("C")
                    }
                    9 -> {
                        list.add("C")
                        list.add("M")
                    }
                }
            }
        }
        val ten = num % 1000 % 100 / 10
        if (ten in 1..4) {
            when (ten) {
                1 -> list.add("X")
                2 -> {
                    list.add("X")
                    list.add("X")
                }
                3 -> {
                    list.add("X")
                    list.add("X")
                    list.add("X")
                }
                4 -> {
                    list.add("X")
                    list.add("L")
                }
            }
        }
        if (ten in 5..9) {
            when (ten) {
                5 -> list.add("L")
                6 -> {
                    list.add("L")
                    list.add("X")
                }
                7 -> {
                    list.add("L")
                    list.add("X")
                    list.add("X")
                }
                8 -> {
                    list.add("L")
                    list.add("X")
                    list.add("X")
                    list.add("X")
                }
                9 -> {
                    list.add("X")
                    list.add("C")
                }
            }
        }
        val one = num % 1000 % 100 % 10
        if (one != 0) {
            if (one < 4) {
                for (i in 0 until one)
                    list.add("I")
            }
            if (one == 4) {
                list.add("I")
                list.add("V")
            }
            if (one in 5..9) {
                when (one) {
                    5 -> list.add("V")
                    6 -> {
                        list.add("V")
                        list.add("I")
                    }
                    7 -> {
                        list.add("V")
                        list.add("I")
                        list.add("I")
                    }
                    8 -> {
                        list.add("V")
                        list.add("I")
                        list.add("I")
                        list.add("I")
                    }
                    9 -> {
                        list.add("I")
                        list.add("X")
                    }
                }
            }
        }
        roman = list.toString()
        roman = roman.substring(1, roman.length - 1)
        roman = roman.replace("\\s+".toRegex(), "")
        roman = roman.replace(",".toRegex(), "")




        return roman


    }
}