package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start_with_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Anand";
		String input2 = "Banana";
		String input3 = "Ai";
		String input4 = "A";

		String regex = "^A"; //expression

		Pattern p = Pattern.compile(regex); //compile regex


		//create a matcher for input text
		Matcher m1 = p.matcher(input1);
		Matcher m2 = p.matcher(input2);
		Matcher m3 = p.matcher(input3);
		Matcher m4 = p.matcher(input4);

		if(m1.find()) {
			System.out.println(input1+"-valid");
		}
		if(m2.find()) {
			System.out.println(input2+"-valid");
		}
		if(m3.find()) {
			System.out.println(input3+"-valid");
		}
		if(m4.matches()) {
			System.out.println(input4+"-valid");
		}




	}

}
