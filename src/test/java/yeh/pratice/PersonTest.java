package yeh.pratice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void bmiTest(){
        Person person=new Person(66.5,1.77);
        Assertions.assertEquals(66.5/(1.77*1.77),person.bmi());
    }
}
