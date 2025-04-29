package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	@Autowired
	private StudentService ss;
	
	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		ss.add(student);
	}
	
	@GetMapping("/display")
	public List<Student> display(){
		return ss.display(); 
		}
	
	@DeleteMapping("/delete/{roll}")
	public void delete(@PathVariable int roll) {
		ss.delete(roll);

}
	
	@PutMapping("/update/{roll}")
	public void update(@RequestBody Student student , @PathVariable int roll) {
		ss.upate(student, roll);
	}
	
	@GetMapping("/search")
	public List<Student> searchStudents(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String grade,
            @RequestParam(required = false) String division,
            @RequestParam(required = false) String result) {
        
        return ss.search(
                name != null ? name : "",
                grade != null ? grade : "",
                division != null ? division : "",
                result != null ? result : ""
        );
    }
	
	@GetMapping("/max")
	public List<Student> max(){
		return ss.max();
	}
	
	
	
	}
	
	
	
	
