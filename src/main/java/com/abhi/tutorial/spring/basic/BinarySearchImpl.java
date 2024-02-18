package com.abhi.tutorial.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	It will need a sorted array for search
	@Autowired
	@Qualifier("bubbleSortAlgo")
	private SortAlgoirthm bubbleSortAlgo ;
	
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
	
	

}
