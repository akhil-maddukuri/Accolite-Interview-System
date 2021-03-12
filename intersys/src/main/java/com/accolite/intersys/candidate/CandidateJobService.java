package com.accolite.intersys.candidate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;




@Repository
public class CandidateJobService {
	
	@Autowired
    JdbcTemplate jdbcTemplate;

	 public class CandidateJobRowMapper implements RowMapper < CandidateJob > {
	        @Override
	        public CandidateJob mapRow(ResultSet rs, int rowNum) throws SQLException {
	            CandidateJob candidatejob = new CandidateJob();
	            candidatejob.setJobid(rs.getString("jobid"));
	            candidatejob.setCandidateid(rs.getString("candidateid"));
	            candidatejob.setTitle(rs.getString("title"));
	            return candidatejob;
	        }
	    }

	public List<CandidateJob> findAll() {
		return jdbcTemplate.query("select * from candidatejob", new CandidateJobRowMapper());
	}

	public int insert(CandidateJob candidatejob) {
		return jdbcTemplate.update("insert into candidatejob (jobid,candidateid,title) " + "values(?, ?, ?)",
	            new Object[] {
	            		candidatejob.getJobid(), candidatejob.getCandidateid(), candidatejob.getTitle()
	                });
		
	}

	public void delete(CandidateJob cd) {
		  jdbcTemplate.update("delete from candidatejob where candidatejob.jobid=? and candidatejob.candidateid=?", new Object[] {
		            cd.getJobid(),cd.getCandidateid()});
	}

	public List<CandidateJob> findById(String id) {
		List<CandidateJob> res =  jdbcTemplate.query("select * from candidatejob where candidatejob.id ="+id+";", new CandidateJobRowMapper());
		
        return res;
        		
		
	}

}
