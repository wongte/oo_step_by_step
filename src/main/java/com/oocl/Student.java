package com.oocl;

public class Student extends Person{
    private StudentClass studentClass;

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.name, this.age, this.studentClass.getClassNumber());
    }
}
