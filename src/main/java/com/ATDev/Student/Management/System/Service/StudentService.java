package com.ATDev.Student.Management.System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ATDev.Student.Management.System.Entity.Student;
import com.ATDev.Student.Management.System.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
	public Optional<Student> findStudentById(Long id) {
		return studentRepository.findById(id);
	}
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public String deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return "Student data removed : "+ id;
	}
	
	public Student updateStudent( Student student) {
		Student existingStudent=studentRepository.findById(student.getId()).orElse(null);
		existingStudent.setName(student.getName());
		existingStudent.setMarks(student.getMarks());
		existingStudent.setOutOfMarks(student.getOutOfMarks());
		existingStudent.setPercentage(student.getPercentage());
		return studentRepository.save(existingStudent);
	}
	
}
