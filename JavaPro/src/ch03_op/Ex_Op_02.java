package ch03_op;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 * 
 * 세자리 정수를 입력하세요
 * 199
 * 100
 */
public class Ex_Op_02 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("세자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
//		System.out.println(num/100*100);
		
		System.out.println((num<1000 && num>99)?(num/100*100):"다시 입력 하세요"); 	
		
	
	}

}
