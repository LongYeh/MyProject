package yeh.pratice.leetcode.kotlin

fun main() {
    val nums= intArrayOf(1,3,5,7)
    val target=8
    val twosum= TwoSum()
    val test=twosum.getTwoSum(nums,target)
    var i=0
    while (i<test.size){
        println(test[i])
        i++
    }

}
class TwoSum(){

    fun getTwoSum(nums: IntArray,target: Int):IntArray{
        var answer=IntArray(2)

        var i=0

        while(i<nums.size){
            var j=i+1
            while (j<nums.size){
                if(nums[i]+nums[j]==target)
                {answer=intArrayOf(i,j)}
                j++
            }
            i++
        }
        return answer
    }
}