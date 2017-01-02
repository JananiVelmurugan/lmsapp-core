package controller;

import java.util.List;

import model.LeaveType;
import service.LeaveTypeService;

public class LeaveTypeController {

	private LeaveTypeService leaveTypeService;

	public List<LeaveType> getLeaveType() {
		return leaveTypeService.list();
	}

	public LeaveType getLeaveTypeById(Long id) {
		return leaveTypeService.findById(id);
	}

}
