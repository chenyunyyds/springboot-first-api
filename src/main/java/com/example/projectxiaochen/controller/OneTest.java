package com.example.projectxiaochen.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class OneTest {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @PostMapping("/index")
    public String index2(){
        return "index2";
        }

    @PutMapping("/index")
    public String index3(){
        return "index3";
    }

    @DeleteMapping("/index")
    public String index4(){
        return "index4";
    }
}
