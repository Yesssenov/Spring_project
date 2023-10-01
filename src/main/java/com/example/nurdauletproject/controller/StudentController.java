package com.example.nurdauletproject.controller;


import com.example.nurdauletproject.model.Student;
import com.example.nurdauletproject.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;


    @GetMapping("/{studentId}")
    public Student getEmployeeById(@PathVariable int studentId) {

        Optional<Student> optional = Optional.of(studentService.getStudentById(studentId));

        System.out.println("getEmployeeById");

        if (optional.isPresent()) return optional.get();
        return null;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        System.out.println("found");
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        Student savedStudent = studentService.create(student);
        System.out.println("Success");
        return savedStudent;
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudentById(@PathVariable int studentId) {
        studentService.deleteStudentById(studentId);
    }

    @DeleteMapping("/all")
    public void deleteAllStudents() {
        studentService.deleteAllStudents();

    }
}
