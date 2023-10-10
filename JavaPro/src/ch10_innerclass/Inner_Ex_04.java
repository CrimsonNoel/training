package ch10_innerclass;
public class Inner_Ex_04 {
	public static void main(String[] args) {
			// I t = new I(); error
		I i = new I() {  // IClass
			int iv = 100;
			@Override
			public void test() {
				System.out.println("iv= "+iv);
				System.out.println("this.iv= "+this.iv);
				System.out.println("I 내부 클래스의 test 메서드");	}};		
			i.test();
			// iv 멤버는 I 인터페이스의 멤버가 아니므로 접근 불가
//			System.out.println(i.iv);//error, interface I 에 iv가없다.
			int iv = 100;
			// iv++;
			// 무명의 내부클래스는 지역내부클래스임.
			// 지역변수는 상수화가 필요함/
			Abs a = new Abs() { // AbsClass
				@Override
				void test() {
					System.out.println("iv= "+iv); // 지역변수 final iv 출력
					System.out.println("Abs 내부 클래스의 test 메서드");
				}			};
			a.test();
	}}
interface I {
	void test();	}

abstract class Abs{
	abstract void test();
}
