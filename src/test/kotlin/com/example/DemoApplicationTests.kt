package com.example

import com.example.bean.Person
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	var person:Person= Person();

	@Autowired
	var loc:ApplicationContext?=null

	@Test
	fun contextLoads() {
		println(person)
	}

	@Test
	fun findHelloService(){
		println(loc?.getBean("helloService"))
	}
}
