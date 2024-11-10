package com.example.demo;

import com.example.demo.application.service.EmployeeWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class AppWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWsApplication.class, args);

        EmployeeWebClient employeeWebClient = new EmployeeWebClient();
        employeeWebClient.consume();
    }

}
