package ch04_control;
/*
 * 1. 1부터 100까지 수중에 2의 배수이거나 3의 배수의 합구하기
 *		2 4 6 8 9 10 12 13 15
 * 2. 1부터 100까지 수중에 2의배수고 아니고 3의 배수고 아닌 수의 합 구하기.
 * 
 */
public class Ex_control_06 {

	public static void main(String[] args) {

		String str1 = "";
		String str2 = "";
		int sum1 = 0, sum2 = 0;
		for(int i =1; i<=100; i++) {
			if(i%2==0 || i%3==0) {
				str1 += i +" ";
				sum1+=i;
			}else {
				str2 += i +" ";
				sum2+=i;
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("2의 배수,3의 배수의 합 : "+ sum1);
		System.out.println("2의 배수와 3의배수가 아닌 수의 합 : "+ sum2);
		
			
		
		
		
		
		
		
		
	}

}
