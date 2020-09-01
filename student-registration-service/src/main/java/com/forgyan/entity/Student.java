package com.forgyan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_enrollment_number")
	private String enrollementNumber;
	
	@Column(name = "student_first_name")
	private String studentFisrtName;
	
	@Column(name = "student_middle_name")
	private String studentMiddleName;
	
	@Column(name = "student_last_name")
	private String studentLastName;


	public Student() {

	}


	public Student(String enrollementNumber, String studentFisrtName, String studentMiddleName,
			String studentLastName) {
		super();
		this.enrollementNumber = enrollementNumber;
		this.studentFisrtName = studentFisrtName;
		this.studentMiddleName = studentMiddleName;
		this.studentLastName = studentLastName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getEnrollementNumber() {
		return enrollementNumber;
	}


	public void setEnrollementNumber(String enrollementNumber) {
		this.enrollementNumber = enrollementNumber;
	}


	public String getStudentFisrtName() {
		return studentFisrtName;
	}


	public void setStudentFisrtName(String studentFisrtName) {
		this.studentFisrtName = studentFisrtName;
	}


	public String getStudentMiddleName() {
		return studentMiddleName;
	}


	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", enrollementNumber=" + enrollementNumber + ", studentFisrtName="
				+ studentFisrtName + ", studentMiddleName=" + studentMiddleName + ", studentLastName=" + studentLastName
				+ "]";
	}
	
	

}
