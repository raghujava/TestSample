package com.app.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class LAmdaTest {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		String s="Hi.I.am.coming.to.Hyderabad.today";
		StringTokenizer st=new StringTokenizer(s, ".");
		while(st.hasMoreTokens())
		{
			l.add(st.nextToken());
		}
		Collections.reverse(l);
		//System.out.println(l);
		String r="";
		for(String g:l)
		{
			r=r+"."+g;
		}
		System.out.println(r);
		
	}
}
