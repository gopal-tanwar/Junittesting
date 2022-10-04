package com.example.junittesting;

import com.example.junittesting.repository.StudentRepository;
import com.example.junittesting.service.StudentServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class StudentServiceImplTest {

    @InjectMocks
    StudentServiceImpl studentService;

    @Mock
    StudentRepository studentRepository;

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.openMocks(this);
    }

    /*@BeforeEach
    public void setup(){
        //MockitoAnnotations.initMocks(this);
        studentRepository = mock(StudentRepository.class);
        studentService = new StudentServiceImpl();
        studentService.setStudentRepository(studentRepository);
    }*/

    @Test
    public void getInfoTest(){

        when(studentRepository.getInfo()).thenReturn(5);
        assertEquals(5, studentService.getInfo());
    }
}