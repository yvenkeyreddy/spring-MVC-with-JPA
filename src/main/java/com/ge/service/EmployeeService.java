package com.ge.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.dao.EmployeeDAOImpl;
import com.ge.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAOImpl employeeDAO;

	@Transactional
	public void saveData(Employee employee) {
		employeeDAO.saveEmployee(employee);
	}
}
