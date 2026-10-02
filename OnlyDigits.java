package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "12345";
		String input2 = "987654";
		String input3 =	"12a45";
		String input4 =   "12.45";

		String regex = "\\d+"; // define pattern

		Pattern pattern = Pattern.compile(regex);  //compile the pattern

		//create a matcher for your input text
		Matcher matcher = pattern.matcher(input1);
		Matcher matcher2 = pattern.matcher(input2);
		Matcher matcher3 = pattern.matcher(input3);
		Matcher matcher4 = pattern.matcher(input4);

			if(matcher.matches()) {
				System.out.println(matcher.group()+"-valid");
			}
			if(matcher2.matches()) {
				System.out.println(matcher2.group()+"-valid");
			}
			if(matcher3.matches()) {
				System.out.println(matcher3.group()+"-valid");
			}
			if(matcher4.matches()) {
				System.out.println(matcher4.group()+"-valid");
			}



	}

}
