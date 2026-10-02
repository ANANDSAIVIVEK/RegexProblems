package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_All_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Hello Java Programming";
		
		String regex = "[aeiou]+";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
