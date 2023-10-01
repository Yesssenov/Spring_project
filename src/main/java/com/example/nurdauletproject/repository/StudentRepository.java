package com.example.nurdauletproject.repository;

import com.example.nurdauletproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
