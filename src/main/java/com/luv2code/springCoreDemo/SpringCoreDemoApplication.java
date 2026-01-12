package com.luv2code.springCoreDemo;

import com.luv2code.springCoreDemo.dao.StudentDAO;
import com.luv2code.springCoreDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudent(studentDAO);
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findByLastName("feri");

		//display list of students
		for (Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		//get list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for (Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Create a stundet");
		Student newStudent = new Student("Takács", "Feri", "takacs.feri@gmail.com");

		//save the student
		System.out.println("Save the new student");
		studentDAO.save(newStudent);

		//display id of the saved student
		System.out.println("Created user id: " + newStudent.getId());

		//retrieve student based on the is: primary key
		System.out.println("Created user data: Name-> " + studentDAO.findById(newStudent.getId()).getFirstName() + " " + studentDAO.findById(newStudent.getId()).getLastName() + " Email: " + studentDAO.findById(newStudent.getId()).getEmail() );
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple student object
		System.out.println("Create multiple student object");
		Student tempStudent1 = new Student("Jack", "Monroe", "jack.monroe@gmail.com");
		Student tempStudent2 = new Student("Jackie", "Black", "jackie.black@gmail.com");
		Student tempStudent3 = new Student("Horzie", "Sanders", "horzie.sanders@gmail.com");

		//save multiple student object
		System.out.println("Save multiple student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//display id of the saved student
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
