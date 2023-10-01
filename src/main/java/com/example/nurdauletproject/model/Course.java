package com.example.nurdauletproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "department")
    private String department;

    @Column(name = "professor_name")
    private String professorName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="staff_id")
    private Staff staffId;

    public Course() {}

}
