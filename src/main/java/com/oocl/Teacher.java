package com.oocl;

public class Teacher extends Person{
    private StudentClass[] taughtClass;
    private String greetingMessage;

    public Teacher() {
        this.taughtClass = new StudentClass[5];
    }

    public StudentClass[] getTaughtClass() {
        return taughtClass;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.name, this.age);
    }

    public void greetingClassLeader(StudentClass studentClass, Student newLeader) {
        String introductionOfLeader = String.format("%s is the leader of Class %s.", newLeader.getName(), studentClass.getClassNumber());
        this.greetingMessage = this.introduce() + " " + introductionOfLeader;
    }

    public void greetingNewStudent(StudentClass studentClass, Student newStudent) {
        String greeting = String.format("Welcome %s join Class %s.", newStudent.getName(), studentClass.getClassNumber());
        this.greetingMessage = this.introduce() + " " + greeting;
    }
}
