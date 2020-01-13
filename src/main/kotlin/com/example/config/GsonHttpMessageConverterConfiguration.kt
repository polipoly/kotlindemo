package com.example.config

import com.google.gson.Gson
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.GsonHttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

@Configuration
@ConditionalOnClass(Gson::class)
@ConditionalOnMissingClass("com.fasterxml.jackson.core.JsonGenerator")
@ConditionalOnBean(Gson::class)
class GsonHttpMessageConverterConfiguration: WebMvcConfigurationSupport() {

    @Bean
    @ConditionalOnMissingBean
    fun gsonHttpMessageConverter(gson: Gson): GsonHttpMessageConverter {
        var converter=GsonHttpMessageConverter();
        converter.gson=gson;
        println("json:")
        return converter;
    }

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        super.configureMessageConverters(converters)
        converters.add(gsonHttpMessageConverter(Gson()))
    }
}