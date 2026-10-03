package com.regex;

import java.util.regex.Matcher;

public class Remove_Extra_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Java     is    very     easy";
		
		String regex = text.replaceAll("(\\s+)", " ");
		
		System.out.println(regex);
	}

}
