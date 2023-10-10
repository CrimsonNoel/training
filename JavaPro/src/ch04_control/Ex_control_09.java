package ch04_control;
/*
 * 화면에 삼각형 높이를 입ㄹ겨받고, 높이에 맞는 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 3
 * ***
 * **
 * *
 */
import java.util.Scanner;

public class Ex_control_09 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		for(int i = len; i>=0; i--) {    // 출발점이 0이아니라 입력값으로해서 종료식까지 가면된다
			for(int j=0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
