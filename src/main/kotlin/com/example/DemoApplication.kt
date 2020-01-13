package com.example

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

//@ImportResource(locations = ["classpath:beans.xml"])
@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableAutoConfiguration(exclude = [JacksonAutoConfiguration::class])
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
