package com.liu.wei.jiao;
import java.util.Scanner; 


public class Test {
	public static void main(String[] args) {
		//  +,-,*,/,%,  <,<=,==,!=,>=,>,  ����?���a:���b,   &,&&,|,||,!,   <<,>>
		//Scanner
//		NarcissusNumber();	
//		Performence();
//		ThreeDigits();
//		Factorial();
//		OddEven();
//		Palindrome();
		
		TestClass liu=new TestClass();
		liu.setMoney(200);
		liu.setName("��ΰ��");
		liu.setNumber(1);
		System.out.println(liu.getMoney()+liu.getName()+liu.getNumber());
		
	}
	
	public static void NarcissusNumber() {
		//��һ��
				System.out.println("ˮ�ɻ���");
				for(int i=100;i<=999;i++) {
					int a=i/100,b=i/10%10,c=i%10;
					if(i==(a*a*a+b*b*b+c*c*c)) {
						System.out.print(i+",");
					}
				}
				System.out.println(" ");
	}
	
	public static void Performence() {
		//�ڶ���
				System.out.print("������ɼ�");
				Scanner Scores=new Scanner(System.in);
				int Marks=Scores.nextInt();
				if(Marks>=90) {
					System.out.println("�ɼ�ΪA");
				}else if((Marks>=60)&(Marks<=89)){
					System.out.println("�ɼ�ΪB");
				}else if(Marks<60){
					System.out.println("�ɼ�ΪC");
				}
	}
	
	public static void ThreeDigits() {
		//������
				int jj=0;
				for(int ii=100;ii<500;ii++) {
					int aa=ii/100,bb=ii%100/10,cc=ii%10;
					if((aa<5)&(aa>0)&(bb>0)&(bb<5)&(cc>0)&(cc<5)&(aa!=bb)&(bb!=cc)&(aa!=cc)) {
						System.out.print(ii+",");
						jj++;
					}
				}
				System.out.println();
				System.out.println("����ɵ���λ���ĸ���Ϊ"+jj);
		
	}
	
	public static void Factorial() {
		//������
				int s=1;
				for(int j=1;j<=9;j++) {
					s=s*j;
				}
				System.out.println("9!="+s);
	}
	
	public static void OddEven() {
		//������
				int n=0,m=0;
				for(int k=1;k<=100;k++) {
					if(k%2==1) {
						n=n+k;
					}else if(k%2==0) {
						m=m+k;
					}
				}
				System.out.println("������="+n+"ż����="+m);
	}
	
	public static void Palindrome() {
		//������
				System.out.print("������һ����λ��");
				Scanner num=new Scanner(System.in);
				int number=num.nextInt();
				int five=number/10000,four=number%10000/1000,two=number%100/10,one=number%10;
				if((five==one)&(four==two)) {
					System.out.println(number+"Ϊ������");
				}else {
					System.out.println(number+"���ǻ�����");
				}
		
	}
}
