package ch08_interface;

class Interface_Ex_01 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1()); // void autoPlay(I i)호출
		a.autoPlay(new C1()); // void autoPlay(I i)호출
	}}

class A1{
	void autoPlay(I1 i) { // i 값의 타입이 I1인데 I1은 인터페이스 타입니다. 
		i.play();         // 인터페이스나 클래스 타입의 멤버는 그 타입의 멤버만본다
	}}
interface I1{   // abstract 생략가능
	void play();
}
class B1 implements I1{
	public void play() {
		System.out.println("play in B class");
	}
}
class C1 implements I1{
	public void play() {
		System.out.println("play in C class");
	}
}