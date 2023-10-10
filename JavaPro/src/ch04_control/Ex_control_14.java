package ch04_control;
/*
 * 입력받은 숫자가 좌우대칭수인지 판단하기
 * 숫자를 입력하세요
 * 121 
 * 좌우대칭수
 * 123
 * 좌우대칭수아님

String  num = scan.next(); 이용하세요

 */

import java.util.Scanner;

public class Ex_control_14 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			String  num = scan.next();
			int a =0;
			int b =0;
			
			
			for(int i=0; i<num.length();i++) {
				a=num.charAt(i);
			}
			System.out.println(a);
			for(int j=(num.length()-1); j>=0; j--) {
				b=num.charAt(j);
			}
			System.out.println(b);
			
			if(a==b) {
				System.out.println("대칭이다");
			}else{
				System.out.println("대칭이아니다                                                                              ");
			}
		
	// ? 내가 원하던건 아닌데 문자열=> 숫자로 환원해서 뒤집엇을때 나온 숫자가 
	// 서로 같다. 뒤집어서 같은수는 환원한 수도 같으니까. 대칭여부는 알수있다.
			
			}

}
