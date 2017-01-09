package in.spinsoft.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.spinsoft.model.LeaveType;
import in.spinsoft.util.ConnectionUtil;

public class LeaveTypeDAO {

	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<LeaveType> list() {

		String sql = "SELECT ID, LEAVE_TYPE, ACTIVE FROM LEAVE_TYPES";
		List<LeaveType> list = jdbcTemplate.query(sql, (rs, rowNo) -> {

			LeaveType lt = new LeaveType();
			lt.setId(rs.getLong("ID"));
			lt.setType(rs.getString("LEAVE_TYPE"));
			lt.setActive(rs.getBoolean("ACTIVE"));
			return lt;
		});
		return list;

	}

	public LeaveType findById(Long id) {

		String sql = "SELECT ID, LEAVE_TYPE, ACTIVE FROM LEAVE_TYPES WHERE ID= ?";
		LeaveType list = jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNo) -> {

			LeaveType lt = new LeaveType();
			lt.setId(rs.getLong("ID"));
			lt.setType(rs.getString("LEAVE_TYPE"));
			lt.setActive(rs.getBoolean("ACTIVE"));
			return lt;
		});
		return list;

	}
}
