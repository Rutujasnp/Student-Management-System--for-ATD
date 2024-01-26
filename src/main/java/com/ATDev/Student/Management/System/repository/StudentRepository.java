package com.ATDev.Student.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ATDev.Student.Management.System.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
