

create type position as ENUM('Teacher', 'Professor', 'Lecturer', 'Instructor');

create table staff (
    staff_id bigint not null,
    first_name varchar(12),
    last_name varchar(10),
    gender varchar(6),
    position position not null,
    primary key (staff_id)
);

create table course (
  course_id bigint not null,
  course_name varchar(16),
  department varchar(12),
  professor_name varchar(12),
  staff_id staff not null,
  primary key (course_id)
);

create table student (
    student_id bigint not null,
    name varchar(12),
    age int,
    gender varchar(12),
    department varchar(12),
    primary key (student_id)
);


create table organization (
    organization_id bigint not null,
    organization_name varchar(15),
    email varchar(15),
    website varchar(15),
    primary key (organization_id)
);

--liquibase formatted sql
--changeset <Darkhan>:<insertion>


insert into course(course_id, course_name, department, professor_name) VALUES
                                                                           (1, 'CSA', 'IT', 'Arthur'),
                                                                           (2, 'Mechanics', 'physics', 'Lisa'),
                                                                           (3, 'Cyber-security', 'IT', 'Arthur');

insert into staff(staff_id, first_name, last_name, gender) values
                                                               (1, 'Lisa', 'Lisa', 'female'),
                                                               (2, 'Arthur', 'Pol', 'male'),
                                                               (3, 'Alan', 'Alan', 'male');

insert into organization(organization_id, organization_name, email, website) values
                                                                                 (1, 'IITU', 'iitu@gmail.com', 'iitu.com'),
                                                                                 (2, 'SDU', 'sdu@gmail.com', 'sdu.com'),
                                                                                 (3, 'KBTU', 'kbtu@gmail.com', 'kbtu.com');
insert into student(student_id, name, age, gender, department) values
                                                                   (1, 'john', 21, 'male', 'IT'),
                                                                   (2, 'mark', 21, 'male', 'physics'),
                                                                   (3, 'pearl', 21, 'female', 'IT');




