package in.spinsoft.service;

import java.util.List;

import in.spinsoft.dao.LeaveTypeDAO;
import in.spinsoft.model.LeaveType;

public class LeaveTypeService {

	private LeaveTypeDAO leaveTypeDAO = new LeaveTypeDAO();
	
	public List<LeaveType> list(){
		return leaveTypeDAO.list();
	}
	
	public LeaveType findById(Long id){
		return leaveTypeDAO.findById(id);
	}
	
}
