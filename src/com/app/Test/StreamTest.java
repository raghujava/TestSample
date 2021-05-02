package com.app.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,6,9,7,43,5);
		Stream<Integer> s=l.stream();
				s.forEach(System.out::println);// Streams are ont time useable
				s.map(a->a*2).forEach(System.out::println);
		
	}
}
