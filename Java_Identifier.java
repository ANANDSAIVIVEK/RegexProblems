package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Identifier {

//	student       → Valid
//	student123    → Valid
//	_student      → Valid
//	$amount       → Valid
//	123student    → Invalid
//	student-name  → Invalid
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String i1 = "student";
		String i2 = "student123";
		String i3 = "_student";
		String i4 = "$amount";
		String i5 = "123student";
		String i6 = "student-name";
		
		String regex = "(^(?!(class|public|static|int|float|double|char|boolean|if|else|for|while|return)$)"
				+ "[a-z_$A-Z][a-zA-Z0-9_$]*$)";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(i1);
		Matcher m2 = p.matcher(i2);
		Matcher m3 = p.matcher(i3);
		Matcher m4 = p.matcher(i4);
		Matcher m5 = p.matcher(i5);
		Matcher m6 = p.matcher(i6);
		
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
		if(m6.matches()) System.out.println("valid");
		else System.out.println("invalid");

	}

}
