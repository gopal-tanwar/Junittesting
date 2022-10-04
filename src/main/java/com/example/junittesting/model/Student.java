package com.example.junittesting.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    int id;
    String name;
    int rollNo;
    int marks;

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public Student(int id, String name, int rollNo, int marks) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
