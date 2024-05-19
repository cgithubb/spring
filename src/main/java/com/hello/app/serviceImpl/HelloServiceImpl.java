package com.hello.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hello.app.dao.HelloDAO;
import com.hello.app.model.EmployeeModel;
import com.hello.app.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{
	
	HelloServiceImpl(HelloDAO helloDAO) {
		this.helloDAO = helloDAO;
	}
	
	private HelloDAO helloDAO;

	@Override
	public List<EmployeeModel> getAllEmployees() {
		List<Map<String,Object>> data = helloDAO.getAllEmployee();
        List<EmployeeModel> employees = new ArrayList<>();
        for (Map<String, Object> map : data) {
            EmployeeModel employee = new EmployeeModel();
            employee.setEmployeeUid((Integer) map.get("EMP_UID"));
            employee.setEmployeeFirstName((String) map.get("EMP_FIRSTNAME"));
            employee.setEmployeeLastName((String) map.get("EMP_LASTNAME"));
            employee.setEmployeeMobileNum((String) map.get("EMP_MOBILE"));
            employees.add(employee);
        }
        return employees;
    }
	
}
