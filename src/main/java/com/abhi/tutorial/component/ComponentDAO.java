package com.abhi.tutorial.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {
	
	@Autowired
	/*
	 * Dependency will always be singleton even if defined as prototype on dependency level
	 * but singleton on the bean level
	 * To overcome the default singleton use proxy mode on dependency
	 */
	private JDBCConnection jdbccon;
	
	public JDBCConnection getJdbccon() {
		return jdbccon;
	} 

}
