package service;

import java.util.List;

import model.LeaveType;

public class TestLeaveTypeService {

	public static void main(String[] args) {
		
		LeaveTypeService ltService = new LeaveTypeService();
		List<LeaveType> list = ltService.list();
		for (LeaveType leaveType : list) {
			System.out.println(leaveType);
		}
		
		LeaveType findById = ltService.findById(1L);
		System.out.println(findById);
	}
}
