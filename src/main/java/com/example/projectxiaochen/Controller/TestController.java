package com.example.projectxiaochen.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/one")
    public String one() {
        return "这是接口 one";
    }

    @GetMapping("/two")
    public String two() {
        return "这是接口 two";
    }

    @GetMapping("/xiao")
    public String xiao() {
        return "这是接口 xiao";
    }
}