package com.ATDev.Student.Management.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private int marks;
	private int outOfMarks;
	private double percentage;
	
	public Student() {
		super();
	}

	public Student(long id, String name, int marks, int outOfMarks, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.outOfMarks = outOfMarks;
		this.percentage = percentage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getOutOfMarks() {
		return outOfMarks;
	}

	public void setOutOfMarks(int outOfMarks) {
		this.outOfMarks = outOfMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	

}
