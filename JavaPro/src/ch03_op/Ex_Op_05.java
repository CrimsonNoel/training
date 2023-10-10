package ch03_op;
/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기
 * 소문자가 아닌 경우는 "소문자 아님" 출력하기
 */

import java.util.Scanner;

public class Ex_Op_05 {

	public static void main(String[] args) {
		
//		System.out.println("A"+":"+(int)'A');
//		System.out.println("a"+":"+(int)'a');
//		System.out.println((int)'a'-(int)'A');
		
		
		System.out.println("소문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); // 문자열로 입력받기. "A"
		char alpha = str.charAt(0); // 문자열 중 첫번쨰 문자 'A' abc를 입력해도 a만받는다
		System.out.println(alpha+":"+(int)alpha);  //a:97,z:122
		System.out.println((alpha>=97 && alpha<=122)?(char)(alpha-32):"소문자아님");
		// char 를 int 로 (int)'char'
		// int  를 char로 (char)int값
		
		System.out.println((alpha>='a' && alpha<='z')?(char)(alpha-32):"소문자아님");
		// 굳이 숫자로 치환 안하고 문자열로 범위 지정 가능하다.

	}

}
