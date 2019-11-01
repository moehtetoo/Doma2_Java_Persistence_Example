package com.moehtet.doma2.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.moehtet.doma2.config.AppConfig;
import com.moehtet.doma2.entity.Employee;

@Dao(config = AppConfig.class)
public interface EmployeeDao {
	
	@Select
	Employee getEmployeeById(Integer employeeId);
}
