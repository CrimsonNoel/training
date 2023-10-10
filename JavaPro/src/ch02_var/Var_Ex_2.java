package ch02_var;

public class Var_Ex_2 {

	public static void main(String[] args) {
		/*
		 * 형변환 예제
		 * 	큰 자료형 <= 작은 자료형 : 자동형변환
		 *  작은 자료형 <= 큰 자료형 : 명시적 형변환
		 *  byte(1) < short(2) < int(4) < long(8) < float < double
		 *  A = B 같다는 의미가 아니라 대입연산자이다
		 */
		
		byte b1 = (byte) 255;
		int i1 = b1;
		System.out.println("b1 = " + b1);
		System.out.println("i1 = " + i1);
		byte b2 = (byte) i1;
		
		byte b3 = 100;
		System.out.println("b3 = " + b3);
		long l1 = 10;
		
		float f1 = l1;
		long l2 = (long)f1;
		char c1 = 'A';
		short s1 = (short) c1;
		char c2 = (char)b1;
		System.out.println("c2 = "+c2);
		System.out.println("s1 = "+s1);
		int charint = c2;
		System.out.println(c1);
		System.out.println("charint = " + charint);
		
	}

}
