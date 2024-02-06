package com.abhi.tutorial.spring;

public class BinarySearchImpl {
	
//	It will need a sorted array for search
	private SortAlgoirthm sortAlgo ;
	
	BinarySearchImpl(SortAlgoirthm sortAlgo){
		super();
		this.sortAlgo = sortAlgo;
	}
	

	public int search(int i) {
		int numArray[] = new int[4];
		int [] sortedArray = sortAlgo.sortArray(numArray);
		return search(3, sortedArray);
		
		
	}
	
	private int search(int i , int [] sortedArray){
		return i+3;	
	}
	
	

}
