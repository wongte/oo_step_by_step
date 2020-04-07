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
        studentClass.registerStudent(student);
        studentClass.nominateLeader(student);
        Assert.assertEquals(student, studentClass.getClassLeader());
    }

    @Test
    public void testTaughtTeacher() {
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(23);
        StudentClass studentClass = new StudentClass();
        studentClass.setTaughtTeacher(teacher);
        Assert.assertEquals(studentClass, teacher.getTaughtClass()[0]);
        Assert.assertEquals(teacher, studentClass.getTaughtTeacher());
    }

}
