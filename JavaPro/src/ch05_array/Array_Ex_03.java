package ch05_array;

import java.util.Arrays;

public class Array_Ex_03 {
/*
 * 로또 번호 추첨기
 */
	public static void main(String[] args) {

		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0; i<balls.length; i++) {
			balls[i] = i + 1; // 1 - 45
		}
		// ball 섞기
		for(int i=0; i<1000; i++) {
			int f = (int) (Math.random() *45);
			int t = (int) (Math.random() *45);
			
		int temp = balls[f];
		balls[f] = balls[t];
		balls[t] = temp;
		}
		
		// 6개의 번호 선택
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		// 선택 번호 출력
		for(int b : lotto) {
			System.out.print(b+",");
		}
		System.out.println();

		Arrays.sort(lotto);   // Arrays.sort(배열); + for문 // 편한 method 
		for(int b : lotto) {
			System.out.print(b+",");
		}
		System.out.println();
		
		
		System.out.println();
		for(int i=0; i<lotto.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto.length-1-i; j++) { //i랑 length가 같으면 에레가 뜸..왜? 
				if(lotto[j]>lotto[j+1]) {    // lotto[j]가 lotte[j+1] 보다 클경우 
					int temp = lotto[j];     // 자리를 바꾼다(비교해서 큰수를 계속 뒤로 보낸다)
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
					change=true;
				}
//				System.out.println(lotto[j]+","+lotto[j+1]);
			}
			System.out.println(i+"===========================");
			if(!change) break; // change가 true면 for가 계속돌고 false면 함수가 종료된다.
			
			
			for(int b : lotto) {
				System.out.print(b+",");
			}
			System.out.println();
		
		
		}
		
	  
	}

}
