package controller;

import java.util.List;

import model.LeaveDetail;
import service.LeaveDetailService;

public class LeaveDetailController {

	private LeaveDetailService leaveDetailService;

	public void insertLeave(LeaveDetail ld) {
		leaveDetailService.save(ld);
	}

	public void modifyLeave(LeaveDetail ld) {
		leaveDetailService.update(ld);
	}

	public List<LeaveDetail> selectById(Long empId) {

		return leaveDetailService.list(empId);
	}
}
