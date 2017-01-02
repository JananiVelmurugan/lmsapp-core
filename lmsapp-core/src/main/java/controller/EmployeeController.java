package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/employee/{id}")
	public Employee searchById(@PathVariable("id") Long empId) {
		return employeeService.findById(empId);
	}

	@GetMapping("/employee/{email}")
	public Employee searchByEmailId(@PathVariable("email") String emailId) {

		return employeeService.findByEmailId(emailId);
	}

	@PutMapping("/employee/{id}")
	public void activate(@PathVariable("id") Long empId) {
		employeeService.activate(empId);
	}

	@PutMapping("/employee/{id}")
	public void deActivate(@PathVariable("id") Long empId) {

		employeeService.deActivate(empId);
	}

	@DeleteMapping("/employee/{id}")
	public void remove(@PathVariable("id") Long empId) {

		employeeService.delete(empId);
	}

	@GetMapping("/employee")
	public List<Employee> selectAll() {

		return employeeService.list();
	}

}
