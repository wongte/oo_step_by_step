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

    @Test
    public void testTeacherGreetingNewStudent() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);

        StudentClass studentClass = new StudentClass();
        studentClass.setClassNumber(2);
        studentClass.setTaughtTeacher(teacher);
        studentClass.registerStudent(student);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", teacher.getGreetingMessage());
    }

    @Test
    public void testGreetingNewLeader() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);

        StudentClass studentClass = new StudentClass();
        studentClass.setClassNumber(2);
        studentClass.setTaughtTeacher(teacher);
        studentClass.registerStudent(student);
        studentClass.nominateLeader(student);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.", teacher.getGreetingMessage());
    }

    @Test
    public void testStudentsGreetingNewStudent() {
        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);

        Student woody = new Student();
        woody.setName("Jim");

        StudentClass studentClass = new StudentClass();
        studentClass.setClassNumber(2);
        studentClass.registerStudent(tom);
        studentClass.registerStudent(woody);
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.", tom.getGreetingMessage());
    }
}
