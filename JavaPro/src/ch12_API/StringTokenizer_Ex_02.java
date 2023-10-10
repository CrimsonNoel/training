package ch12_API;

import java.util.StringTokenizer;

public class StringTokenizer_Ex_02 {
	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source,"|"); 
						// 두번쪼개기 "|" 한번 쪼개서
		while(st.hasMoreTokens()) {
			String token = st.nextToken();  // 쪼갠걸 저장.
			
			StringTokenizer st2 = new StringTokenizer(token,","); // "," 한번더 쪼개서
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken()); // 출력
			}
			System.out.println("--------------------");
		}
		
		
	}}
