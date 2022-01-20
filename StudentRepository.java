package com.progrank.JersyDemo;

//import javax.validation.constraints.Min.List;
import java.util.*;
import java.util.stream.Collectors;


public class StudentRepository {
	
	List<Student>students;
	
	
	public StudentRepository () {
		students= new ArrayList<Student>();
	Student student1 = new  Student(1, "payal", "01/05/2000", "01/01/2021");
	Student student2 = new Student (2,"pranjal","22/11/2005","02/01/2021");
	Student student3 = new Student (3,"Sneha","15/01/2001","04/05/2021");
		
		students.addAll(Arrays.asList(student1,student2,student3));
		}
	public List<Student>getAllStudent(){
		return students;
		
		
	}
	public Student getStudentByNumber(int No){
		return students.stream().filter(X->X.getStudentNumber()==No  )
		.collect(Collectors.toList()).get(0);
		
		
	}
	

}
