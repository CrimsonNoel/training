package ch04_control;
/*
 * 반복문을 이용하여 1부터 10까지의 합 구하기
 */



public class Loop_Ex_02 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		System.out.println("for 구문을 이용하기");
		
		for (i=0; i<=10 ;i++) {
			sum = sum +i;			
		}
		System.out.println("1~10 까지의 합: " + sum);
		
		i = 1; sum = 0; //변수 재선언 안해주면 이전 위의 값이 그대로 지속된다.
		System.out.println("while 구문을 이용하기");
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1~10 까지의 합: " + sum);
		
		i = 1; sum = 0;
		System.out.println("do while 구문을 이용하기");
		do {
			sum += i;
			i++;
		}
		while(i <= 10);
		System.out.println("1~10 까지의 합: " + sum);
	
		
	}

}
