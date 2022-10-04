package com.example.junittesting.service;

import com.example.junittesting.model.Student;
import com.example.junittesting.repository.SecondControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondControllerBusiness {

    @Autowired
    SecondControllerRepository secondControllerRepository;

    public Student getstudentDetails(){

        return  new Student(1,"Gopal",1001,200);
    }

    public List<Student> getstudentDetailsByH2DB(){
        return  secondControllerRepository.findAll();
    }
}
