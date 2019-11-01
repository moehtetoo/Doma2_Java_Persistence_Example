package com.moehtet.doma2.config;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;

public class AppConfig implements Config{
	
	private static final AppConfig CONFIG = new AppConfig();
	
	private Dialect dialect;
	
	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dialect getDialect() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
