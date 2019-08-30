package yeh.pratice.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
       getStudentScore();
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
