package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4_Address {

//	192.168.1.1    → Valid
//	127.0.0.1      → Valid
//	255.255.255.255 → Valid
//	256.1.1.1      → Invalid
//	192.168.1      → Invalid
	
//	250-255			-> 25[0-5]
//  200-249			-> 2[0-9]\d
//	100-199			-> 1\d\d
//  0-99				-> [1-9]?\d	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ipAddress1 = "192.168.1.1";
		String ipAddress2 = "127.0.0.1";
		String ipAddress3 = "255.255.255.255";
		String ipAddress4 = "256.1.1.1";
		String ipAddress5 = "192.168.1";
		
		String regex = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-9]\\d|1\\d\\d|[1-9]?\\d)){3}$";
		
Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(ipAddress1);
		Matcher m2 = p.matcher(ipAddress2);
		Matcher m3 = p.matcher(ipAddress3);
		Matcher m4 = p.matcher(ipAddress4);
		Matcher m5 = p.matcher(ipAddress5);
		
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
	}

}
