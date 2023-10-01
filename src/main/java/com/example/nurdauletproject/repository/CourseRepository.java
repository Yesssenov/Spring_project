package com.example.nurdauletproject.repository;


import com.example.nurdauletproject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
