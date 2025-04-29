package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Student;

public interface StudentService {
	
	public void add (Student s);
	public List<Student> display();
	public void delete(Integer roll);
	public void upate(Student s , Integer roll);
	public List<Student> search (String name,String grade ,String division , String result);
	public List<Student> max();
}
