package com.example.hostel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class HostelController {


    @Bean
    public RestTemplate getRestTemplate()
    {

        return new RestTemplate();
    }
    @Lazy
    @Autowired
    public RestTemplate restTemplate;

    static final String Student_URL="http://localhost:8080/";


    @GetMapping("/find/{roll}")
    public String fetchStudent(@PathVariable int roll)

    {
        Student student= restTemplate.exchange(Student_URL+"all/"+roll, HttpMethod.GET, null, Student.class).getBody();
        System.out.println("Student from Student Report Project : "+student);
        return restTemplate.getForObject(Student_URL+"all/"+roll, String.class);
    }










}
