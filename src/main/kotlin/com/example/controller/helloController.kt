package com.example.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class helloController {

    @RequestMapping("{msg}")
    fun rest(@PathVariable msg: String): String{
        return msg
    }


    /*@RequestMapping("post.html")
    fun post(): String {
        return "post"
    }

    @RequestMapping("about.html")
    fun about(): String {
        return "about"
    }

    @RequestMapping("index.html")
    fun index(): String {
        return "index"
    }

    @RequestMapping("contact.html")
    fun contact(): String {
        return "contact"
    }*/
}