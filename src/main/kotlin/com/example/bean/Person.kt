package com.example.bean

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties(prefix = "person")
@PropertySource(value = ["classpath:person.properties"])//只支持properties
 class Person {
    var name:String?=null;
    var age:Int?=null;
    var maps:MutableMap<String,String>?=null
    var list1:MutableList<String>?=null;
    override fun toString(): String {
        return "Person(name=$name, age=$age, maps=$maps, list1=$list1)"
    }


}