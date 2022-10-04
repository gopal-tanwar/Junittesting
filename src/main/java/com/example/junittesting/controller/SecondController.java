package com.example.junittesting.controller;

import com.example.junittesting.model.Student;
import com.example.junittesting.service.SecondControllerBusiness;
import com.example.junittesting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/second")
public class SecondController {

    @Autowired
    private SecondControllerBusiness secondControllerBusiness;

    @GetMapping
    public Student getstudentDetails(){

        return  new Student(1,"Gopal",1001,200);
    }

    @GetMapping("/getstudentDetailsFromBuisness")
    public Student getstudentDetailsFromBuisness(){
        return  secondControllerBusiness.getstudentDetails();
    }

    @GetMapping("/getstudentDetailsFromDB")
    public List<Student> getstudentDetailsFromDB(){
        return  secondControllerBusiness.getstudentDetailsByH2DB();
    }

}
