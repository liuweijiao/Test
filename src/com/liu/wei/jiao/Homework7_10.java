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
		//��һ��
		for(int i=1;i<=7;i++) {
			System.out.println("�������"+i+"����ֵ");
			Scanner number=new Scanner(System.in);
			int num=number.nextInt();
			for(int j=0;j<num;j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	
	public static void year() {
		//�ڶ���
		System.out.println("������һ�����");
		Scanner number=new Scanner(System.in);
		int num=number.nextInt();
		if(num%100==0) {
			if(num%400==0) {
				System.out.println(num+"Ϊ����");
			}else {
				System.out.println(num+"Ϊƽ��");
			}	
		}else {
			if(num%4==0) {
				System.out.println(num+"Ϊ����");
			}else {
				System.out.println(num+"Ϊƽ��");
			}
		}	
	}
	
	public static void judgement() {
		//������
		System.out.println("������һ��ֵ");
		Scanner number1=new Scanner(System.in);
		int num1=number1.nextInt();
		Random number2=new Random();
		int num2=number2.nextInt(20);
		System.out.println(num2);
		if(num1>num2) {
			System.out.println("����");
		}else if(num1==num2) {
			System.out.println("����");
		}else {
			System.out.println("С��");
		}
	}

	public static void add() {
		//������
		int n=0,s=0;
		do {
			n++;
			s=s+n;
		}while(s<100);
		System.out.println(n);
	}
	
	public static void person() {
		//������
		Personnel a=new Personnel();
		a.setAddress("���ɹ������첼��");
		a.setDepartment("��");
		System.out.println(a.getAddress()+a.getDepartment());
				
	}
		
}
