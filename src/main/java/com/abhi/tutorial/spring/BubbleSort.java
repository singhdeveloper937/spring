package com.abhi.tutorial.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSortAlgo")
public class BubbleSort implements SortAlgoirthm {

	@Override
	public int[] sortArray(int[] numberArray) {
		return numberArray;
	}

}
