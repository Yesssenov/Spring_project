package com.example.nurdauletproject.service;

import com.example.nurdauletproject.model.Course;
import com.example.nurdauletproject.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course findCourseById(@RequestParam int id) {
        return courseRepository.findById(id).get();
    }

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> saveAllCourses(List<Course> courseList) {
        return courseRepository.saveAll(courseList);
    }

    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }

    public void deleteAllCourses() {
        courseRepository.deleteAll();
    }

}

