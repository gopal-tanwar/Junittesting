package com.example.junittesting;


import com.example.junittesting.controller.SecondController;
import com.example.junittesting.model.Student;
import com.example.junittesting.repository.SecondControllerRepository;
import com.example.junittesting.service.SecondControllerBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
In that test case we are using spring boot and mvc anotation
 */
@RunWith(SpringRunner.class)
@WebMvcTest(SecondController.class)
public class SecondControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    SecondControllerBusiness secondControllerBusiness;

    @MockBean
    SecondControllerRepository secondControllerRepository;

    @Test
    public void getstudentDetails() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.
                get("/second").
                accept(MediaType.APPLICATION_JSON);

        MvcResult mvcResult = mockMvc.perform(requestBuilder).
                andExpect(status().isOk()).
                andExpect(content().json("{ id:1,name:Gopal,rollNo:1001}")).
                andReturn();
    }

    @Test
    public void getstudentDetailsFromBuisness() throws Exception {

        when(secondControllerBusiness.getstudentDetails()).thenReturn(new Student(1,"Gopal",1001,200));

        RequestBuilder requestBuilder = MockMvcRequestBuilders.
                get("/second/getstudentDetailsFromBuisness").
                accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(requestBuilder).
                andExpect(status().isOk()).
                andExpect(content().json("{ id:1,name:Gopal,rollNo:1001}")).
                andReturn();
    }

    @Test
    public void getstudentDetailsFromDB() throws Exception {

        when(secondControllerBusiness.getstudentDetailsByH2DB()).thenReturn(
                Arrays.asList(new Student(1,"Gopal",1001,200)));

        RequestBuilder requestBuilder = MockMvcRequestBuilders.
                get("/second/getstudentDetailsFromDB").
                accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(requestBuilder).
                andExpect(status().isOk()).
                andExpect(content().json("[{id:1,name:Gopal,rollNo:1001}]")).
                andReturn();
    }

}