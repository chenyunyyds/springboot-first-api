package com.example.projectxiaochen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tree {

    @GetMapping("/xiao")
    public String xiao(){
        return "xiao";
    }
}
