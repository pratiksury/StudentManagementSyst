package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int roll;
	private String name;
	private float marks;
	private String grade;
	private String result;
	private String division;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, float marks, String grade, String result, String division) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
		this.result = result;
		this.division = division;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + ", result="
				+ result + ", division=" + division + "]";
	}
	
	
	
	

}
