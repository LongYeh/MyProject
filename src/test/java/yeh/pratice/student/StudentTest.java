package yeh.pratice.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestTest(){
    Student student=new Student("nicole",88,80);
    Assertions.assertEquals(88,student.highest());
    }
    @Test
    void getAverageTest(){
        Student student=new Student("Nicole",80,79);
        Assertions.assertEquals((80+79)/2,student.getAverage());
    }
    @Test
    void printTest(){
        Student student=new Student("nicole",60,70);
        student.print();
    }
}
