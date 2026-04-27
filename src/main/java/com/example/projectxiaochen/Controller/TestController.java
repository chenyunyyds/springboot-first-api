package com.example.projectxiaochen.Controller;

import com.example.projectxiaochen.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }
    @GetMapping("/one")
    public String one() {
        return testService.one();
    }

    @GetMapping("/two")
    public String two() {
        return testService.two();
    }

    @GetMapping("/xiao")
    public String xiao() {
        return testService.xiao();
    }
}