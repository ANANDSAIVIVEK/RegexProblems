package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHashtags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I love #Java and #Programming. Learning #Regex2026";
		
		String regex = "#[\\w]+";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
