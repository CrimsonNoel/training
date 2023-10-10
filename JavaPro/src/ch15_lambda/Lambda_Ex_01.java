package ch15_lambda;
/*
 * 람다식 예제 : jdk8.0 이후 버전에서 사용가능.
 * 람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface여야함
 * @FunctionInterface : 인터페이스에는 추상메서드가 한개임.
 * 매개변수가 없고, 리턴값도 없는 경우
 * 매개변수 없음 : ()->{.... }
 * 람다식 내부에 실행되는 구문이 한개인 경우 { } 생략 가능
 */

public class Lambda_Ex_01 {
	public static void main(String[] args) {
			//기존 방식으로 코딩
			// 파라미터 없고 리턴타입도 없는 람다식
		LambdaInterface fi = new LambdaInterface() {
			@Override
			public void method() {
				System.out.println("1) 기존방식으로 코딩");
			}		};
	
			fi.method();
			
			fi = ()->{
				String str = "2) method call";
				System.out.println(str);
			}; 
			fi.method();
			
			fi = () ->
				System.out.println("3) method call2"); 
			
			fi.method();
				
			fi = () ->{
				System.out.println("4) method call3");
			};
			fi.method();
			
			fi = () ->
				System.out.println("5) method call4");
				fi.method();
			
			excute(() -> {System.out.println("6) LambdaInterface1 parameter1");});
			excute(() -> System.out.println("7) LambdaInterface1 parameter2"));
	
	}
	static void excute(LambdaInterface1 f1) {
		f1.method();
}

	
	
	}
interface LambdaInterface { void method();}
interface LambdaInterface1{ void method();}
