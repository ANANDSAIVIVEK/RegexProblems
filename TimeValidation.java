package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t1 = "10:30";  // r1 = Valid: Standard morning time
		String t2 = "23:59";  // r2 = Valid: One minute before midnight
		String t3 = "00:00";  // r3 = Valid: Midnight start
		String t4 = "25:30";  // r4 = Invalid: Hour cannot be greater than 23
		String t5 = "12:70";  // r5 = Invalid: Minutes cannot be greater than 59

		String regex = "^(0[0-9]|1[0-9]|2[0-4]):([0-5][0-9])$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(t1);
		Matcher m2 = p.matcher(t2);
		Matcher m3 = p.matcher(t3);
		Matcher m4 = p.matcher(t4);
		Matcher m5 = p.matcher(t5);
		
		if(m1.matches()) System.out.println(t1+" valid");
		else System.out.println(t1+" In valid");
		if(m2.matches()) System.out.println(t2+" valid");
		else System.out.println(t2+" Invalid");
		if(m3.matches()) System.out.println(t3+" valid");
		else System.out.println(t3+" Invalid");
		if(m4.matches()) System.out.println(t4+" valid");
		else System.out.println(t4+" Invalid");
		if(m5.matches()) System.out.println(t5+" valid");
		else System.out.println(t5+" Invalid");
	
	}
	

}
