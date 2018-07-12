package com.liu.wei.jiao;

public class Car {
	private String mark;
	private int price;
	private int speed;
	public void drive() {
		System.out.println("本车正在驾驶");
	}
	public void speedChange(int newSpeed) {
		speed=newSpeed;
	}
	public void setmark(String mark) {
		this.mark=mark;
	}
	public String getmark() {
		return mark;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setspeed(int speed) {
		this.speed=speed;
	}
	public int getspeed() {
		return speed;
	}

}
