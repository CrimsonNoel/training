package ch07_obj2;
public class Casting_Ex_01 {
	public static void main(String[] args) {
		Car car1 = new FireEngine();      //100주소
//		Car car1 = new Car(); // error    //100주소
		Car car2 = null;
		FireEngine fe = null;
		car1.drive();
		
		fe = (FireEngine)car1; //  car1 = new car(); 일 경우 (FireEngine) ca1이 주소는 맞지만
		fe.drive();			   //  car1에가서 fe를 찾을수는 없다. 자식안에 부모는 있지만 부모안에 자식은 없다.
		car2 = fe;
		car2.drive();
	}}

class Car{
	String color; int door;
	void drive() {		//  운전하는 기능
		System.out.println("drive, brrrr~");	}
	void stop() {		// 멈추는 기능
		System.out.println("stop!!!");	}	}
class FireEngine extends Car{		// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");	}
	
}
