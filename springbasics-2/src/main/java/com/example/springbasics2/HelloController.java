package com.example.springbasics2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/greet")
    HelloResponse greet() {
        return new HelloResponse("Hello", "Good Morning");
    }

    @GetMapping("/world")
    String getHello() {
        return "hello world";
    }


    @GetMapping("")
    String getHelloWorld() {
        return "hello!";
    }
}
