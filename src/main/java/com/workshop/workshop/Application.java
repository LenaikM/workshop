package com.workshop.workshop;

import com.workshop.workshop.model.User;
import com.workshop.workshop.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository){
        return args-> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User("Carlos", name, name.toLowerCase() + "@domain.com", null,  null, null,
                        0, null, null);
                userRepository.save(user);
            });

            userRepository.findAll().forEach(System.out::println);
        };
    }
}
