package ch05_array;

import java.util.Arrays;

/*
 * 1부터 9까지 숫자 중 중복되지 않는 3까지 숫자를 임의로 생성하는 프로그램 작성하기
 */
public class practice04 {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int arr[] = new int[10];
//		for (int i=0; i<10; i++) {
//			arr[i] = (int)(Math.random()*9);
//		}
//		for문으로 넣어볼려햇는데 0이나 10이들어가서 실패 뽑아쓰는게 편하다;
		
		
		
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random()*9);
			int t = (int)(Math.random()*9);
			int temp = arr[f];
			arr[f] = arr[t];
			arr[t] = temp;
		}
		
		for(int j=0; j<3; j++) {
			System.out.print(arr[j]);
		}
		
		
	}

}
