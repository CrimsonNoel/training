package ch05_array;
/*
 * Ex_Array_01 해답
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array_01_ {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int[] score = new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		  
		
		for(int i=0; i<score.length; i++){
			score[i] = scan.nextInt();
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		} 
		
		
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
	}
}