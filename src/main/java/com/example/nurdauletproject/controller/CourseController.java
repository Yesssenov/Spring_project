package com.example.nurdauletproject.controller;


import com.example.nurdauletproject.model.Course;
import com.example.nurdauletproject.model.Staff;
import com.example.nurdauletproject.service.CourseService;
import com.example.nurdauletproject.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;
    private StaffService staffService;

    @Autowired
    public CourseController(CourseService courseService, StaffService staffService){
        this.courseService = courseService;
        this.staffService = staffService;
    }

    @GetMapping()
    public List<Course> findAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("/{courseId}")
    public Course findCourseById(@PathVariable int courseId) {
        Optional<Course> optionalCourse = Optional.of(courseService.findCourseById(courseId));

        if (optionalCourse.isPresent()) return optionalCourse.get();
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        courseService.deleteCourseById(id);
        return "Course deleted with id: " + id;
    }

    @PutMapping("/updatedCourse/{id}")
    public Course update(@RequestBody Course course, @PathVariable int id){
        Staff staff = new Staff();
        staff.setStaffId(id);
        course.setStaffId(staff);
        courseService.saveCourse(course);
        return course;
    }

    @PutMapping
    public List<Course> saveAllCourses(List<Course> courseList) {
        return courseService.saveAllCourses(courseList);
    }





}
