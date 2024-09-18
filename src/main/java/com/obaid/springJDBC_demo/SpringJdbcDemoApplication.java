package com.obaid.springJDBC_demo;

import com.obaid.springJDBC_demo.model.Student;
import com.obaid.springJDBC_demo.repository.Repo;
import com.obaid.springJDBC_demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student st=context.getBean(Student.class);
		st.setID(5);
		st.setMark(90);
		st.setName("Abdulrhman");

		StudentService service=context.getBean(StudentService.class);
		service.AddStudent(st);
		Repo studentrepo=context.getBean(Repo.class);
		studentrepo.save(st);
		List<Map<String, Object>> students=service.getStudents();
		System.out.println(students);



	}

}
