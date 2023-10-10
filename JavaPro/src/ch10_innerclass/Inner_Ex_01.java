package ch10_innerclass;
/*
 * 내부 클래스
 * 
 * 	인스턴스 내부클래스 :
 * 	static 내부클래스 :
 * 	지역내부클래스		: 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
 * 	이름없는(무명의)내부클래스 : 클래스 없이 객체화 가능한 클래스
 * 							추상클래스,인터페이스 의 객체화 가능함.
 */ 
public class Inner_Ex_01 {
	public static void main(String[] args) {
			Outer1.StaticInner si = new Outer1.StaticInner();
			System.out.println(si.iv); //300					// 주소가 있어야 불러올수있다.
			System.out.println(Outer1.StaticInner.cv); //400
			System.out.println(Outer1.StaticInner.MAX); //500
			//Outer.InstanceInner ii1 = new Outer1.InstanceInner();
			Outer1.InstanceInner ii = (new Outer1()).new InstanceInner();
			Outer1 outer = new Outer1();
			Outer1.InstanceInner ii2	= outer.new InstanceInner();
			System.out.println(ii2.iv); //100
			System.out.println("Outer.InstanceInner.cv: "+
					Outer1.InstanceInner.cv);
			System.out.println(Outer1.InstanceInner.MAX); // 실수
			System.out.println("======================================");
			outer.method();
	}}

class Outer1{
	class InstanceInner{ // 인스턴스 내부클래스
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;	}
	static class StaticInner{ // 스태틱 클래스	
		int iv = 300;		static int cv = 400;
		final static int MAX = 500;	}
	
	void method() {
		class LocalInner{ // 지역 내부 클래스 //int 는 그냥 value 주소가없다.
			int iv = 600;		static int cv = 700;
			final static int MAX = 700;		} // 상수는 가능
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv); // 600
		System.out.println(lc.MAX); // 700
		System.out.println(LocalInner.MAX);
		System.out.println(LocalInner.cv);	}
	
	void method2() {
		// LocalInner lc = new LocalInner(); // => method() 메서드에서만 사용가능
	}
	
}













