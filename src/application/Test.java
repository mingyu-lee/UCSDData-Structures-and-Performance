package application;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		String text = new String("one (1), two (2), three (3)");
		
		List<String> newText = t.getTokens(text,"[a-z]+|[()0-9]+");
		
		for(String str : newText) {
			System.out.println(str);
		}
		
	}
	
	public List<String> getTokens(String text, String pattern)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	
}


