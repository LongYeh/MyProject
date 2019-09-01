package yeh.pratice.many

fun main() {
    val list:List<Int> = listOf(5,1,2,7)
    println(list)
    //kotlin 會自動推斷資料型態
    val scores= listOf(60,50,70,85)
    for(score in scores){
        println(score)
    }
    println(list.get(2))
    //mutableList 可改變.
    var mutableList:MutableList<Int> = mutableListOf(5,1,2,7)
    mutableList.add(6)
    print(mutableList)
}