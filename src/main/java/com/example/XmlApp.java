package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@ComponentScan(basePackages = {"com.example.xml"})
@SpringBootApplication
public class XmlApp {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(XmlApp.class).run(args);
    }

}
