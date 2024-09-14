package com.abhi.tutorial.spring.cdi;

import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	SomeCdiBusiness(){
		System.out.println("CDI Business");
	}
}
