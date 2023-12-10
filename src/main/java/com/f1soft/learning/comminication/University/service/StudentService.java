package com.f1soft.learning.comminication.University.service;

import com.f1soft.learning.comminication.University.dto.StudentDto;

import java.sql.SQLException;

public interface StudentService {
    boolean
    findStudentByName(StudentDto studentDto) throws SQLException;
}
