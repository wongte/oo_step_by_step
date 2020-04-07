package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    private int classNumber;
    private List<Student> studentList;
    private Student classLeader;

    public StudentClass() {
        studentList = new ArrayList<Student>();
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public void register(Student student) {
        student.setStudentClass(this);
        studentList.add(student);
    }
    public void nominateLeader(Student leader) {
        if (studentList.contains(leader)) {
            classLeader = leader;
        }
    }
}
