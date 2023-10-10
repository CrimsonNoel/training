package ch15_lambda;
/*
 * 매개변수도 있고, 리턴값도 있는 경우.
 * 람다식 내부에 실행되는 구문이 한개인 경우 { } 생략 가능
 * 람다식 내부에 실행되는 구문이 한개인 경우 return 생략 가능
 */
interface LambdaInterface4{
	
	int method(int x,int y);
}

public class Lambda_Ex_04 {
	public static void main(String[] args) {
			LambdaInterface4 f4 = (x,y) -> {return x*y;};
			System.out.println("두수의 곱: "+ f4.method(2,5));// 10
			// return과 중괄호{} 생략가능, 생략한것
			f4 = (x,y)->x+y;
			System.out.println("두수의 합: "+ f4.method(2,5));// 7
			
			f4 = (x,y)->x/y;
			System.out.println("두수의 몫: "+ f4.method(5,2));// 2
			
			f4 = (x,y)->x%y;
			System.out.println("두수의 나머지: "+ f4.method(5,2));// 1
			
			f4 = (x,y)-> sum(x,y);
			System.out.println("두수의 합: "+ f4.method(2,5));// 1
			
			f4 = (x,y)->(x>y)? x : y;
			System.out.println("두수 중 큰수: "+ f4.method(2,5));// 1
			
			f4 = (x,y)->(x<y)? x : y;
			System.out.println("두수 중 작은수: "+ f4.method(2,5));// 1
		    
			excute((x,y)->sum(x,y),33,11);
	}

	static int sum(int x, int y) {
		return x+y;
	}
	
	static void excute(LambdaInterface4 f4, int x, int y) {
		System.out.println(f4.method(x, y)); 
			}
	
}
