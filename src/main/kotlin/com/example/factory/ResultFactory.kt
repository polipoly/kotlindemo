package com.example.factory

import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
object ResultFactory {
    fun createSuccessEntity(data:Any?): ResultEntity{
        return ResultEntity(true,null,data)
    }

    fun createFailEntity(massage:String?): ResultEntity{
        return ResultEntity(false, massage ?: "数据异常",null)
    }
}