package ch03_op;
/*
 * 사과를 사과 상자에 담기로 한다. 1개의 상자에 10개의 사과를 담을 수 있다.
 * 필요한 사과 상자의 갯수를 출력하기
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3
 *
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3
 */

import java.util.Scanner;

public class Ex_Op_06 {

	public static void main(String[] args) {
		
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num%10==0)?"필요한 상자의 갯수 :"+(num/10):"필요한 상자의 갯수 :"+(num/10+1));
																// 괄호풀면 앞의 String 때문에 문자열 덧셈이 되버린다.
		
		if(num%10==0) {
			System.out.println("필요한 상자의 갯수 :"+ num/10);
		}else {
			System.out.println("필요한 상자의 갯수 :"+ ((num/10)+1));
		}
	}

}
