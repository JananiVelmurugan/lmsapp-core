package in.spinsoft.service;

import java.util.List;

import in.spinsoft.dao.LeaveDetailDAO;
import in.spinsoft.model.LeaveDetail;

public class LeaveDetailService {

	private LeaveDetailDAO ldDao = new LeaveDetailDAO();
	
	public void save(LeaveDetail ld) {
		ldDao.applyLeave(ld);
	}

	public void update(LeaveDetail ld) {
		ldDao.update(ld);
	}

	public List<LeaveDetail> list(Long empId) {

		return ldDao.list(empId);
	}
}
