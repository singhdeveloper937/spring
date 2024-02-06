package com.abhi.tutorial.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		BinarySearchImpl impl = new BinarySearchImpl(new BubbleSort());
		System.out.println(impl.search(4));
		SpringApplication.run(Application.class, args);
	}

}
