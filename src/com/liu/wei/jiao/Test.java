package com.liu.wei.jiao;
import java.util.Scanner; 


public class Test {
	public static void main(String[] args) {
		//  +,-,*,/,%,  <,<=,==,!=,>=,>,  条件?结果a:结果b,   &,&&,|,||,!,   <<,>>
		//Scanner
//		NarcissusNumber();	
//		Performence();
//		ThreeDigits();
//		Factorial();
//		OddEven();
//		Palindrome();
		
		TestClass liu=new TestClass();
		liu.setMoney(200);
		liu.setName("刘伟娇");
		liu.setNumber(1);
		System.out.println(liu.getMoney()+liu.getName()+liu.getNumber());
		
	}
	
	public static void NarcissusNumber() {
		//第一题
				System.out.println("水仙花数");
				for(int i=100;i<=999;i++) {
					int a=i/100,b=i/10%10,c=i%10;
					if(i==(a*a*a+b*b*b+c*c*c)) {
						System.out.print(i+",");
					}
				}
				System.out.println(" ");
	}
	
	public static void Performence() {
		//第二题
				System.out.print("请输入成绩");
				Scanner Scores=new Scanner(System.in);
				int Marks=Scores.nextInt();
				if(Marks>=90) {
					System.out.println("成绩为A");
				}else if((Marks>=60)&(Marks<=89)){
					System.out.println("成绩为B");
				}else if(Marks<60){
					System.out.println("成绩为C");
				}
	}
	
	public static void ThreeDigits() {
		//第三题
				int jj=0;
				for(int ii=100;ii<500;ii++) {
					int aa=ii/100,bb=ii%100/10,cc=ii%10;
					if((aa<5)&(aa>0)&(bb>0)&(bb<5)&(cc>0)&(cc<5)&(aa!=bb)&(bb!=cc)&(aa!=cc)) {
						System.out.print(ii+",");
						jj++;
					}
				}
				System.out.println();
				System.out.println("能组成的三位数的个数为"+jj);
		
	}
	
	public static void Factorial() {
		//第四题
				int s=1;
				for(int j=1;j<=9;j++) {
					s=s*j;
				}
				System.out.println("9!="+s);
	}
	
	public static void OddEven() {
		//第五题
				int n=0,m=0;
				for(int k=1;k<=100;k++) {
					if(k%2==1) {
						n=n+k;
					}else if(k%2==0) {
						m=m+k;
					}
				}
				System.out.println("奇数和="+n+"偶数和="+m);
	}
	
	public static void Palindrome() {
		//第六题
				System.out.print("请输入一个五位数");
				Scanner num=new Scanner(System.in);
				int number=num.nextInt();
				int five=number/10000,four=number%10000/1000,two=number%100/10,one=number%10;
				if((five==one)&(four==two)) {
					System.out.println(number+"为回文数");
				}else {
					System.out.println(number+"不是回文数");
				}
		
	}
}
