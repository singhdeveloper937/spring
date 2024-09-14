package com.abhi.tutorial.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhi.tutorial.component.ComponentDAO;

@Configuration
@ComponentScan("com.abhi.tutorial.component")
public class ApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationScope.class);
	public static void main(String[] args) {
		
		/*
		 * A spring application needs the following three to run It will need a bean
		 * objects managed by the spring What are the dependencies for the bean where to
		 * find the beans No need as default is package and subpackge of the spring boot
		 * class
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationScope.class);
		
		ComponentDAO dao1 = context.getBean(ComponentDAO.class);
		LOGGER.info("{}", dao1)	;	
		LOGGER.info("{}", dao1.getJdbccon())	;
		ComponentDAO dao2 = context.getBean(ComponentDAO.class);
		LOGGER.info("{}", "The second Object");
		LOGGER.info("{}", dao2);
	    LOGGER.info("{}", dao2.getJdbccon());
		
		
	}

}
