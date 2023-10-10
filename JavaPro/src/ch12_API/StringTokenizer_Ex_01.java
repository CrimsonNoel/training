package ch12_API;

import java.util.StringTokenizer;

public class StringTokenizer_Ex_01 {
	public static void main(String[] args) {
			String source = "100,200,300,400";
			StringTokenizer st = new StringTokenizer(source,",");
									// 내가 지정한 문자 "," 로 쪼개기
									// 쪼갠 내용물을 Token이라 한다.
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());			}
			
			System.out.println("==============================");
			
			String expression = "x=100*(200+300)/2";
			StringTokenizer st1 =
						new StringTokenizer(expression,"+-*/=()",false);
															// true 하면 기호까지 다나옴.
			while(st1.hasMoreTokens()) {
				System.out.println(st1.nextToken());
			}
		
	}}
