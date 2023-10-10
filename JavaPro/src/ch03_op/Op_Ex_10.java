package ch03_op;

public class Op_Ex_10 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;     // 인트*인트 지만 범위를 벗어나버림 overflow
		long b = 1000000 * 1000000L;    // 인트*롱  L이 붙었기떄문에 L값이 되고 L범위 내이기떄문에 정상출력
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
