package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	//The @GetMapping works like the post from express app
	@GetMapping("/root")
	//The apiRoute method works like the post method
	public String apiRoute(){
		return  "Hello ,World!";
	}

}
