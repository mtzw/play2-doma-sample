/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package doma;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.ClassHelper;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.DefaultClassHelper;
import org.seasar.doma.jdbc.ExceptionSqlLogType;
import org.seasar.doma.jdbc.GreedyCacheSqlFileRepository;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.NullRequiresNewController;
import org.seasar.doma.jdbc.RequiresNewController;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

import play.db.DB;
import plugin.doma.PlayLogger;

public class DomaConfig implements Config {

	protected static final SqlFileRepository sqlfileRepository = new GreedyCacheSqlFileRepository();

	protected static final JdbcLogger jdbcLogger = new PlayLogger();

	protected static final RequiresNewController requiresNewController = new NullRequiresNewController();

	protected static final ClassHelper classHelper = new DefaultClassHelper();

	protected static final Dialect dialect = new H2Dialect();

	protected static final LocalTransactionalDataSource dataSource = createDataSource();

	protected static LocalTransactionalDataSource createDataSource() {
		return new LocalTransactionalDataSource(DB.getDataSource());
	}

	public static LocalTransaction getLocalTransaction() {
		return dataSource.getLocalTransaction(jdbcLogger);
	}

	@Override
	public String getDataSourceName() {
		return dataSource.getClass().getName();
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
	public RequiresNewController getRequiresNewController() {
		return requiresNewController;
	}

	@Override
	public JdbcLogger getJdbcLogger() {
		return jdbcLogger;
	}

	@Override
	public SqlFileRepository getSqlFileRepository() {
		return sqlfileRepository;
	}

	@Override
	public ClassHelper getClassHelper() {
		return classHelper;
	}

	@Override
	public ExceptionSqlLogType getExceptionSqlLogType() {
		return ExceptionSqlLogType.FORMATTED_SQL;
	}

	@Override
	public int getBatchSize() {
		return 10;
	}

	@Override
	public int getFetchSize() {
		return 0;
	}

	@Override
	public int getMaxRows() {
		return 0;
	}

	@Override
	public int getQueryTimeout() {
		return 0;
	}

}
