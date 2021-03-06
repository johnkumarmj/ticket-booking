package com.ticket.booking.Dao;


import com.ticket.booking.Entity.employeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConnectionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public employeEntity getEmployeeDetails( String Query,int employeEn, int dep,employeEntity employeEntity){
        jdbcTemplate.query(Query , new BeanPropertyRowMapper(employeEntity.class),employeEn,dep);
      return employeEntity ;
    }

}
