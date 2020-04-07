package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testStudentIntroduction() {
        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);

        StudentClass studentClass = new StudentClass();
        studentClass.setClassNumber(2);
        studentClass.register(tom);
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.", tom.introduce());
    }

}
