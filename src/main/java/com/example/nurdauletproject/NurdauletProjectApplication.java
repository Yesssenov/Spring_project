package com.example.nurdauletproject;

import com.example.nurdauletproject.model.Course;
import com.example.nurdauletproject.model.Position;
import com.example.nurdauletproject.model.Staff;
import com.example.nurdauletproject.model.Student;
import com.example.nurdauletproject.repository.CourseRepository;
import com.example.nurdauletproject.repository.OrganizationRepository;
import com.example.nurdauletproject.repository.StaffRepository;
import com.example.nurdauletproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NurdauletProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurdauletProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository,
								  CourseRepository courseRepository,
								  StaffRepository staffRepository,
								  OrganizationRepository organizationRepository) {
		return (args) -> {
			studentRepository.deleteAll();
			courseRepository.deleteAll();
			staffRepository.deleteAll();
			organizationRepository.deleteAll();

			studentRepository.save(Student.builder().id(1).name("john").age(21).gender("male").department("IT").build());
			studentRepository.save(Student.builder().id(2).name("mark").age(21).gender("male").department("physics").build());
			studentRepository.save(Student.builder().id(3).name("pearl").age(21).gender("female").department("IT").build());

			courseRepository.save(Course.builder().id(1).courseName("CSA").department("IT").professorName("Arthur").build());
			courseRepository.save(Course.builder().id(2).courseName("Mechanics").department("physics").professorName("Lisa").build());
			courseRepository.save(Course.builder().id(3).courseName("Cyber-security").department("IT").professorName("Arthur").build());

			staffRepository.save(Staff.builder().firstName("Lisa").lastName("Lisa").position(Position.Instructor).gender("female").build());
			staffRepository.save(Staff.builder().firstName("Arthur").lastName("Pol").position(Position.Lecturer).gender("male").build());
			staffRepository.save(Staff.builder().firstName("Alan").lastName("Alan").position(Position.Professor).gender("male").build());


		};
	}

}
