package com.app.Test;

public class Test {

	public static void main(String[] args) {
		/*
		 * int x=10; int y=10;
		 * 
		 * int z=x++;
		 * int w=++y;
		 * System.out.println(z); 10
		 * System.out.println(w); 11
		 */
	
	String s=new String("hi");
	String s1=new String("hi").intern();
	String s2="hi";
	String s3=new String("hi");
	System.out.println(s==s1);
	System.out.println(s1==s2);
	System.out.println(s3==s2);
	System.out.println(s2.equals(s3));
	System.out.println(s.equals(s1));
	
}
}