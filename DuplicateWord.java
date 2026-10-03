package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "Java Java Java Java is easy";       // Duplicate found
		String text2 = "Java is is easy"    ;     // Duplicate found
		String text3 = "Java is very easy"   ;    // No duplicate
		
		String regex = "(\\w+)\\s+\\1";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(text1);
		Matcher m2 = p.matcher(text2);
		Matcher m3 = p.matcher(text3);
		
		if(m1.find()) {
			System.out.println("duplicate found");
		}
		else System.out.println("not a duplicate");
		if(m2.find()) {
			System.out.println("duplicate found");
		}
		else System.out.println("not a duplicate");
		if(m3.find()) {
			System.out.println("duplicate found");
		}
		else System.out.println("not a duplicate");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(p);
		System.out.println(regex);
	}

}
