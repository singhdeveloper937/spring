package com.abhi.tutorial.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.tutorial.spring.xml.XmlDAO;

public class ApplicationXML {

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationXML.class);
	public static void main(String[] args) {
		
		/*
		 * A spring application needs the following three to run It will need a bean
		 * objects managed by the spring What are the dependencies for the bean where to
		 * find the beans No need as default is package and subpackge of the spring boot
		 * class
		 */
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlDAO dao1 = context.getBean(XmlDAO.class);
			LOGGER.info("{}", dao1)	;	
//			LOGGER.info("{}", dao1.getCdiBusiness())	;
			
		} 
		
		
	}

}
