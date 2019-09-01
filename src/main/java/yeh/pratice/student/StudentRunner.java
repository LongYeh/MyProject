package yeh.pratice.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
       //getStudentScore();
        Student one=new Student("103",80,97);
        Student two=new Student("123",75,30);
        Student three=new Student("80",45,99);
        one.print();
        two.print();
        three.print();

        System.out.println(yeh.pratice.student.kotlin.Student.getPass());
    }

    public static void getStudentScore() {




        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter student name: ");
        String name=sc.next();
        System.out.println("enter english score:");
        int english=sc.nextInt();
        System.out.println("enter math score:");
        int math=sc.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("high score = "+stu.highest());
    }
}
