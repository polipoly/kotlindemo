package com.example

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.sql.Connection
import javax.sql.DataSource

@SpringBootTest
class DruidTest {

    @Autowired
    var dataSource:DataSource?=null;

    @Test
    fun testConnection(){
        var connection: Connection?= dataSource?.connection;

        println("start:")
        println(connection!!.prepareStatement("select * from user").execute())
        connection?.close()
    }

}