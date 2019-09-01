package yeh.pratice.student.kotlin

fun main() {

    val one= Student("nicole",80,80)
    one.show()
    val two=Student("james",96,100)
    two.show()
    val stu=GraduateStudent("nicole",68,70,69)
    stu.show()



}

class GraduateStudent(name: String,english: Int,math: Int,thesis:Int) :Student(name,english,math){
    companion object{
        var pass=70
    }

    override fun show() {
        println("name: $name,english=$english,math=$math")
        print("${passOrFailed()}\taverage=\t${getAverage()}\tgrading=\t${grading()}")
    }

    override fun passOrFailed()=if(getAverage()>= pass)"pass" else "feild"
}
//open kotlin�~������r
open class Student(var name:String,var english:Int,var math:Int){

    companion object{
        @JvmStatic
        var pass=60
        fun test(){
            print("testing")
        }
    }


    open fun show(){
        println("name: $name,english=$english,math=$math")
        print("${passOrFailed()}\taverage=\t${getAverage()}\tgrading=\t${grading()}")
    }
    fun getAverage()= (english+math)/2
    internal fun grading():Char = when(getAverage()){
            in 90..99->'A'
            in 80..89->'B'
            in 70..79->'C'
            in 60..69->'D'
            else ->'F'
        }
    open fun passOrFailed()=if(getAverage()>= pass)"Pass" else "Failed"


}