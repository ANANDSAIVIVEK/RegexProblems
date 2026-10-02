package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ends_with_ing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i1 = "doing";
		String i2 = "gooning";
		String i3 = "code";

		String regex = "ing$";

		Pattern p = Pattern.compile(regex);

		Matcher m1 = p.matcher(i1);
		Matcher m2 = p.matcher(i2);
		Matcher m3 = p.matcher(i3);

		if(m1.find()) {
			System.out.println(i1+"-valid");
		}
		if(m2.find()) {
			System.out.println(i2+"-valid");
		}
		if(m3.find()) {
			System.out.println(i3+"-valid");
		}



	}

}
