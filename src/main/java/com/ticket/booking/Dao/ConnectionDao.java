package com.ticket.booking.Dao;


import com.ticket.booking.Entity.employeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConnectionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<employeEntity> getEmployeeDetails( String Query,int employeEn, int dep,employeEntity employeEntity){
       return jdbcTemplate.query(Query , new BeanPropertyRowMapper<>(employeEntity.class),employeEn,dep);
      //jdbcTemplate.queryForObject(Query,String.class,employeEn,dep);
    }

}
