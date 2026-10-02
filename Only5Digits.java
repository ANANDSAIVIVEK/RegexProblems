package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Only5Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "12345";
		String input2 = "123456";
		String input3 = "123";

		String regex = "\\d{5}";

		Pattern p = Pattern.compile(regex);

		Matcher m1 = p.matcher(input1);
		Matcher m2 = p.matcher(input3);
		Matcher m3 = p.matcher(input2);

		if(m1.matches()) {
			System.out.println(input1+"-valid");
		}
		if(m2.matches()) {
			System.out.println(input2+"-valid");
		}
		if(m3.matches()) {
			System.out.println(input3+"-valid");
		}


	}

}
