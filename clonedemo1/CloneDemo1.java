package com.aml.clonedemo1;

public class CloneDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Marks m1=new Marks(100);
		StudentDemo s=new StudentDemo(1, "amol", m1);
		StudentDemo s1= (StudentDemo)s.clone();
		System.out.println(s);
		//s.studId=2;
		s.m.setA(120);
		System.out.println(s);
		System.out.println(s1);
	}

}
