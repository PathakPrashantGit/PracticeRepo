package Pract;

public class B extends A {
	public void m1()
	{
		System.out.println("Child");
	}
	public void f2()
	{
		System.out.println("next masti");
	}

	public static void main(String[] args) {
		
		//B z = new A(); // cannot crerat object of B
		
		A z = new B(); // object created for Parent class
//		z.m1(); // override 
//		z.f1();
		
		
		
		
		
		
		
		B z1 = new B(); // object created for child class
		z1.m1();
//		z1.f1();
		z1.f2();
	}
}
