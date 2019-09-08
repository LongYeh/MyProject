package yeh.pratice.leetcode.kotlin

fun main() {
    val test=RomanToInteger();
    var answer=test.romanToInt("MM");
    print(answer)

}

class RomanToInteger{
    fun romanToInt(s: String): Int{
        s.toUpperCase();
    val chars = s.toCharArray()
    var integer:Int=0;
    for (i in chars.indices) {
        //尾數4和9的判斷
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'V') {
                integer -= 1
                continue
            }
        }
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'X') {
                integer -= 1
                continue
            }
        }
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'L') {
                integer -= 1
                continue
            }
        }
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'C') {
                integer -= 1
                continue
            }
        }
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'D') {
                integer -= 1
                continue
            }
        }
        if (chars[i] == 'I' && i + 1 < chars.size) {
            if (chars[i + 1] == 'M') {
                integer -= 1
                continue
            }
        }
        //40和90的判斷
        if (chars[i] == 'X' && i + 1 < chars.size) {
            if (chars[i + 1] == 'L') {
                integer -= 10
                continue
            }
        }
        if (chars[i] == 'X' && i + 1 < chars.size) {
            if (chars[i + 1] == 'C') {
                integer -= 10
                continue
            }
        }
        //400和900的判斷
        if (chars[i] == 'C' && i + 1 < chars.size) {
            if (chars[i + 1] == 'D') {
                integer -= 100
                continue
            }
        }
        if (chars[i] == 'C' && i + 1 < chars.size) {
            if (chars[i + 1] == 'M') {
                integer -= 100
                continue
            }
        }

        when (chars[i]) {
            'I' -> integer += 1
            'V' -> integer += 5
            'X' -> integer += 10
            'L' -> integer += 50
            'C' -> integer += 100
            'D' -> integer += 500
            'M' -> integer += 1000
            else -> integer = 0
        }


    }
    return if (integer in 1..3999)
    integer
    else
    0
    }
}