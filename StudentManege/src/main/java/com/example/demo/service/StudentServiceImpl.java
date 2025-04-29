package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;



	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		

	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void delete(Integer roll) {
		// TODO Auto-generated method stub
		sr.deleteById(roll);

	}

	@Override
	public void upate(Student s, Integer roll) {
		// TODO Auto-generated method stub
		s.setRoll(roll);
		sr.save(s);

	}

	@Override
	public List<Student> search(String name, String grade, String division, String result) {
		
		var studentArray = new ArrayList<Student>();
		if(!name.isEmpty()) {
			for (Student student : sr.findAll()) {
				if(student.getName().equalsIgnoreCase(name)) {
					return studentArray;
				}
			}	
		}
		else if(!grade.isEmpty()) {
			for (Student student : sr.findAll()) {
				if(student.getGrade().equalsIgnoreCase(grade)) {
					return studentArray;
				}
			}	
		}
		else if(!division.isEmpty()) {
			for (Student student : sr.findAll()) {
				if(student.getDivision().equalsIgnoreCase(division)) {
					return studentArray;
				}
			}	
		}
		else {
			for (Student student : sr.findAll()) {
				if(student.getResult().equalsIgnoreCase(result)) {
					studentArray.add(student);
					return studentArray;
				}
			}	
		}		
		return null;
	}	
	

	@Override
	public List<Student> max() {
	    List<Student> allStudents = sr.findAll();
	    List<Student> maxMarksStudents = new ArrayList<Student>();

	    float max = Float.MIN_VALUE;  // corrected from Integer.MIN_VALUE

	    // First, find the maximum marks
	    for (Student student : allStudents) {
	        if (student.getMarks() > max) {
	            max = student.getMarks();
	        }
	    }

	    // Then, collect all students who have maximum marks
	    for (Student student : allStudents) {
	        if (student.getMarks() == max) {
	            maxMarksStudents.add(student);
	        }
	    }

	    return maxMarksStudents;
	}

	}

	

