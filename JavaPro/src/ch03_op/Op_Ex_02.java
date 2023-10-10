package ch03_op;
/*
 * 증감연산자 예제
 */
public class Op_Ex_02 {

	public static void main(String[] args) {
		int x = 5, y = 0;
		
		y = x ++;  // 1) y = x, y = 5, 2) x++: x = 6
		System.out.println("1. x = " +x+",y = "+y); // x = 6, y = 5
		y = ++ x;  // 1) ++x: x = 7, 2) y = x y = 7
		System.out.println("2. x = " +x+",y = "+y); // x = 7, y = 7
	
		System.out.println("3. x = " +x++); // x = 7출력 후 x++ 되서 8값으로 마무리
		System.out.println("4. x = " + ++x); // 이전 항에서 x가 8로 마무리되엇고
											 //	출력전에 ++x 증가해서 9출력
		x = y--;   // 1) x = y , 2) y--, y==6
		System.out.println("5. x = " +x+",y = "+y); // x = 7, y = 6
		x = --y;   //
		System.out.println("1. x = " +x+",y = "+y); // x = 5, y = 5
	}

}
