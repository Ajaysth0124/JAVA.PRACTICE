package org.tnsif.accenture.c2tc.interfacedemo;

public class Student implements Registrable {

	private int id;
	private String name;
	private double fee;
	private String course;
	
	public Student(int id, String name, double fee, String course) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}