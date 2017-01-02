package service;

import java.util.List;

import dao.LeaveTypeDAO;
import model.LeaveType;

public class LeaveTypeService {

	private LeaveTypeDAO leaveTypeDAO = new LeaveTypeDAO();
	
	public List<LeaveType> list(){
		return leaveTypeDAO.list();
	}
	
	public LeaveType findById(Long id){
		return leaveTypeDAO.findById(id);
	}
	
}
