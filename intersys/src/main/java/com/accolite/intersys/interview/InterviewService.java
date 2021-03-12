package com.accolite.intersys.interview;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class InterviewService {

	@Autowired
    JdbcTemplate jdbcTemplate;

    public class InterviewRowMapper implements RowMapper < Interview > {
        @Override
        public Interview mapRow(ResultSet rs, int rowNum) throws SQLException {
            Interview interview = new Interview();
            interview.setInterview_id(rs.getString("interview_id"));
            interview.setInterviewer_name(rs.getString("interviewer_name"));
            interview.setHr_id(rs.getString("hr_id"));
            interview.setCandidate_name(rs.getString("candidate_name"));
            interview.setGmeetlink(rs.getString("gmeetlink"));
            interview.setDate(rs.getDate("date"));
            interview.setFeedback(rs.getString("feedback"));
            interview.setRound(rs.getInt("round"));
            interview.setStatus(rs.getString("status"));
            
            return interview;
        }
    }

    public List <Interview > findAll() {   
        return jdbcTemplate.query("select * from interview", new InterviewRowMapper());
    }

	public Interview findById(String interview_id) {
		List<Interview> res =  jdbcTemplate.query("select * from interview where interview.id ="+interview_id+";", new InterviewRowMapper());
        return res.get(0);   	
    }
	

    public int deleteById(String interview_id) {
        return jdbcTemplate.update("delete from interview where interview_id=?", new Object[] {
            interview_id
        });
    }

    public int insert(Interview interview) {
        return jdbcTemplate.update("insert into interview (interview_id, interviewer_name, hr_id, candidate_name, gmeetlink, date,feedback, round, status) " + "values(?, ?, ?, ?, ?,?, ?, ?,?)",
            new Object[] {
            		interview.getInterview_id(), interview.getInterviewer_name(),  interview.getHr_id(), interview.getCandidate_name(), interview.getGmeetlink(), 
            		interview.getDate(), interview.getFeedback(),interview.getRound(),interview.getStatus()
            }); 
    }

    public int update(Interview interview, String interview_id) {
        return jdbcTemplate.update("update interview " + " set interviewer_name=?, hr_id=?, candidate_name=?, gmeetlink=?, date=?,feedback=?, round=?,status=?" + " where interview_id = ?",
            new Object[] {
            		interview.getInterviewer_name(),  interview.getHr_id(), interview.getCandidate_name(), interview.getGmeetlink(), 
            		interview.getDate(),interview.getFeedback(),interview.getRound(),interview.getStatus(), interview.getInterview_id()
            });
    }

	public List<Interview> findByTimeStamp(String interview_id) {
		  
		String sql= "select * from interview where interview.interview_id="+interview_id+" and interview.date< curdate();";
		List<Interview> res =  jdbcTemplate.query(sql, new InterviewRowMapper());
		return res;
	}
}
