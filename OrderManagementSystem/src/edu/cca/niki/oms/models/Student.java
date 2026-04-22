package edu.cca.niki.oms.models;

public class Student {
 private Integer rollno;
 private String name;
 private  String email;
 private String course;
 private Double Cgpa;
 public Student() {
	super();
	// TODO Auto-generated constructor stub
 }
 public Student(Integer rollno, String name, String email, String course, Double cgpa) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.email = email;
	this.course = course;
	Cgpa = cgpa;
 }
}
