package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Hexadecimal_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "1A3F";      //→ Valid
		String text2 = "FF";        //→ Valid
		String text3 = "123ABC";    //→ Valid
		String text4 = "G123";      //→ Invalid
		String text5 = "12XZ";      //→ Invalid
		
		String regex = "^([0-9a-fA-F])+$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(text1);
		Matcher m2 = p.matcher(text2);
		Matcher m3 = p.matcher(text3);
		Matcher m4 = p.matcher(text4);
		Matcher m5 = p.matcher(text5);
		
		if(m1.find()) System.out.println("valid");
		else System.out.println("in valid");
		if(m2.find()) System.out.println("valid");
		else System.out.println("in valid");
		if(m3.find()) System.out.println("valid");
		else System.out.println("in valid");
		if(m4.find()) System.out.println("valid");
		else System.out.println("in valid");
		if(m5.find()) System.out.println("valid");
		else System.out.println("in valid");
		

	}

}
