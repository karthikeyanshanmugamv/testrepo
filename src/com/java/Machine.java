package com.java;

public class Machine extends Engine  {


@Override
public void setAge(byte age) {
	// TODO Auto-generated method stub
	super.setAge(age);
}
@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
public static void main(String[] args) {
	Machine a=new Machine();
	a.setAge(5);
	a.getAge();
}
}
