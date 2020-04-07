package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testStudent() {
        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.", tom.introduce());
    }
}
