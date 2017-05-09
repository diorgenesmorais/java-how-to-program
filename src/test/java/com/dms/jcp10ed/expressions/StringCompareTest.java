package com.dms.jcp10ed.expressions;

public class StringCompareTest {

	public static void main(String[] args) {

		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";

		System.out.printf("s1 == %s%ns2 == %s%ns3 == %s%ns4 == %s%n", s1, s2, s3, s4);

		System.out.printf("s1 %s \"hello\"%n", s1.equals("hello") ? "equals" : "does not equal");

		System.out.printf("s1 %s \"hello\"%n", s1 == "hello" ? "is same object as" : "is the not same object as");

		System.out.printf("First 5 characters of s3 and s4 %s match", s3.regionMatches(0, s4, 0, 5) ? "" : "do not");
		
	}

}
