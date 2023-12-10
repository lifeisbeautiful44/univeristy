package com.f1soft.learning.comminication.University.controller;


import com.f1soft.learning.comminication.University.dto.StudentDto;
import com.f1soft.learning.comminication.University.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.SQLOutput;

@RestController
@RequestMapping("/find/student")
public class UniversityController {

    @Autowired
    private StudentService studentService;
    @PostMapping()
    public ResponseEntity<Boolean> findStudentByName(@RequestBody StudentDto studentDto) throws SQLException {
        System.out.println(studentDto.getName());

        boolean studentExist = studentService.findStudentByName(studentDto);

        if(studentExist)
        {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
           return new ResponseEntity<>(false,HttpStatus.OK);
        }

    }




}
