package com.example.projectxiaochen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoTest {

    @GetMapping("/time")
        public String time(){
        return "当前时间: " + new java.util.Date().toString();





    }
}
