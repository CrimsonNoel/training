package ch07_obj2;
/*
 * 추상 클래스간의 상속이 가능함
 * 추상 클래스가 자손 클래스인 경우 부모의 추상 메서드를 구현하지 않아도됨
 * 단 추상클래스를 상속받은 일반 클래스는 모든 추상메서드를 구현해야 함.
 */
public class Abstract_Ex_01 {
	public static void main(String[] args) {
			Abs1 a1 = new Normal();
			System.out.println(a1.getA()); // 10
//			System.out.println(a1.getB()); // error getB()멤버는 Abs1의 멤버가 아님 Abs2의 부모다
			Abs2 a2 = (Abs2)a1;								// 부모안에 자식없고 자식안에 부모있다.
			System.out.println(a2.getA()); // 10
			System.out.println(a2.getB()); // 20
			Normal n = (Normal)a2;      // getA(), getB()는 추상이였다가 일반클래스 Normal에 들어가서 override되었기에 객체화가능해졌다.
			System.out.println(n.getA()); // 10
			System.out.println(n.getB()); // 20
			//a2 = new Abs2(); // error. 추상클래스는 객체화 불가.
		    
	}}

abstract class Abs1{
	int a=10;
	abstract int getA();
}
abstract class Abs2 extends Abs1{   // 추상 클래스를 상속받는 자손인 경우 override반드시 해야하지만
	int b =20;						// 서로 같은 추상 클래스면 안해도된다.
	abstract int getB();
}
class Normal extends Abs2{

	@Override
	int getB() {
		return b;  // Abs2
	}

	@Override
	int getA() {
		return a;  // Abs1
	}
	
}
