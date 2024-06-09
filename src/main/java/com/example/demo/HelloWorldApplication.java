package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring起動時に走リまーす
 * @author 著者でーす
 *
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

		var HelloWorld = new HelloWorld();
		String helloWorld = HelloWorld.SetHelloWorld();

		System.out.println(helloWorld);
	}
}