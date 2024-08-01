
package com.graymatter;

public class DemoOnOverloading {
	//change on type of parameters
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(float f1, float f2)
	{
		System.out.println(f1+f2);
	}
	
	public void add(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	//change on num of parameters
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double d1,double d2,double d3,double d4)
	{
		System.out.println(d1+d2+d3+d4);
	}
	
	//change on order of parameters
	public void add(int a,double d)
	{
		System.out.println(a+d);
	}
	
	public void add(double d,int a)
	{
		System.out.println(d+a);
	}
	
//	public void add(Complex c1,Complex c2)
//	{
//		Complex c3= new Complex();
//		c3.img=c1.img+c2.img;
//		c3.real=c1.real+c2.real;
//		System.out.println(c3.real+"+"+c3.img+"i");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		DemoOnOverloading doo= new DemoOnOverloading();
//		doo.add(34, 56);
//		doo.add(3.4f, 5.6f);
//		doo.add(3.4,5.6,6.7,8.9);
//		doo.add("hello","world");
//		Complex c1=new Complex(3,4);
//		Complex c2=new Complex(5,6);
//		doo.add(c1, c2);
//		
	}


