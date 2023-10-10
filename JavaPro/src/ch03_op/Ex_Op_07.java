package ch03_op;
/*
 * 조건 연산자를 이용하기
 * 점수를 입력받아서 90이상이면 "A학점" 80이상이면 "B학점" 70이상이면 "C학점"
 *              60이상이면 "D학점" 그외는 "F학점" 출력하기
 */

import java.util.Scanner;

public class Ex_Op_07 {

	public static void main(String[] args) {
	
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		System.out.println((score>=90)?"A학점 입니다":
							 (score>=80)?"B학점 입니다":
								(score>=70)?"C학점 입니다":
									(score>=60)?"D학점 입니다":"F학점 입니다"); //괄호 3개 빼서 수정함.
		
		if(score>=90) {
			System.out.println("A학점 입니다");
		}else if(score>=80) {
			System.out.println("B학점 입니다");
		}else if(score>=70) {
			System.out.println("C학점 입니다");
		}else if(score>=60) {
			System.out.println("D학점 입니다");
		}else {
			System.out.println("F학점 입니다");
		}
	}

}
