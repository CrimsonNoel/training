package ch12_API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern과 Matcher가 속한 패키지
/*
 * 정규표현식
 */
public class Regular_Ex_01 {

	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","c9",
							"car","combet","count","date","disc"		};
		
		Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어 찾기,정규표현식
												// 정규표현식 찾으면 종류 많다.
		for(int i=0; i<data.length;i++) {
			Matcher m = p.matcher(data[i]); // data array에 p 패턴에 맞는게 있는지 매치해봐라
			if(m.matches())					// 맞으면 
				System.out.println(data[i]+",");// 출력
		}
		
	}

}
