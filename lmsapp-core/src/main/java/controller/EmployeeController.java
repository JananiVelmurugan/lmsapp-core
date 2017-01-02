package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	public void createEmployee(Employee emp) {
		employeeService.addEmployee(emp);
	}

	public Employee getById(Long empId) {
		return employeeService.findById(empId);
	}

	public Employee searchByEmailId(String emailId) {

		return employeeService.findByEmailId(emailId);
	}

	public void activate(Long empId) {
		employeeService.activate(empId);
	}

	public void deActivate(Long empId) {

		employeeService.deActivate(empId);
	}

	public void remove(Long empId) {

		employeeService.delete(empId);
	}

	public List<Employee> selectAll() {

		return employeeService.list();
	}

}
