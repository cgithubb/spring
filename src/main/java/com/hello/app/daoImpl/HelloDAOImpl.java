package com.hello.app.daoImpl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hello.app.dao.HelloDAO;

@Repository
public class HelloDAOImpl implements HelloDAO {
	
	private static final StringBuilder GETALL_QUERY = new StringBuilder("Select * from EMPLY");
	
	private JdbcTemplate jdbcTemplate;
	
	public HelloDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Map<String,Object>> getAllEmployee() {
		return jdbcTemplate.queryForList(GETALL_QUERY.toString());
	}

}
