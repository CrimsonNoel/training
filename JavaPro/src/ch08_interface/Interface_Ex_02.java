package ch08_interface;

class Interface_Ex_02 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA2();
	}}
class A2{
	void methodA2() {
			I2 i = InstanceManager.getInstance();
			i.methodB2();
			System.out.println(i.toString()); // i로 Object 클래스의 메서드 호출 가능
	}}

interface I2{
	abstract void methodB2(); // 기본이 추상메서드다 그래서 abstract 생략가능.
}

class InstanceManager{
	static I2 getInstance(){
		return new B2();  // 리턴 타입을 I2로 만들었으니 B2클래스는 I2를 상속하도록 만들어야한다.
	}}					  // B3 로 바꾸면 B3 클래스가 실행된다.
class B2 implements I2{
	
	@Override
	public void methodB2() {
		System.out.println("methodB in B2 class");
	}

	@Override
	public String toString() {
		return "class B2";
	}		}

class B3 implements I2{
	
	@Override
	public void methodB2() {
		System.out.println("methodB in B3 class");
	}
	@Override
	public String toString() {
		return "class B3";
	}			}
