package com.dospringboot.service;

import com.dospringboot.model.StudentEntity;
import com.dospringboot.exception.RecordNotFoundException;
import com.dospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<StudentEntity> getAllStudent() {

        List<StudentEntity> studentList = studentRepository.findAll();

        if (studentList.size() > 0) {
            return studentList;
        } else {
            return new ArrayList<StudentEntity>();
        }
    }



    public StudentEntity getStudentById(Integer id) throws RecordNotFoundException {

        Optional<StudentEntity> studentList = studentRepository.findById(id);

        if (studentList.isPresent() ) {
            return studentList.get();
        } else {
            throw new RecordNotFoundException("no Student");
        }
    }

    public String getStudentFirstname(){
        return studentRepository.getStudentFirstname();
    }

}
