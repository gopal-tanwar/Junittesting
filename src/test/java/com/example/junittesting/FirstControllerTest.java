package com.example.junittesting;

import com.example.junittesting.controller.FirstController;
import com.example.junittesting.service.StudentService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


/*
In that test class we are using mocikto annotation like @InjectMocks, @Mock
we can also do same work using setup method with mock method but we are using annotation
instead of setup method
 */

@RunWith(SpringRunner.class)
public class FirstControllerTest {


    @InjectMocks
    FirstController firstController;

    @Mock
    StudentService studentService;

    /*@BeforeEach
  public void setup(){
      //MockitoAnnotations.initMocks(this);
      studentService = mock(StudentService.class);
      firstController = new FirstController();
      firstController.setStudentService(studentService);
  }*/

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getInfoTest(){

        when(studentService.getInfo()).thenReturn(5);
        assertEquals(5, firstController.getInfo());
    }

}