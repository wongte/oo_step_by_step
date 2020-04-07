package com.oocl;

public class Student extends Person{
    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Coding for the glory of OOCL.", this.name, this.age);
    }
}
