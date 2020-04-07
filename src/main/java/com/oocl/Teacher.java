package com.oocl;

public class Teacher extends Person{
    private StudentClass[] taughtClass;

    public Teacher() {
        this.taughtClass = new StudentClass[5];
    }

    public StudentClass[] getTaughtClass() {
        return taughtClass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.name, this.age);
    }
}
