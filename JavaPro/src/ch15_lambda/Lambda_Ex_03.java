package ch15_lambda;
/*
 * 매개변수 존재, 리턴 값이 없는 경우
 * 매개변수가 한개인 경우() 생략 가능
 * 실행되는 구문이 한개인 경우{}생략 가능
 * 
 */

interface LambdaInterface3{ void method(int x);	}
public class Lambda_Ex_03 {
	public static void main(String[] args) {
			LambdaInterface3 f3;
			// 파라미터 한개 리턴타입 없는 람다식
			f3 = (x)-> {System.out.println(x*5);};
			f3.method(2);
			f3.method(10);
			f3=(x)->{System.out.println(x+x);};
			f3.method(10); // 20
			f3 = x -> System.out.println(x*3);
			f3.method(10); // 30
			
			LambdaInterface3 f4 = new LambdaInterface3() {
				@Override
				public void method(int x) {
					System.out.println(x);
				}			};
				
			excute(x -> print(x),3);
	
	}



static void excute(LambdaInterface3 f3, int num) {
	f3.method(num+1);
}
static void print(int x) {
	System.out.println(x+3);
}

}