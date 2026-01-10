package com.luv2code.springCoreDemo;

import com.luv2code.springCoreDemo.dao.StudentDAO;
import com.luv2code.springCoreDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Create student object");
		Student tempStudent = new Student("Jack", "Monroe", "jack.monroe@gmail.com");

		//save student object
		System.out.println("Save the new student");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Student is saved. Generated id: " + tempStudent.getId());
	}
}
