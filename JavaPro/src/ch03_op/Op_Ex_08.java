package ch03_op;

public class Op_Ex_08 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10; // num = num + 10;
		System.out.println(num);
		num /= 10; // num = num / 10;
		System.out.println(num);
		num *= 2+3; //num = num * (2+3); // 더하기가 연산자 순위가 높다.
		System.out.println(num);
		
		byte b = 1;
		b *= 2; // b = b*2
		b = (byte)(b*2);
		System.out.println(b); // 4
		b *= 2;
		System.out.println(b); // 8
		b *= 2;
		System.out.println(b); // 16
	
	}

}
