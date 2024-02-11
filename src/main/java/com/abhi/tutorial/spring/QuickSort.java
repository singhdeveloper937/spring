package com.abhi.tutorial.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgoirthm {

	@Override
	public int[] sortArray(int[] numberArray) {
		return numberArray;
	}

}
