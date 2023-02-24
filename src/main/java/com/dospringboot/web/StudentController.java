package com.dospringboot.web;

import com.dospringboot.model.StudentEntity;
import com.dospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudent() {
        List<StudentEntity> allStudent = studentService.getAllStudent();

        return new ResponseEntity<List<StudentEntity>>(allStudent, new HttpHeaders(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Integer id) throws Exception {
        StudentEntity student = studentService.getStudentById(id);
        return new ResponseEntity<StudentEntity>(student, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("getname")
    public String getStudentFirstname() {
        String a = studentService.getStudentFirstname();
       return a;

    }
}
