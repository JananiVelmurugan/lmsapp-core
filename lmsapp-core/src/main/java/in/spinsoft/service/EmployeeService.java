package in.spinsoft.service;

import java.util.List;

import in.spinsoft.dao.EmployeeDAO;
import in.spinsoft.model.Employee;

public class EmployeeService {

	private EmployeeDAO employeeDAO = new EmployeeDAO();

	public void addEmployee(Employee emp) {

		employeeDAO.save(emp);
	}

	public Employee findById(Long empId) {

		return employeeDAO.findById(empId);
	}

	public Employee findByEmailId(String emailId) {

		return employeeDAO.findByEmailId(emailId);
	}

	public void activate(Long empId) {

		Employee findById = employeeDAO.findById(empId);
		findById.setActive(true);
		employeeDAO.update(findById);
	}

	public void deActivate(Long empId) {

		Employee findById = employeeDAO.findById(empId);
		findById.setActive(false);
		employeeDAO.update(findById);
	}
	
	public void delete(Long empId) {

		employeeDAO.delete(empId);
	}


	public List<Employee> list() {

		return employeeDAO.list();
	}

}
