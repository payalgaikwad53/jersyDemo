package com.progrank.JersyDemo;

public class Student {
	
	private int studentNumber;
	private String studentName;
	private String studentDateofBirth;
	private String studentDateofJoin;
	
	

	public Student(int studentNumber, String studentName, String studentDateofBirth, String studentDateofJoin) {
		this.studentNumber      = studentNumber;
		this.studentName        = studentName;
		this.studentDateofBirth = studentDateofBirth;
		this.studentDateofJoin  = studentDateofJoin;
		
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentDateofBirth() {
		return studentDateofBirth;
	}
	public String getStudentDateofJoin() {
		return studentDateofJoin;
	}
	
	
	


	

}
