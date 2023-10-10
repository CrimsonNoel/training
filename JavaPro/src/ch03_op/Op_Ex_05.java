package ch03_op;
/*
 * 산술 연산
 *  / : 나누기 연산자
 *  	int = int이하/int이하
 *  	인트이하가 연산자를 만나면 인트가된다
 *  % : 나머지 연산자
 *  	나머지 연산의 결과값은 부호는 피젯수(나누어 지는수) 의 부호와 같다.
 */
public class Op_Ex_05 {

	public static void main(String[] args) {
		System.out.println(10/8);   // 1
		System.out.println(10/-8);  // -1
		
		System.out.println(-10/8);  // -1
		System.out.println(-10/-8); // 1
		
		System.out.println(10%8);   // 2
		System.out.println(10%-8);  // 2
		
		System.out.println(-10%8);  // -2
		System.out.println(-10%-8); // -2
	
	}

}
