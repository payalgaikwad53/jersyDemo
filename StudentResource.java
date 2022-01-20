package com.progrank.JersyDemo;

//import java.awt.List;
//import java.awt.List;
//import java.awt.List;
import java.util.Arrays;
import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("student")

public class StudentResource {
	StudentRepository repository = new StudentRepository();
	@GET
	@Path("getstudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student>getStudent(){
		return repository.getAllStudent();
		}
	@GET
	@Path("getstudent/{No}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student studentByNo(@PathParam("No") int No) {
		return repository.getStudentByNumber(No);
		}

}
