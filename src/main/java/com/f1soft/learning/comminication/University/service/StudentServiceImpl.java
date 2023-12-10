package com.f1soft.learning.comminication.University.service;

import com.f1soft.learning.comminication.University.dto.StudentDto;
import com.f1soft.learning.comminication.University.platform.DataBaseConnection;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class StudentServiceImpl implements StudentService {

    private Connection con = DataBaseConnection.getInstance().getConnection();

    @Override
    public boolean findStudentByName(StudentDto studentDto) throws SQLException {
        String findStudentByNameSql = "select * from student where NAME = ?";
        PreparedStatement stmt = con.prepareStatement(findStudentByNameSql);
        stmt.setString(1,studentDto.getName());
        ResultSet resultSet = stmt.executeQuery();
        return resultSet.next();

    }
}
