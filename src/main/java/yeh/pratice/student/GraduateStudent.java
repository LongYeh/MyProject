package yeh.pratice.student;

public class GraduateStudent extends Student{
    int chinese;
    static int pass=70;
    public GraduateStudent(String name,int english,int math,int chinese){
        super(name,english,math);
        this.chinese=chinese;
    }

    @Override
    public void print() {
        System.out.print(name+'\t'+english+'\t'+math
                +'\t'+chinese+'\t'+getAverage()+"\t"+((average>=pass)?"Pass":"Failed"));
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
}
