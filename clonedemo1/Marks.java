package com.aml.clonedemo1;

public class Marks implements Cloneable  {
	int a;

	@Override
	public String toString() {
		return "Marks [a=" + a + "]";
	}

	public Marks(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
