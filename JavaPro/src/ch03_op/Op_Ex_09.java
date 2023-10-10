package ch03_op;

import java.util.Scanner;

/*
 * 	조건연산자(삼항 연산자)
 * 		(조건식)?참 : 거짓
 * 
 * 	조건연산자는 조건문으로 변경이 가능함
 */
public class Op_Ex_09 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score);
								   // String이 잡힌 이유는 출력물(참,거짓)형태에 따라 다르다
 		String result = (score >= 60)? "합격" : "불합격"; // result는 조건문 이름 상관x
		System.out.println(result);
		
		System.out.println(score+ "점은" +result+"입니다.");
		System.out.println(score+ "점은" +((score % 2 ==0)? "짝수" : "홀수") + "입니다");
		
		// 짝수, 홀수, 0인지 출력하기 -11%2 -> -1 -홀수는 0
		result = (score % 2 == 1 ) ? "홀수" : (score > 0) ? "짝수" : "0";
		System.out.println(score + "점은"+result+"입니다");
	 }

}
