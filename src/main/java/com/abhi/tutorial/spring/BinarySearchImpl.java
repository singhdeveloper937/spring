package com.abhi.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	It will need a sorted array for search
	@Autowired
	private SortAlgoirthm sortAlgo ;
	
//	BinarySearchImpl(SortAlgoirthm bubbleSortAlgoirthm){
//		super();
//		this.bubbleSortAlgoirthm = bubbleSortAlgoirthm;
//	}
	

	public int search(int i, int numArray[]) {
		int [] sortedArray = sortAlgo.sortArray(numArray);
		System.out.println(sortedArray);
		return search(i);
		
		
	}
	
	private int search(int i){
		return i+3;	
	}
	
	

}
