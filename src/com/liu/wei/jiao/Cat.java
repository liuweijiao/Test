package com.liu.wei.jiao;

public class Cat {
	private String type;
	private int age;
	private String color;
	public Cat(String type,int age,String color) {
		this.type=type;
		this.age=age;
		this.color=color;
	}
	
	public void settype(String type) {
		this.type=type;
	}
	public String gettype() {
		return type;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
}
