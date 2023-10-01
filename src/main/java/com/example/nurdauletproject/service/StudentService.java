package com.example.nurdauletproject.service;

import com.example.nurdauletproject.model.Student;
import com.example.nurdauletproject.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@AllArgsConstructor

public class StudentService {

    private final StudentRepository studentRepository;



    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(@RequestParam int id) {
         return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with this ID: " + id));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }




}
