package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Credit_Card_Format {
//	1234-5678-9012-3456 → Valid
//	1234567890123456    → Valid
//	1234-5678-9012      → Invalid
//	1234-5678-9012-ABCD → Invalid
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1 = "1234-5678-9012-3456";
		String c2 = "1234567890123456";
		String c3 = "1234-5678-9012";
		String c4 = "1234-5678-9012-ABCD";
		
		String regex = "(^\\d{16}|\\d{4}-\\d{4}-\\d{4}-\\d{4}$)";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(c1);
		Matcher m2 = p.matcher(c2);
		Matcher m3 = p.matcher(c3);
		Matcher m4 = p.matcher(c4);
		
		
		if(m1.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m2.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m3.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m4.matches()) System.out.println("valid");
		else System.out.println("invalid");
		
	}

}
