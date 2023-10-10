package ch15_lambda;
/*
 * 람다식의 객체는 local inner Class로 표현된다.
 * 메소드 내에서 선언시 파이널이란 이야기
 */
interface LambdaInterface5{
	void method();	}

class Outer{  // 이너 클래스 메소드내에서 선언(int~)하면 final상수,재선언 불가하다. iv=50;같이 int를 제외시켜서 클래스 변수로 해도된다.
	public int iv = 10;
	void method() {
		int iv = 40;
		LambdaInterface5 f5 = () -> {
			// int iv = 50; //error
			// iv = 50; // final 상수화 필요
		System.out.println("Outer.this.iv= "+Outer.this.iv);
		System.out.println("this.iv= "+this.iv);
			// Outer 클래스의 iv 멤버
		System.out.println("iv= "+iv);
		};
		f5.method();	}}
public class Lambda_Ex_05 {
	public static void main(String[] args) {
			Outer o = new Outer();
			o.method();
		
	}

}
