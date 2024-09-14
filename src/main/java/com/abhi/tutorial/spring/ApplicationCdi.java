package com.abhi.tutorial.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abhi.tutorial.spring.cdi.SomeCdiDAO;

@SpringBootApplication
public class ApplicationCdi {

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationCdi.class);
	public static void main(String[] args) {
		
		/*
		 * A spring application needs the following three to run It will need a bean
		 * objects managed by the spring What are the dependencies for the bean where to
		 * find the beans No need as default is package and subpackge of the spring boot
		 * class
		 */
		
		ApplicationContext context = SpringApplication.run(ApplicationCdi.class, args);
		
		SomeCdiDAO dao1 = context.getBean(SomeCdiDAO.class);
		LOGGER.info("{}", dao1)	;	
		LOGGER.info("{}", dao1.getBusiness())	;
		
		
	}

}
