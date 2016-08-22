package com.evsward.dao_mapper;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int studentId;
	private String name;
	private char grade;

	public Student(int studentId, String name, char grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}

	public final int getStudentId() {
		return studentId;
	}

	public final void setStudentId(final int studentId) {
		this.studentId = studentId;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final char getGrade() {
		return grade;
	}

	public final void setGrade(final char grade) {
		this.grade = grade;
	}

	/**
	 * objects are the same or the objs' studentId are the same
	 */
	@Override
	public boolean equals(final Object obj) {
		boolean isEqual = false;
		if (this == obj) {
			isEqual = true;
		} else if (obj != null && getClass() == obj.getClass()) {
			final Student student = (Student) obj;
			if (this.getStudentId() == student.getStudentId()) {
				isEqual = true;
			}
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		return this.getStudentId();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	}

}
