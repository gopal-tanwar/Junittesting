package com.example.junittesting.controller;

import com.example.junittesting.model.Student;
import com.example.junittesting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/first")
public class FirstController {

    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public int getInfo(){
        return studentService.getInfo();
    }
}
