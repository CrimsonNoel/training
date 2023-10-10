package ch04_control;

import java.util.Scanner;

/*
 * switch 구문 예제
 * 점수를 입력받아 A ~ F학점 출력하기
 *
 * switch(변수,수식){
 * 	 case 값1 : 문장1; break;
 *	 case 값2 : 문장2; break;
 *   ...
 *   default : 문장;
 *   }
 *   
 *   break; 문장 break가 속한 switch 구문, 반복문을 빠짐.
 */

public class Switch_Ex_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();         // 
		
		String grade;
		switch(score/10) {
		case 10:
		case 9:		grade = "A"; break;
		case 8:		grade = "B"; break;
		case 7:		grade = "C"; break;
		case 6:		grade = "D"; break;
			default:grade = "F"; break;
		}
		System.out.println(grade+" 학점");
	}

}
