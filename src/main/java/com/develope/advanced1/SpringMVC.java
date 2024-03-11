package com.develope.advanced1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
public class SpringMVC implements WebMvcConfigurer {
    @Autowired
    APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
