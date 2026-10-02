package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Indian_mobile_number_validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = "8096105591";
		String num2 = "8123456789";
		String num3 = "81234567789";
		String num4 = "987654321";
		String num5 = "98765432101";

		String regex = "^[6-9][0-9]{9}$";

		Pattern p = Pattern.compile(regex);

		Matcher m1 = p.matcher(num1);
		Matcher m2 = p.matcher(num2);
		Matcher m3 = p.matcher(num3);
		Matcher m4 = p.matcher(num4);
		Matcher m5 = p.matcher(num5);

		if(m1.matches()) {
			System.out.println(num1+"-validate");
		}
		if(m2.matches()) {
			System.out.println(num2+"-validate");
		}
		if(m3.matches()) {
			System.out.println(num3+"-validate");
		}
		if(m4.matches()) {
			System.out.println(num4+"-validate");
		}
		if(m5.matches()) {
			System.out.println(num5+"-validate");
		}


	}

}
