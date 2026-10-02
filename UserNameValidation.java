package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Anand_1234";
		String name2 = "sai1234";
		String name3 = "12345";
		String name4 = "Vivek_5832";

		String regex = "[A-Za-z_]+";

		Pattern p = Pattern.compile(regex);

		Matcher m1 = p.matcher(name1);
		Matcher m2 = p.matcher(name2);
		Matcher m3 = p.matcher(name3);
		Matcher m4 = p.matcher(name4);

		if(m1.find()) {
			System.out.println(name1);
		}
		if(m2.find()) {
			System.out.println(name2);
		}
		if(m3.find()) {
			System.out.println(name3);
		}
		if(m4.find()) {
			System.out.println(name4);
		}

	}

}
