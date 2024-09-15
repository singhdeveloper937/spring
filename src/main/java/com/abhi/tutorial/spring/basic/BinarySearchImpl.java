
package com.abhi.tutorial.spring.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	It will need a sorted array for search
	@Autowired
	@Qualifier("bubbleSortAlgo")
	private SortAlgoirthm bubbleSortAlgo ;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	BinarySearchImpl(SortAlgoirthm bubbleSortAlgoirthm){
//		super();
//		this.bubbleSortAlgoirthm = bubbleSortAlgoirthm;
//	}
	

	public int search(int i, int numArray[]) {
		int [] sortedArray = bubbleSortAlgo.sortArray(numArray);
		System.out.println(sortedArray);
		return search(i);
		
		
	}
	
	private int search(int i){
		return i+3;	
	}
	
//	@PostConstruct
//	/**
//	 * This annotation calls the linked method
//	 * after all the beans are created and populated
//	 */
//	public void afterConstruct() {
//		logger.info("Post construct is called");
//	}
//	
//	@PreDestroy
//	/**
//	 * The linked method is called 
//	 * as callback to signal that the bean 
//	 * instance is getting removed from the context/
//	 */
//	public void beforeDestroy() {
//		logger.info("pre destroy called");
//	}

}
