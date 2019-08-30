package yeh.pratice.student.kotlin

fun main() {

    val student= Student("nicole",80,80)
    student.show()


}

class Student(var name:String,var english:Int,var math:Int){


    fun show(){
        println("name: $name,english=$english,math=$math")
        print("${passOrFailed()}\taverage=\t${getAverage()}\tgrading=\t${grading()}")
    }
    private fun getAverage():Int= (english+math)/2
    private fun grading():Char = when(getAverage()){
            in 90..99->'A'
            in 80..89->'B'
            in 70..79->'C'
            in 60..69->'D'
            else ->'F'
        }
    fun passOrFailed()=if(getAverage()>=60)"Pass" else "Failed"


}