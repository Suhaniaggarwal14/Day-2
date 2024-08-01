
package com.graymatter;

public class DemoOnStatic {
	
	static String name; //shared properties- value changed will impact all the objects
	
	public static void sayHello(/*String name*/)//if static not specified then we need to create an obj to access the method
	{
//		this.name=name;
//		System.out.println("hello.."+name);
		System.out.println("hello.."+name);//static method always uses static properties
	}
	
	static
	{
		System.out.println("static block 1");
	}
	static
	{
		System.out.println("static block 2");
	}
	static
	{
		System.out.println("static block 3");
	}
	
	// static blocks are executed before any other method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		sayHello();
		main();
		DemoOnStatic.main(); //used when the static method is used in a different class(to address the method of same name)
		DemoOnStatic ds1= new DemoOnStatic();
		DemoOnStatic ds2= new DemoOnStatic();
		DemoOnStatic ds3= new DemoOnStatic();
		name="amit";
		ds1.sayHello();
		ds3.sayHello();
		name="anil";
		ds2.sayHello();
		

	}
	
	public static void main()
	{
		System.out.println("static main without argument");
	}
	
	static
	{
		System.out.println("static block 4");
	}

}
