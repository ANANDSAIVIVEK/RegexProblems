package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_URLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Visit https://google.com and https://github.com for more information.";
		
		String regex = "https://[\\w]+\\.com";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
