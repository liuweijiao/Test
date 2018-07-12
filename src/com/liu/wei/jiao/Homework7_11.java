package com.liu.wei.jiao;

public class Homework7_11 {
	public static void main(String[] args) {
		Car aodi=new Car();
		aodi.setmark("奥迪");
		aodi.setprice(50);
		aodi.setspeed(80);
		System.out.println("本车的品牌是"+aodi.getmark());
		System.out.println(aodi.getmark()+"车的价格是"+aodi.getprice());
		System.out.println(aodi.getmark()+"车的速度是"+aodi.getspeed());
		aodi.drive();
		aodi.speedChange(120);
		System.out.println(aodi.getmark()+"车现在的速度是"+aodi.getspeed());
		
		System.out.println();
		
		Car benchi=new Car();
		benchi.setmark("奔驰");
		benchi.setprice(100);
		benchi.setspeed(90);
		System.out.println("本车的品牌是"+benchi.getmark());
		System.out.println(benchi.getmark()+"车的价格是"+benchi.getprice());
		System.out.println(benchi.getmark()+"车的速度是"+benchi.getspeed());
		benchi.drive();
		benchi.speedChange(120);
		System.out.println(benchi.getmark()+"车现在的速度是"+benchi.getspeed());
		
		System.out.println();
		
	}

}
