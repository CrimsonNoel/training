package ch04_control;
/*
 * 중첩 반복문 : 반복문 내부에 반복문이 구현됨. 
 * 구구단 출력하기
 */
public class Loop_Ex_03 {

	public static void main(String[] args) {
	
		
		int i = 0;
		int j = 0;
		
		for(i=2; i<10; i++) {
			System.out.println(i+" 단");
			
			for(j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j)); // 스트링이랑 복합적으로 있어서(i*j) 괄호는 이해
			}													   // 근데 왜 괄호없어도 정상작동??
			
			System.out.println("\n");
		};
		
		
		
		
	}

}
