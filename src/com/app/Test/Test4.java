package com.app.Test;

public class Test4 {

	public static void main(String[] args) {
	
	int n=34;
	boolean f=true;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			f=false;
			break;
		}
	
	}
	if(f)
	{
		System.out.println("prime");
	}
	else
		System.out.println("not");
	
}
}