package com.accolite.intersys.jobs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class JobService {
    
	@Autowired
    JdbcTemplate jdbcTemplate;

    public class JobRowMapper implements RowMapper < Job > {
        @Override
        public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
            Job job= new Job();
            job.setId(rs.getString("id"));
            job.setTitle(rs.getString("title"));
            job.setDescription(rs.getString("description"));
            job.setLocation(rs.getString("location"));
            job.setEligibility(rs.getString("eligibility"));
            
            return job;
        }
    }

    public List <Job> findAll() {
    
        return jdbcTemplate.query("select * from jobs", new JobRowMapper());
    }

  
	
	
	
	public Job findById(String id) {

		List<Job> res =  jdbcTemplate.query("select * from jobs where jobs.id ="+id+";", new JobRowMapper());
        		
        return res.get(0);
        		
        	
    }
	

    public int deleteById(String id) {
        return jdbcTemplate.update("delete from jobs where id=?", new Object[] {
            id
        });
    }

    public int insert(Job job) {
        return jdbcTemplate.update("insert into jobs (id, title, description, location, eligibility) " + "values(?, ?, ?, ?, ?)",
            new Object[] {
                job.getId(), job.getTitle(),  job.getDescription(), job.getLocation(), job.getEligibility(), 
            });
    }

    public int update(Job job, String id) {
        return jdbcTemplate.update("update jobs " + " set title=?, description=?, location=?, eligibility=?" + " where id = ?",
            new Object[] {
                job.getTitle(), job.getDescription(), job.getLocation(), 
                job.getEligibility(),job.getId()
            });
    }
}
