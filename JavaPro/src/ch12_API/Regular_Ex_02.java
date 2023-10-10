package ch12_API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Ex_02 {

	public static void main(String[] args) {
		String source  = "HP:011-1111-1111, HOME:02-999-9999 011-333-2345";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
				// \d -> (숫자가) {1,2}-> 한개~두개  -\d {3,4} 세개~네개
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		int i=0;
		while(m.find()) {
			System.out.println(++i + ": "+ m.group()+" -> "+ m.group(1)+", "+
						m.group(2)+", "+m.group(3 ));
		}
		
	}

}
