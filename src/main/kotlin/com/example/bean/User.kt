package com.example.bean

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId

data class User(@TableId(type = IdType.UUID)
                var userid: String,
                var account:String,
                var passwd:String,
                var username:String,
                var orgid:String?,
                var phone:String?,
                var email:String?,
                @TableField(exist = false)var orgname:String?)