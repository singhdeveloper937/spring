package com.abhi.tutorial.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiDAO {
	
	@Inject
	private SomeCdiBusiness cdiBusiness;
	
	public SomeCdiBusiness getBusiness() {
		return cdiBusiness;
	} 

}
