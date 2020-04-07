package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    private int classNumber;
    private List<Student> studentList;
    private Student classLeader;
    private Teacher taughtTeacher;

    public StudentClass() {
        studentList = new ArrayList<>();
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

    public void registerStudent(Student newStudent) {
        studentList.forEach(student -> student.welcomeNewStudent(newStudent));
        newStudent.setStudentClass(this);
        studentList.add(newStudent);
        if (this.taughtTeacher != null) {
            this.taughtTeacher.greetingNewStudent(this, newStudent);
        }
    }

    public void setTaughtTeacher(Teacher teacher) {
        StudentClass[] taughtClass = teacher.getTaughtClass();
        for (int index = 0; index < taughtClass.length; index++) {
            if (taughtClass[index] == null) {
                taughtClass[index] = this;
                this.taughtTeacher = teacher;
                break;
            }
        }
    }

    public Teacher getTaughtTeacher() {
        return taughtTeacher;
    }

    public void nominateLeader(Student leader) {
        if (studentList.contains(leader)) {
            classLeader = leader;
            if (this.taughtTeacher != null) {
                this.taughtTeacher.greetingClassLeader(this, leader);
            }
            this.studentList.forEach(student -> student.welcomeNewLeader(leader));
        }
    }

}
