package com.example.springmongodbqueries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class SpringMongodbQueriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbQueriesApplication.class, args);
	}





//	@Bean
//	CommandLineRunner runner(StudentRepository repository){
//		return args -> {
//			Address address = new Address("Vietnam","Hanoi", "10000");
//			Student student = new Student(
//					"Hieu",
//					"Tran Minh",
//					"tmhieu2000@gmail.com",
//					address,
//					Arrays.asList("Computer Science"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//
//
//			);
//			repository.insert(student);
//		};
//	}
}
