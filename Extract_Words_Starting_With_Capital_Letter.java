package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_Words_Starting_With_Capital_Letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java is developed by James Gosling in Sun Microsystems";
		
		String regex = "\\b[A-Z][A-Za-z]*";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
