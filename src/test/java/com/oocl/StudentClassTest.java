package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentClassTest {
    @Test
    public void testClassLeader() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);
        StudentClass studentClass = new StudentClass();
        studentClass.register(student);
        studentClass.nominateLeader(student);
        Assert.assertEquals(student, studentClass.getClassLeader());
    }
}
