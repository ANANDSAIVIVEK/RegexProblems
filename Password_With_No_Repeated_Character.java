package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_With_No_Repeated_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p1 = "An@12345"; //→ Valid
		String p2 = "Aa@12345"; //→ Valid
		String p3 = "Aaa@1234"; //→ Invalid
		
		String regex = "^(?!.*(.)\\1).{8,16}$";// 
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(p1);
		Matcher m2 = p.matcher(p2);
		Matcher m3 = p.matcher(p3);
		
		if(m1.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m2.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m3.matches()) System.out.println("valid");
		else System.out.println("invalid");
		
	}

}
