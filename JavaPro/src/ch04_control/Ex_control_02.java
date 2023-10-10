package ch04_control;

import java.util.Scanner;

public class Ex_control_02 {
/*
 * 키보드에서 한개의 문자를 입력받아서 대문자, 소문자, 숫자, 기타문자 구분해서 출력하기
 */
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
	// char = '문자' 문자열x
		
		if((int)ch<'a' && (int)ch>='A') {
			System.out.println("대문자입니다.");
		}else if('a'<=(int)ch && (int)ch<='z') {
			System.out.println("소문자 입니다.");
		}else if(ch <= '9' && '0' <= ch  ) {         // 변수값을 char로 입력했기떄문에 따옴표 씌어줘야함
			System.out.println("숫자입니다.");
		}else{
			System.out.println("기타문자입니다.");
		};
		
		
	}

}
