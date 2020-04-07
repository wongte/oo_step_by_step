package com.oocl;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test() {
        Person tom = new Person();
        tom.setName("Tom");
        tom.setAge(21);
        Assert.assertEquals("My name is Tom. I am 21 years old.", tom.introduce());
    }
}
