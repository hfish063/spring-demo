package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hayden = new Student(
                    "Hayden",
                    "hayden.fish@gmail.com",
                    LocalDate.of(2004, Month.MAY, 19)
            );

            Student stephen = new Student(
                    "Stephen",
                    "stephen.v@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 8)
            );

            repository.saveAll(
                    List.of(hayden, stephen)
            );
        };
    }
}
