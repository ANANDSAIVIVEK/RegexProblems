package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1 = "10";		//valid
		String n2 = "10.5";		//valid
		String n3 = "100.25";	//valid
		String n4 = "0.5";		//valid
		String n5 = "10.";		//invalid
		String n6 = ".5";		//invalid
		String n7 = "10.25.5";	//invalid
		
		String regex = "^\\d+\\.?\\d+$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(n1);
		Matcher m2 = p.matcher(n2);
		Matcher m3 = p.matcher(n3);
		Matcher m4 = p.matcher(n4);
		Matcher m5 = p.matcher(n5);
		Matcher m6 = p.matcher(n6);
		Matcher m7 = p.matcher(n7);
		
		if(m1.matches()) System.out.println(n1+" valid");
		else System.out.println(n1+" In valid");
		if(m2.matches()) System.out.println(n2+" valid");
		else System.out.println(n2+" In valid");
		if(m3.matches()) System.out.println(n3+" valid");
		else System.out.println(n3+" In valid");
		if(m4.matches()) System.out.println(n4+" valid");
		else System.out.println(n4+" In valid");
		if(m5.matches()) System.out.println(n5+" valid");
		else System.out.println(n5+" Invalid");
		if(m6.matches()) System.out.println(n6+" valid");
		else System.out.println(n6+" Invalid");
		if(m7.matches()) System.out.println(n7+" valid");
		else System.out.println(n7+" Invalid");
		
		
	}

}
