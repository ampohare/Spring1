package com.aml.clonedemo1;

public class StudentDemo implements Cloneable {
	int studId;
	String studName;
	Marks m;

	@Override
	public String toString() {
		return "StudentDemo [studId=" + studId + ", studName=" + studName + ", m=" + m + "]";
	}

	public StudentDemo(int studId, String studName, Marks m) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.m = m;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Marks getM() {
		return m;
	}

	public void setM(Marks m) {
		this.m = m;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		StudentDemo s = (StudentDemo) super.clone();
		s.setM((Marks)s.getM().clone());
		return s;
	}

}
