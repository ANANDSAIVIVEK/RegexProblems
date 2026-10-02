package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r1 = "aaaaa";
		String r2 ="11111";
		String r3 = "xxxxx";
		String r4 = "aaaab"; 
		String r5 = "abcde"; 
		
		String regex = "^(.)\\1{4}$";
		Pattern p =  Pattern.compile(regex);
		
		Matcher m1 = p.matcher(r1);
		Matcher m2 = p.matcher(r2);
		Matcher m3 = p.matcher(r3);
		Matcher m4 = p.matcher(r4);
		Matcher m5 = p.matcher(r5);
		
		if(m1.matches()) System.out.println(r1+" valid");
		if(m2.matches()) System.out.println(r2+" valid");
		if(m3.matches()) System.out.println(r3+" valid");
		if(m4.matches()) System.out.println(r4+" valid");
		if(m5.matches()) System.out.println(r5+" valid");
		
	}

}
