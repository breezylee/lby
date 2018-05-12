package com.yame.ubi.dao;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyBeanDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Qualifier("readJdbcTemplate")
	@Autowired
	private JdbcTemplate jdbcTemplateReadOnly;
	
	public Map<String, Object> getRepacket(long id) {
		String sql = "SELECT * FROM ubi_receive_record WHERE id = ?";
		Map<String, Object>  map = jdbcTemplateReadOnly.queryForMap(sql, id);
		return map;
	}
	
	public int update(long userId, int bind) {
		String sql = "update ubi_receive_record set obd_bind = ?, update_time = ? where user_id = ?";
        return jdbcTemplate.update(sql, bind, new Date(), userId);
	}
	
}
