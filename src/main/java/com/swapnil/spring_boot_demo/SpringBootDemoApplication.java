package com.swapnil.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}

@RestController()
class PersonController{

	@GetMapping("/persons")
	public List<Person> getPersons(){
		return List.of(new Person("Swapnil","Nakate"));
	}
}

record Person(String name, String surname){}