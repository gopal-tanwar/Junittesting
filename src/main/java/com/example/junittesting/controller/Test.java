package com.example.junittesting.controller;

import java.util.ArrayList;
import java.util.List;

class Person{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {

        List<Person> list =new ArrayList<>();
        Person p;
        list.add(p=new Person());
        p.setName("Scahin");
        list.add(p);
        System.out.println(list.get(0).getName());
        System.out.println(list.get(1).getName());
    }
}
