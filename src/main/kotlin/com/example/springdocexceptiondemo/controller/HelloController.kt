package com.example.springdocexceptiondemo.controller

import com.example.springdocexceptiondemo.model.HelloResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun getTest(): HelloResponse {
        return HelloResponse("Hello World")
    }
}