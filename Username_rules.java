package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username_rules {
	
//	Username Rules
//
//	Username must:
//
//	Start with a letter
//	Can contain letters, digits, _
//	Length 6–15
//	Cannot end with _

//	anand_123    → Valid
//	java2026     → Valid
//	_anand123    → Invalid
//	anand_       → Invalid
//	an@nd123     → Invalid
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String u1 = "anand_123"; 
		String u2 = "almnn30ch30o";
		String u3 = "_anand123";
		String u4 = "anand_";
		String u5 = "an@nd123";
		
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}[0-9a-zA-Z]$";// 
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(u1);
		Matcher m2 = p.matcher(u2);
		Matcher m3 = p.matcher(u3);
		Matcher m4 = p.matcher(u4);
		Matcher m5 = p.matcher(u5);
		
		if(m1.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m2.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m3.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m4.matches()) System.out.println("valid");
		else System.out.println("invalid");
		if(m5.matches()) System.out.println("valid");
		else System.out.println("invalid");
		
	}

}
