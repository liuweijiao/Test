package com.liu.wei.jiao;

public class Homework7_11 {
	public static void main(String[] args) {
		Car aodi=new Car();
		aodi.setmark("�µ�");
		aodi.setprice(50);
		aodi.setspeed(80);
		System.out.println("������Ʒ����"+aodi.getmark());
		System.out.println(aodi.getmark()+"���ļ۸���"+aodi.getprice());
		System.out.println(aodi.getmark()+"�����ٶ���"+aodi.getspeed());
		aodi.drive();
		aodi.speedChange(120);
		System.out.println(aodi.getmark()+"�����ڵ��ٶ���"+aodi.getspeed());
		
		System.out.println();
		
		Car benchi=new Car();
		benchi.setmark("����");
		benchi.setprice(100);
		benchi.setspeed(90);
		System.out.println("������Ʒ����"+benchi.getmark());
		System.out.println(benchi.getmark()+"���ļ۸���"+benchi.getprice());
		System.out.println(benchi.getmark()+"�����ٶ���"+benchi.getspeed());
		benchi.drive();
		benchi.speedChange(120);
		System.out.println(benchi.getmark()+"�����ڵ��ٶ���"+benchi.getspeed());
		
		System.out.println();
		
	}

}
