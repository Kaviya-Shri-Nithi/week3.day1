package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Student Name");
		
	}
	public void studentDept() {
		
		System.out.println("Student Dept");
		
	}
	public void studentId() {
		
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}

}
