package ch04_control;
/*1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
피보나치 수열에서 값이 1000 이전의 수까지 프린트 하세요
1 
*/

public class Ex_control_16 {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int result = 1;
		System.out.print(first);
		for(int i =1; i<=1000; i++) {
			System.out.print(" "+result);
			result = first + second;
			first = second;
			second = result;
			if(result >1000)
			    break;{}
		}
		
	}

}
