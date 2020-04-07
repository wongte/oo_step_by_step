package com.oocl;

public class Teacher extends Person{
    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.name, this.age);
    }
}
