package ch05_array;


import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array_01 {
	/*
	 * 화면에서 5개의 점수를 입력받아서 점수의 합계, 평균, 최대점수, 최소점수 출력하기
	 * 입력받는 점수는 score 배열에 저장하기.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int[] score = new int[5];
		int[] scorei = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			score[i] = scan.nextInt();
		}
		scorei = score;
		
//해 
//  for(int i=0; i<score.length; i++){
//		score[i++] = scan.nextInt()
//		sum += score[i];
//		}  
//    내가한건 풀어헤친걸 for문으로 정리한거고 해답은 선언값까지 전부 넣었다.			
		
		
		
		
//		score[0] = scan.nextInt();
//		score[1] = scan.nextInt();
//		score[2] = scan.nextInt();
//		score[3] = scan.nextInt();
//		score[4] = scan.nextInt();
		
		for(int i=0; i<scorei.length; i++) {
			System.out.print(scorei[i]+",");
		}
		//배열의 합
		System.out.println();
		System.out.print("배열의 합 : ");
		for(int i=0; i<scorei.length; i++) {
			 sum += scorei[i];
			}
		System.out.print(sum);
		//배열의 평균
		sum = 0;
		System.out.println();
		System.out.print("배열의 평균 : ");
		for(int i=0; i<scorei.length; i++) {
			 sum += scorei[i];
			}
		System.out.print(sum/scorei.length);
		System.out.println("\n");
		//배열 중 최고점수
		Arrays.sort(scorei);
		for(int i:scorei) {
			System.out.print(i+",");
			}  // 스왑 알고리즘 사용해봣는데 실패 ㅜ 자꾸 배열에 같은숫자가 중첩된다
		System.out.println();
		System.out.print("배열중 최고점수는 : ");
		System.out.print(scorei[4]);
		System.out.println();
		System.out.print("배열중 최저점수는 : ");
		System.out.print(scorei[0]);
	}

}
