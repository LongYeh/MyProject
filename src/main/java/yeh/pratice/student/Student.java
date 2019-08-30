package yeh.pratice.student;



public class Student {
    String id;
    String name;
    int english,math;
    double average;

    public Student(String name, int english, int math) {

        this.name=name;
        this.english=english;
        this.math=math;

    }

    public int highest(){
        //int max=(english>math)?english:math;
        /*if(english>math){
            max=english;
        }
        else
            max=math;*/
        return (english>math)?english:math;
    }

    public  void print(){
        System.out.print(name+'\t'+english+'\t'+math
        +'\t'+getAverage()+"\t"+((average>=60)?"Pass":"Failed"));
        /*if(getAverage()>=60)
            System.out.println("Pass");
            else
            System.out.println("\t failed");*/
        String grading ="F";
        switch ((int)average/10){
            case 10:
                grading="A+";
                break;
            case 9:
                grading="A";
                break;
            case 8:
                grading="B";
                break;
            case 7:
                grading="C";
                break;
            case 6:
                grading="D";
                break;
            default:
                grading="F";

        }
        System.out.println("  grading :"+grading);

    }

    public double getAverage(){
        average=(english+math)/2;
        return average;
    }
}
