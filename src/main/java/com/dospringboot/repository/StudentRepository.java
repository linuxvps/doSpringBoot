package com.dospringboot.repository;

import com.dospringboot.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {


    @Procedure("get_student_details")
    String getStudentFirstname();

}
