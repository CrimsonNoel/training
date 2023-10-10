package ch07_obj2;

public class Test_01 {

	public static void main(String[] args) {
			A a = new A();
			
			B b = new B();
			
			
	}

}

class A{			// parents!
	int num1;
	
	void method1() {
		
	}
}
class B extends A{   // extends A  > A클래스 상속받는다. child!
	int num2;
	
	void method2() {
		
	}
	
}
