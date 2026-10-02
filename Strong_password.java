package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strong_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p1 = "Anand@123";		//valid
		String p2 = "Hello#2026";		//valid
		String p3 = "anand@123";	//invalid
		String p4 = "ANAND@123";		//invalid
		String p5 = "Anand1234";		//invalid
		
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#$%]).{8,16}$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(p1);
		Matcher m2 = p.matcher(p2);
		Matcher m3 = p.matcher(p3);
		Matcher m4 = p.matcher(p4);
		Matcher m5 = p.matcher(p5);
		
		if(m1.matches()) System.out.println(p1+" valid");
		else System.out.println(p1+" In valid");
		if(m2.matches()) System.out.println(p2+" valid");
		else System.out.println(p2+" Invalid");
		if(m3.matches()) System.out.println(p3+" valid");
		else System.out.println(p3+" Invalid");
		if(m4.matches()) System.out.println(p4+" valid");
		else System.out.println(p4+" Invalid");
		if(m5.matches()) System.out.println(p5+" valid");
		else System.out.println(p5+" Invalid");
		

	}

}
