package com.alex.work.dijavaconfig;

import com.alex.work.dijavaconfig.Entity.Student;
import com.alex.work.dijavaconfig.config.Config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiJavaConfigApplication
{

    public static void main(String[] args)
    {
//        SpringApplication.run(DiJavaConfigApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = (Student) context.getBean("createStudent");
        System.out.println(student);
    }

}
