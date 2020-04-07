package com.oocl;

public class Student extends Person{
    private StudentClass studentClass;
    private String greetingMessage;

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.name, this.age, this.studentClass.getClassNumber());
    }

    public void welcomeNewStudent(Student newStudent) {
        greetingMessage = introduce() + " Welcome " + newStudent.getName() + " join Class " + this.studentClass.getClassNumber() + ".";
    }

    public void welcomeNewLeader(Student newLeader) {
        if (newLeader != this) {
            greetingMessage = introduce() + String.format(" %s is the leader of Class %d.", newLeader.getName(), studentClass.getClassNumber());
        }
    }
}
