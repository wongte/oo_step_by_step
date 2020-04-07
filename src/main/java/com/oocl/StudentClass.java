package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    private int classNumber;
    private List<Student> studentList;
    private Student classLeader;
    private Teacher taughtTeacher;

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

    public void registerStudent(Student student) {
        student.setStudentClass(this);
        studentList.add(student);
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
        }
    }
}
