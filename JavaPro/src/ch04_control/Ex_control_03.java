package ch04_control;
/*
 * 중첩 반복문 :  반복문 내부에서 반복문이 존재.
 * 			  구구단 가로 출력하기
 * 
 * 
 */

public class Ex_control_03 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		for(i=1; i<10; i++) {
			for(j=2; j<10; j++) {
			System.out.print(j+" x "+i+" = "+(i*j)+"\t");			
			}
			System.out.println();
		}
		
	}

}
