package com.obaid.springJDBC_demo.repository;

import com.obaid.springJDBC_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Repo {

    @Autowired
    JdbcTemplate jdbc;
    public void save(Student s)
    {
        String sql="insert into student(ID,mark,name)values(?,?,?)";
        int rows=jdbc.update(sql,s.getID(),s.getMark(),s.getName());
        System.out.println(rows+" rows affected");
    }


    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> st = jdbc.queryForList("select * from student");
        return st;
    }

}
