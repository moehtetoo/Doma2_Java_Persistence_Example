package com.moehtet.doma2.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;

import com.moehtet.doma2.config.AppConfig;
import com.moehtet.doma2.entity.Employee;

public class EmployeeDaoTest {

	private EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Test
	public void testEmployeeById() {
		TransactionManager tx = AppConfig.singleton().getTransactionManager();
		tx.required(() -> {
			Employee emp = employeeDao.getEmployeeById(1);
			assertNotNull(emp);
			assertEquals("Moe Htet Oo", emp.getEmployeeName());
		});
	}

	@Test
	public void testSelectAllEmployee() {
		TransactionManager tx = AppConfig.singleton().getTransactionManager();
		tx.required(() -> {
			List<Employee> emp = employeeDao.selectAll();
			assertNotNull(emp);
			assertEquals(1, emp.size());
		});
	}
}
