
package com.graymatter;

public class MainClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		School sc=new School("KV","bangalore");
//		sc.finalize();
		
		Student s1=new Student ("dhanya",123);
		Student s2=new Student ("swapna",234);
		Student s3=new Student ("swathi",345);
		Student st[]= {s1,s2,s3};
//		Classroom c= new Classroom(5,7,st);
		
		System.out.println(sc);
//		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		MainClass mc= new MainClass();
		mc.finalize();
		
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Manual Invoke to Finalize");
		System.gc();
	}

}
