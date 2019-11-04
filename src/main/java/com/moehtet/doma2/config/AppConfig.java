package com.moehtet.doma2.config;

import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;

@SingletonConfig
public class AppConfig implements Config{
	
	private static final AppConfig CONFIG = new AppConfig();
	
	private final Dialect dialect;
	
	private final DataSource dataSource ;
	
	private final TransactionManager transactionManager;
	
	private AppConfig() {
		dialect = new PostgresDialect();
		dataSource = new LocalTransactionDataSource(JdbcConstants.URL, JdbcConstants.USERNAME, JdbcConstants.PASSWORD);
		transactionManager = new LocalTransactionManager(
						((LocalTransactionDataSource)dataSource).getLocalTransaction(getJdbcLogger())
				);
	}
	
	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}
	
	@Override
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}
	
	public static AppConfig singleton() {
		return CONFIG;
	}
}
