package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "00110";      //→ Valid
		String text2 = "11001";        //→ Valid
		String text3 = "11111";    //→ Valid
		String text4 = "02130";      //→ Invalid
		String text5 = "12345";      //→ Invalid
		
		String regex = "^([01])+$";
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
