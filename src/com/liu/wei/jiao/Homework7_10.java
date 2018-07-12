package com.liu.wei.jiao;

import java.util.Random;
import java.util.Scanner;

public class Homework7_10 {
	public static void main(String[] args) {
//		seven();
//		year();
//	judgement();
		add();
//		person();
	}

	public static void seven() {
		//第一题
		for(int i=1;i<=7;i++) {
			System.out.println("请输入第"+i+"个数值");
			Scanner number=new Scanner(System.in);
			int num=number.nextInt();
			for(int j=0;j<num;j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	
	public static void year() {
		//第二题
		System.out.println("请输入一个年份");
		Scanner number=new Scanner(System.in);
		int num=number.nextInt();
		if(num%100==0) {
			if(num%400==0) {
				System.out.println(num+"为闰年");
			}else {
				System.out.println(num+"为平年");
			}	
		}else {
			if(num%4==0) {
				System.out.println(num+"为闰年");
			}else {
				System.out.println(num+"为平年");
			}
		}	
	}
	
	public static void judgement() {
		//第三题
		System.out.println("请输入一个值");
		Scanner number1=new Scanner(System.in);
		int num1=number1.nextInt();
		Random number2=new Random();
		int num2=number2.nextInt(20);
		System.out.println(num2);
		if(num1>num2) {
			System.out.println("大于");
		}else if(num1==num2) {
			System.out.println("等于");
		}else {
			System.out.println("小于");
		}
	}

	public static void add() {
		//第四题
		int n=0,s=0;
		do {
			n++;
			s=s+n;
		}while(s<100);
		System.out.println(n);
	}
	
	public static void person() {
		//第五题
		Personnel a=new Personnel();
		a.setAddress("内蒙古乌兰察布市");
		a.setDepartment("无");
		System.out.println(a.getAddress()+a.getDepartment());
				
	}
		
}
