package com.sb.jdbc.dao.Empl;

import com.sb.jdbc.dao.Empl.Entity.EmplEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmplRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public String insertData(EmplEntity empl) {

String insert="insert into empl values(?,?,?,?)";
    }
}
