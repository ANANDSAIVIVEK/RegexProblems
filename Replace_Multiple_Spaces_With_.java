package com.regex;

public class Replace_Multiple_Spaces_With_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java Identifier";
		
		String regex = text.replaceAll("(\\s+)", "_");
		
		System.out.println(regex);
	}

}
