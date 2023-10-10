package ch04_control;
/*
 * 그 외 제어문
 * 	break   : 반복문이나 swich 구문을 빠짐
 *  continue: 반복문의 처음으로 제어를 이동
 * 
 */
public class Loop_Ex_04 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		
		for(i=2; i<10; i++) {
			System.out.println(i+" 단");
			
			for(j=2; j<10; j++) {
//				if(j==5) break;
				if(j==5) continue; // j 가 5인 값만 빠진다?
								   // j 가 5인경우 continue가 실행되어 조건식으로 돌아간다.
				System.out.println(i + " X " + j + " = " + (i*j)); 

				
			}													  
			
			System.out.print("\n");
		};
		
		
		
	}

}
