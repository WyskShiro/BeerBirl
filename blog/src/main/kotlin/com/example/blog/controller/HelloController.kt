package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @RequestMapping("/")
    @ResponseBody
    fun helloWorld(): String {
        return "Hello World2"
    }
}