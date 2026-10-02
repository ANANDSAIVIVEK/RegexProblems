package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Java123 is faster than Python45 in 2026";
		
		String regex = "\\d+";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(word);
		
		while(m.find()) {
			System.out.println(m.group());
			
		}

	}

}
