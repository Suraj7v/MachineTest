package com.Example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = {"http://localhost:8080/loginappusingservlet/index.html"})
@RestController
@RequestMapping("api")
public class StudentAPI 
{

	List<Student>  list=new ArrayList();
	
	@RequestMapping("display")
	String display()
	{
		return "Java is easy";
	}
	
	StudentAPI()
	{
		list.add(new Student(1,90));
		list.add(new Student(2,80));
	}
	
	@GetMapping("allStudents")
	List<Student>  allStudents()
	{
		return list;
	}
	@GetMapping("student/{rno}")
	Student getStudent(@PathVariable int rno)
	{
			Student stu = null;
			
			for(Student student : list)
			{
				if(student.rno==rno)
				{
					
					stu=student;
					break;
					
				}
			}
		
			return stu;
	
	}

	@PostMapping("student")
	List<Student> addStudent(@RequestBody Student student)
	{
			
		list.add(student);
			
		System.out.println(list);
		
		return list;
	}
	
	@PutMapping("student")
	String updateStudent(@RequestBody Student clientStudent)
	{
		Student stu=null;
		
		for(Student student:list)
		{
			if(student.rno==clientStudent.rno)
			{
				stu=student;
							
			}
		}
				
		stu.setMarks(clientStudent.marks);
		
		System.out.println(list);

		return "Student updated in arraylist";
	}
	
	@DeleteMapping("student/{rno}")
	String deleteStudent(@PathVariable int rno)
	{
			
			    Student stu=null;
			
				for(Student student:list)
				{
					if(student.rno==rno)
					{
							stu=student;
					}
				}
				
				list.remove(stu);

				System.out.println(list);
					
			    return "Student deleted from  arraylist";
	}

}