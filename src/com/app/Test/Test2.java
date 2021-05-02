package com.app.Test;

public class Test2 {

	int n=2;
	static int a;
	final int f=10;
	void m1()
	{
		a=5;
		System.out.println(n+" "+a+" "+f);
	}
	static void m2()
	{
		a=9;
	}
	public static void main(String[] args) {
		new Test2().m1();
		
		Test2 w=new Test2();
		w.n=3;
		System.out.println(w.n);
		
	}
	
}
