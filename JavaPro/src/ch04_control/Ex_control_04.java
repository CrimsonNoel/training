package ch04_control;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하기,
 *  [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * 자연수를 입력하세요
 * 1346
 * 자리수 합 : 16
 */
public class Ex_control_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		int num = scan.nextInt();
		int sum = 0;
		int value = num;
			
				
		for(value=num; value !=0; value/=10) {    // ;> num값 초기화 num이 0이 아닐떄 10으로 나누는걸 반복한다.
			System.out.println(value+" : "+value%10); // 10으로 나눈값을 10으로나눈 나머지를 구한다.
			sum += value%10;					      // 그값을 전부 더함
		}
		System.out.println("자리수 합 : " + sum);
		
		System.out.println("while문");
		while(value !=0) {
			
			sum+=value%10;
			value/=10;
		}
		System.out.println("자리수 합 : "+sum);
		
		
	}	

}
