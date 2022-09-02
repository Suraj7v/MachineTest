package com.Example.controller;


public class Student {

	
	int rno;
	int marks;
	
	Student()
	{
		
	}
	
	Student(int rno,int marks)
	{
		this.rno=rno;
		this.marks=marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
}

