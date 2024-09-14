package com.abhi.tutorial.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhi.tutorial.spring.cdi.SomeCdiDAO;

@Configuration
@ComponentScan // Current package and the sub-packages as default in springboot but not in spring
public class ApplicationCdi {

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationCdi.class);
	public static void main(String[] args) {
		
		/*
		 * A spring application needs the following three to run It will need a bean
		 * objects managed by the spring What are the dependencies for the bean where to
		 * find the beans No need as default is package and subpackge of the spring boot
		 * class
		 */
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationCdi.class)){
		
		SomeCdiDAO dao1 = context.getBean(SomeCdiDAO.class);
		LOGGER.info("{}", dao1)	;	
		LOGGER.info("{}", dao1.getBusiness())	;
		
		}
	}

}
