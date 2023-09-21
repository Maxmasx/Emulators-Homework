package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String test(@RequestBody UserJson user){
		double fee = user.money * 18 / (18 + 100);
		return "{\"status\": \"OK\" \"Total Fee\": \"" + fee + "\", \"Name\": \"" + user.name + "\"}";
    }

}








