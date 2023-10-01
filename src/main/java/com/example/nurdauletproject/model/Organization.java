package com.example.nurdauletproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id")
    private Integer organizationId;

    @Column(name = "organization_name")
    private String orgName;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;
/*
    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JsonBackReference
    private List<Professor> professorList;

    public void addProfessor(Professor professor) {
        this.professorList.add(professor);
    }

    public void removeProfessor(Professor professor) {
        this.professorList.remove(professor);
    }

    public void removeAllProfessors(Professor professor) {
        this.professorList.clear();
    }*/
}
