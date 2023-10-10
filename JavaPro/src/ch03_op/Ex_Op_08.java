package ch03_op;
/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장 작은 10의 배수를 구해
 * 10의 배수에 입력수를 뺀 값을 출력하기 : 
 * [결과]
 * 10부터 99까지의 수를 입력하세요
 * 24
 * 30 - 24 = 6
 * 
 * 10부터 99까지의 수를 입력하세요
 * 20
 * 20 - 20 = 0
 * 
 * 10부터 99까지의 수를 입력하세요
 * 77
 * 80 - 77 = 3
 */

import java.util.Scanner;

public class Ex_Op_08 {

	public static void main(String[] args) {
				
		System.out.println("10부터 99까지의 두자리수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// 문제의도 입력한 두자리수 '올림한 10의 배수' + "-" + '입력한 수' + "=" + '결과값'이 수식으로 보여야했음. 
		// ex) int result = 함수
		// 	   System.out.println(resule+"-"+num+"="(result-num));
		
		System.out.println((num%10==0 && num<=99 && num>=10)?num-num:
							(num<=99 && num>=10)?((num/10)+1)*10-num:"다시 입력하세요");
		
		
		if(num%10==0 && num<=99 && num>=10) {
			System.out.println(num-num);
		}else if(num<=99 && num>=10){
			System.out.println((((num/10)+1)*10)-num);
		}else {
			System.out.println("다시 입력하세요");
		}
		
	}

}
