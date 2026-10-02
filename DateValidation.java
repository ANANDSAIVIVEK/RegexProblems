package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d1 = "02-09-2026";  // r1 = Valid: Standard DD-MM-YYYY format with leading zeros
		String d2 = "31-12-2025";  // r2 = Valid: Standard DD-MM-YYYY format for end of year
		String d3 = "2-9-2026";    // r3 = Invalid: Single-digit day and month are not allowed
		String d4 = "02/09/2026";  // r4 = Invalid: Forward slashes are used instead of dashes
		String d5 = "02-9-2026";   // r5 = Invalid: Single-digit month is not allowed

		String regex = "^(0[1-9]|12[0-9]|3[01])-(0[1-9]|1[0-2])-[\\d]{4}$";

		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(d1);
		Matcher m2 = p.matcher(d2);
		Matcher m3 = p.matcher(d3);
		Matcher m4 = p.matcher(d4);
		Matcher m5 = p.matcher(d5);
		
		if(m1.matches()) System.out.println(d1+" valid");
		else System.out.println(d1+" In valid");
		if(m2.matches()) System.out.println(d2+" valid");
		else System.out.println(d2+" Invalid");
		if(m3.matches()) System.out.println(d3+" valid");
		else System.out.println(d3+" Invalid");
		if(m4.matches()) System.out.println(d4+" valid");
		else System.out.println(d4+" Invalid");
		if(m5.matches()) System.out.println(d5+" valid");
		else System.out.println(d5+" Invalid");
		
	}

}
