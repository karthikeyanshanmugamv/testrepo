package com.java;

import java.sql.SQLException;

public class Engine {
 private int age;
 private String name;
public int getAge() {
	return age;
}
 void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(byte age) {
	System.out.println("po");
	this.age = age;
}
}
