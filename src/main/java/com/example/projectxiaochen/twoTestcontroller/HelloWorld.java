package com.example.projectxiaochen.twoTestcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/HelloWorld")
    public String HelloWorld(){
        return "我很喜欢你";
    }

}
