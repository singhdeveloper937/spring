package com.abhi.tutorial.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgoirthm {

	@Override
	public int[] sortArray(int[] numberArray) {
		return numberArray;
	}

}
