package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void testTeacher() {
        Teacher woody = new Teacher();
        woody.setName("Woody");
        woody.setAge(30);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world.", woody.introduce());
    }
}
