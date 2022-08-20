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
                Student mariam = new Student("Mariam", LocalDate.of(2000, Month.APRIL, 5), "miriam.aa@email.com");
                Student mariam2 = new Student("Mariam2", LocalDate.of(2010, Month.APRIL, 5), "miriam.aa2@email.com");
                repository.saveAll(
                        List.of(mariam, mariam2)
                );
        };
    }
}
