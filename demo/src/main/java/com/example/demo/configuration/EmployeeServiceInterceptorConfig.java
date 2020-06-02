package com.example.demo.configuration;

import com.example.demo.interceptor.EmployeeServiceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class EmployeeServiceInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    EmployeeServiceInterceptor employeeServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(employeeServiceInterceptor);
    }
}