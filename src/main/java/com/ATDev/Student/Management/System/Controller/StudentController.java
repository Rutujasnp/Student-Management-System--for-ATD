package com.ATDev.Student.Management.System.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ATDev.Student.Management.System.Entity.Student;
import com.ATDev.Student.Management.System.Service.StudentService;

@RestController
@RequestMapping("/StudentData")
public class StudentController {

	@Autowired
	public StudentService studentService;
	
@GetMapping("/getStudentsList")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
		
	}
@GetMapping("/getStudentById/{id}")
	public Optional<Student> findStudentById( @PathVariable Long id) {
		return studentService.findStudentById(id);
	}
@PostMapping("createNewStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	@PutMapping("/updateStudent")
	public Student updateStudent( @RequestBody Student updateStudent) {
		return studentService.updateStudent( updateStudent);
	}
}
