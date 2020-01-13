package com.example.config

import com.example.service.HelloService
import com.google.gson.Gson
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.StringHttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.charset.Charset

@Configuration//spring传统配置文件，这里面返回的bean会加到applicationContext中，可直接用getBean(方法名)获取对应的bean
class Config  {

    @Bean
    fun helloService(): HelloService {
        var hi= HelloService();
        hi.name="xxx"

        return hi
    }

    @Bean
    fun gson(): Gson{
        return Gson();
    }

    /*override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        super.configureMessageConverters(converters)
        converters.add(responseBodyConverter())
    }*/


    //@Bean
    fun responseBodyConverter(): StringHttpMessageConverter {

        var converter: StringHttpMessageConverter =StringHttpMessageConverter(Charset.forName("UTF-8"));

        return converter

    }



}

/* override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)
        registry.addInterceptor(LoginInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns("/index.html")
    }*/
        /*@Bean
    override fun addViewControllers(registry: ViewControllerRegistry) {
        super.addViewControllers(registry)
        //registry.addViewController("/").setViewName("index")

    }*/