package dao;

import java.util.List;

import model.Employee;
import model.Role;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		
		EmployeeDAO empDao = new EmployeeDAO();
		
		Role r = new Role();
		r.setId(1L);
		
		Employee emp = new Employee();
		emp.setName("Sairam");
		emp.setCode("RCS001");
		emp.setEmailId("sairams@revature.com");
		emp.setMobileNo(null);
		emp.setRole(r);
		
		System.out.println(emp);
		
		//empDao.save(emp);
		
		List<Employee> list = empDao.list();
		for (Employee employee : list) {
			System.out.println(employee );
		}
		
		Employee employee = empDao.findById(1L);
		System.out.println(employee);
		
		Employee findByEmailId = empDao.findByEmailId("naresh.kumar@revature.com");
		System.out.println(findByEmailId);
		
		Role newRole= new Role();
		newRole.setId(2L);
		
		findByEmailId.setRole(newRole);
		findByEmailId.setActive(false);
		empDao.update(findByEmailId);
		
		
		
		
		
	}
}
