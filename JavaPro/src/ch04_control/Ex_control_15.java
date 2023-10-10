package ch04_control;

import java.util.Scanner;

/*입력된 포인트에 가능한 모든 상품을 프린트 하세요
 * 0 ~ 199 : 상품이 없습니다
 * 200 ~ 399 : 새우깡
 * 400 ~ 599 : 핸드폰
 * 600 ~ 799 : 자동차
 * 800 ~ 999 : 아파트
 * 
*   850 :  아파트, 자동자,핸드폰,새우깡
 *  730 :  자동자,핸드폰,새우깡
 *  160 :  상품이 없습니다
 * */

public class Ex_control_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트를 입력하세요(1 ~ 1000) exit(9999)");
		int point = 0;
		int sum=0,cnt=0;
		
		while(true) {
			point = scan.nextInt(); 
			if(point==9999) break;{System.out.println("exit");}
			switch(point/200) {
			case 0 : System.out.println("상품이 없습니다.");
			break;
			case 4 : System.out.println("아파트");
			case 3 : System.out.println("자동차");
			case 2 : System.out.println("핸드폰");
			case 1 : System.out.println("새우깡");
			}
		}
			
//		if(point >799) {
//			System.out.println("아파트, 자동자,핸드폰,새우깡");
//		}else if(sum <800 && sum >599) {
//			System.out.println("자동자,핸드폰,새우깡");
//		}else if(sum <600 && sum >399) {
//			System.out.println("핸드폰,새우깡");
//		}else if(sum <400 && sum >199) {
//			System.out.println("새우깡");
//		}else  {
//			System.out.println("경품이 없습니다");
//		}
//		
//		System.out.println("총합 : " +sum);
		
		
		
	
}}
