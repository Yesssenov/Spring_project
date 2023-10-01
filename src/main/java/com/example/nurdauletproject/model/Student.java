package com.example.nurdauletproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "studentId")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "department")
    private String department;

/*    @OneToMany(mappedBy = "studentId", cascade = {CascadeType.ALL})
    private List<Enrollment> enrollments = new ArrayList<>();


    public Student(String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public void addToEnrollment(Enrollment enrollment) {
        this.enrollments.add(enrollment);
    }*/


}

