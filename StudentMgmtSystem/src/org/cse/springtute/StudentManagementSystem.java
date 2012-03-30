package org.cse.springtute;

import java.util.Iterator;

public class StudentManagementSystem {

	private StudentRepository repo;// = new SimpleStudentRepository();

	public void listAllStudents() {

               // List<String> =
                Iterator<Student> stu = repo.findAllStudents().iterator();
                while(stu.hasNext()){
                    Student next = stu.next();
                    System.out.println(next.getRegNumber()+"\t"+next.getFirstName()+" "+next.getLastName());
                }
                //Get all the students from repository and print them in the screen
	}

	public void registerStudent(Student stu){
		//Save the new student using repository
            repo.saveStudent(stu);
	}
}
