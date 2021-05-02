package com.app.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
	
	List<Integer> l=Arrays.asList(2,4,7,9,5,23);
	//l.forEach(a->System.out.println(a));
	String [] s=new String[10];
	s[0]="ram";
	s[1]="RAam";
	Optional<String> o=Optional.ofNullable(s[2]);
			System.out.println(o.isPresent());
}
}