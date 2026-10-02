package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String args[]) {

		String e1 = "anand@gmail.com";        // r1 = Valid: Standard format with username, domain, and TLD
		String e2 = "user123@yahoo.com";      // r2 = Valid: Includes numbers in username
		String e3 = "hello.world@gmail.com";  // r3 = Valid: Includes a period in username
		String e4 = "anand@gmail";            // r4 = Invalid: Missing the Top-Level Domain (e.g., .com)
		String e5 = "@gmail.com";             // r5 = Invalid: Missing the username before the @ symbol
		String e6 = "anand@.com";             // r6 = Invalid: Missing the domain label between @ and .com

		String regex = "^[a-z0-9.]+@(gmail|yahoo)\\.com$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(e1);
		Matcher m2 = p.matcher(e2);
		Matcher m3 = p.matcher(e3);
		Matcher m4 = p.matcher(e4);
		Matcher m5 = p.matcher(e5);
		Matcher m6 = p.matcher(e6);
		
		if(m1.matches()) System.out.println(e1+" valid");
		else System.out.println(e1+" In valid");
		if(m2.matches()) System.out.println(e2+" valid");
		else System.out.println(e2+" Invalid");
		if(m3.matches()) System.out.println(e3+" valid");
		else System.out.println(e3+" Invalid");
		if(m4.matches()) System.out.println(e4+" valid");
		else System.out.println(e4+" Invalid");
		if(m5.matches()) System.out.println(e5+" valid");
		else System.out.println(e5+" Invalid");
		if(m6.matches()) System.out.println(e6+" valid");
		else System.out.println(e6+" Invalid");
	}

}
