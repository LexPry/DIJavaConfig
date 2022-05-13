package com.alex.work.dijavaconfig.config;

import com.alex.work.dijavaconfig.Entity.Address;
import com.alex.work.dijavaconfig.Entity.Phone;
import com.alex.work.dijavaconfig.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{

    @Bean
    public Phone createPhone()
    {
        return new Phone("Google Pixel 6");
    }

    @Bean
    public Address createAddress()
    {
        return new Address("Troy", "Utah", "USA", "09318");
    }

    @Bean
    public Student createStudent()
    {
        return new Student(1, "Alex");
    }


}
