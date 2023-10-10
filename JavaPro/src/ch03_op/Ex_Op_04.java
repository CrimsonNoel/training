package ch03_op;
/*
 * 숫자를 입력받아서 양수인 경우는 양수로, 음수는 음수로, 0인 경우는 0출력하기
 */

import java.util.Scanner;

public class Ex_Op_04 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println((num>0)? "양수":((num<0)?"음수":"0입니다"));
		
	}

}
