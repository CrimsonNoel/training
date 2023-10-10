package ch07_obj2;
/*
 * 다형성 예제
 * 
 * Product 클래스
 * 		멤버변수 : int 가격(price), int 포인트(point)
 * 		생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 * Tv 클래스(Parent class:Product)
 * 		생성자(int) : 가격을 100설정하기
 * 		toString() 메서드에서 Tv를 리턴
 * Computer 클래스 (Parent class:product)
 *  		생성자(int) : 가격을 200설정하기
 * 			toString() 메서드에서 Computer 를 리턴
 * SmartPhone 클래스 (Parent class:product)
 * 			생성자(int) : 가격을 150설정하기
 * 			toString() 메서드에서 SmartPhone 를 리턴
 */
public class Ex_Obj_02_ {
	public static void main(String[] args) {
		Tv tv = new Tv(100);	// 100
		Computer com = new Computer(200); // 200
		SmartPhone sp = new SmartPhone(150); // 300
		System.out.println("Tv 가격: "+tv.price+"만원 적립 포인트: "+tv.point);
		System.out.println(com);
		System.out.println(sp);
	}}

class Product{
	int price, point;
	

	public Product(int price) {
		super();
		this.price = price;
		this.point = price/10;	}
	
}
class Tv extends Product{
	Tv(int price){	super(price);	}

	@Override
	public String toString() {
		return "Tv";
	}	}
class Computer extends Product{
	Computer(int price){	super(price);	}

	@Override
	public String toString() {
		return "Computer";
	}}
class SmartPhone extends Product{
	SmartPhone(int price){	super(price);	}

	@Override
	public String toString() {
		return "SmartPhone";
	}}