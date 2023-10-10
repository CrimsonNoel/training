package ch07_obj2;
public class Super_Ex_03 {
	public static void main(String[] args) {
		Parent3 p = new Child3();  //auto casting
		System.out.println(p.x);  // parent 변수
		p.method();		// Child method()
		Child3 c = new Child3();
		System.out.println(c.x);
		c.method(); // child.method()
		
	}}

class Parent3 {
	int x = 10;;
	void method() {     // 상속 클래스 내에 동일한 이름의 method()가 있으면 자식이 우선권을 가짐.
		System.out.println("Parent 메서드");
	}}

class Child3 extends Parent3{
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Child 메서드");
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

