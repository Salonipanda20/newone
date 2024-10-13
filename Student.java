package com.resultmanagement.model;

public class Student {
	private String rollNo;
    private String name;
    private String fatherName;
    private String gender;
	private String course;
	
	// No-argument constructor (explicitly defined)
    public Student() {
        // Initialize default values if needed
    }

    public Student(String course, String branch, String rollNo, String name, String fatherName, String gender) {
		super();
		this.course = course;
		this.branch = branch;
		this.rollNo = rollNo;
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
	}
	private String branch;
    public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

   

    
}


