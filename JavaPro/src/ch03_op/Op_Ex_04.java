package ch03_op;
/*
 * 부호 연산자: +,-
 * 		+: 현재의 부호를 유지.
 * 		-: 현재의 부호를 변경.
 */
public class Op_Ex_04 {

	public static void main(String[] args) {
		int x = -10;
		System.out.println("+x = "+ +x); // -10
		System.out.println("-x = "+ -x); // 10
		x = 10;
		System.out.println("+x = "+ +x); // 10
		System.out.println("-x = "+ -x); // -10
				
		
	}

}
