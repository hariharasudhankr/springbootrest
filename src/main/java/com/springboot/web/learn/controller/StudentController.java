package com.springboot.web.learn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.web.learn.dao.StudentRepo;
import com.springboot.web.learn.model.Student;

@RestController
//@Controller old implementation
//learn to use @Service makes more sense
public class StudentController {
	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	//POST implementation
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
		
	}

	// GET method implementation
	// returns json
	// http://localhost:8080/searchStudent
	@GetMapping("/student")
	@ResponseBody
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	// GET method implementation
	// returns in json format
	// http://localhost:8080/searchStudent/100
	@GetMapping("/student/{id}")
	@ResponseBody
	public Optional<Student> searchStudent(@PathVariable("id") int id) {
		return repo.findById(id);
	}

	//PUT to update
	@PutMapping(path="/student", consumes= {"appication/json"})
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student")
	public String deleteStudent(@PathVariable("id") int id) {
		Student student=repo.getOne(id);
		repo.delete(student);
		return student.getName()+" deleted";
	}
	/*
	 * @RequestMapping("/addStudent") 
	 * public ModelAndView addStudent(Student
	 * student) 
	 * {
	 *  repo.save(student); ModelAndView mv = new ModelAndView();
	 * 
	 * mv.addObject("studentResponse",student); mv.setViewName("home"); 
	 * }
	 */

	/*
	 * returns in modalview format
	 * 
	 * @RequestMapping("/searchStudent") public ModelAndView
	 * searchtudent(@RequestParam int id) { Student student =
	 * repo.findById(id).orElse(new Student()); ModelAndView mv = new
	 * ModelAndView(); mv.addObject("searchStudent",student);
	 * 
	 * mv.setViewName("searchStudent");
	 * 
	 * return mv; }
	 */

	/*
	 * @RequestMapping("/getAllStudent") public ModelAndView getAllStudent() {
	 * List<Student> student= new ArrayList<>(); repo.findAll().forEach(e ->
	 * student.add(e)); ModelAndView mv = new ModelAndView();
	 * mv.addObject("getAllStudent",student); mv.setViewName("getAllStudent");
	 * 
	 * return mv; }
	 */

}