package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Anand";
		String input2 = "Java";
		String input3 = "Anand123";
		String input4 = "Java_Dev";

		String regex = "[A-Za-z]+";

		Pattern p = Pattern.compile(regex);

		Matcher matcher1 = p.matcher(input1);
		Matcher matcher2 = p.matcher(input2);
		Matcher matcher3 = p.matcher(input3);
		Matcher matcher4 = p.matcher(input4);

		if(matcher1.matches()) {
			System.out.println(input1+"-valid");
		}
		if(matcher2.matches()) {
			System.out.println(input2+"-valid");
		}
		if(matcher3.matches()) {
			System.out.println(input3+"-valid");
		}
		if(matcher4.matches()) {
			System.out.println(input4+"-valid");
		}
	}

}
