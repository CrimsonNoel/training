package ch05_array;

import java.util.Arrays;

/*
 * 배열의 복사 Arrays 클래스 이용하기
 * int[] Arrays.copyOf(int[] original, int newlength)
 */
public class Array_Ex_11 {

	public static void main(String[] args) {

		int score[] = {90, 80, 70};
		
			int score2[] = Arrays.copyOf(score, 5);
  	   //  int[] Arrays.copyOf(기존배열명, 새배열의 길이) // 복사와 동시에 선언?		
			for(int s : score2) {
				System.out.println(s);
			}
			
			System.out.println(Arrays.toString(score2));
		
		
		
	}

}
