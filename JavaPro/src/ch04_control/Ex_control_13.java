package ch04_control;

import java.util.Scanner;

/* 숫자 좌우 대칭인지 구하는건데, 입력받은 숫자를 뒤집어서 처음 숫자랑 같은지 확인한다. 같으면 좌우대칭 아니면 대칭이아니다를 출력
 * 숫자라고 계산하는게아니라, 대칭이라고 모양만 비교하는게아니라 순서를 뒤집어서 동일 숫자가 되는지 확인한다. 
 * 10을 몇번 나누고 10을 몇번 곱해서 각 자리수를 뒤집는 과정을 나타낸것
 * 
 * 입력받은 숫자가 좌우 대칭수인지 판단하기 
 * 숫자를 입력하세요
 * 121
 * 좌우 대칭수
 * 123
 * 좌우대칭수 아님
 *  
 */
public class Ex_control_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println(num);
		int temp = num;
		int result = 0;
		
		while(temp !=0) {
		result *=10;	
		System.out.println(result+" : "+temp/10+" : "+temp%10);
		result += temp%10;
		System.out.println(result);
		temp /=10;
		}
		
		if(num == result) {
			System.out.println("좌우대칭수 ");
		} else {
			System.out.println("좌우대칭수아님");
		}
		
			
				
	}

}
