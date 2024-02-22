package com.abhi.tutorial.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abhi.tutorial.spring.basic.BinarySearchImpl;

@SpringBootApplication
public class ApplicationBasic {

	public static void main(String[] args) {

		/*
		 * A spring application needs the following three to run It will need a bean
		 * objects managed by the spring What are the dependencies for the bean where to
		 * find the beans No need as default is package and subpackge of the spring boot
		 * class
		 */

		/*
		 * Alternative approach BinarySearchImpl impl = new BinarySearchImpl(new
		 * BubbleSort()); System.out.println(impl.search(4));
		 */
		ApplicationContext context = SpringApplication.run(ApplicationBasic.class, args);
		BinarySearchImpl serachimpl = context.getBean(BinarySearchImpl.class);
		System.out.println(serachimpl.search(5, new int[]{1,4,5,7}));
	}

}
