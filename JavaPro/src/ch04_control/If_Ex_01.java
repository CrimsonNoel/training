package ch04_control;

import java.util.Scanner;

/*
 * if-else if-else Js랑 기본 방식은 같다.
 * ***조건식이 true일 경우 다음 함수 실행;
 */
public class If_Ex_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt(); //80
		if(score >= 60)System.out.println("합격을 축하합니다.");
		else System.out.println("다음에 오세요");
		//90이상이면"A학점" 80이상이면 "B학점" 70이상이면 "C학점"
		//				60이상이면 "D학점" 그외는 "F학점" 출력하기
		if(score >=90) {System.out.println("A학점 입니다.");
		} else if(score >=80) {System.out.println("B학점 입니다");
		} else if(score >=70) {System.out.println("C학점 입니다");
		} else if(score >=60) {System.out.println("D학점 입니다");
		} else {System.out.println("F학점 입니다");	}
		
	} //main 종료, 프로그램 종료

}
