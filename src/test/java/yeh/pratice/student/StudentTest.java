package yeh.pratice.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestTest(){
    Student student=new Student("nicole",88,80);
    Assertions.assertEquals(88,student.highest());
    }
}
