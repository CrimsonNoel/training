package ch03_op;

import java.util.Scanner;

/*
 * 화면에서 금액을 입력받아 500,100,50,10,1원 동전으로 바꾸기
 * 필요한 동전의 갯수를 출력하기
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 11개
 * 50원 0개
 * 10원 4개
 * 1원 1개
 */
public class Ex_Op_03 {

	public static void main(String[] args) {

		int coin;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();  //5641
		int w500 = coin/500;
		int w100 = coin%500/100;
		int w50  = coin%500%100/50;
		int w10  = coin%500%100%50/10;
		int w1   = coin%500%100%50%10/1;
		System.out.println("500원 :"+ w500+"개\n"+"100원 :"+ w100+"개\n"+"50원 :" +w50+"개\n"+"10원 :"+ w10+"개\n"+"1원 :"+ w1+"개");
		
	}

}
