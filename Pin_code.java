package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pin_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1 = "534001";
		String p2 = "500001";
		String p3 = "12345";
		String p4 = "53400A";
		
		String regex = "^[1-9]\\d{5}$";
		
Pattern p =  Pattern.compile(regex);
		
		Matcher m1 = p.matcher(p1);
		Matcher m2 = p.matcher(p2);
		Matcher m3 = p.matcher(p3);
		Matcher m4 = p.matcher(p4);
		//Matcher m5 = p.matcher(r5);
		
		if(m1.find()) System.out.println(p1+" valid");
		if(m2.find()) System.out.println(p2+" valid");
		if(m3.find()) System.out.println(p3+" valid");
		if(m4.find()) System.out.println(p4+" valid");
		//if(m5.matches()) System.out.println(r5+" valid");
		

	}

}
