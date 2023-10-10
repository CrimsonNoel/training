package ch07_obj2;
/*
 * 추상 클래스
 * 		추상메서드를 가질 수 있는 클래스. abstract 예약어로 구현함
 * 		객체화 불가 => 객체화는 반드시 상속을 통해서 자손클래스의 객체화로 객체화가 가능함
 * 		이때 자손클래스에서는 추상메서드를 반드시 오버라이딩 해야함.
 * 		그외는 일반클래스와 동일. (생성자, 멤버변수, 멤버메서드...)
 * 		업무의 표준화시 사용함.
 * 
 * 추상메서드 : 선언부만 존재하는 메서드, 구현부가 없다.
 * 			  자손클래스에서 반드시 오버라이딩 해야함.
 * 추상클래스간에도 상속은 가능.
 * 
 */
public class Shape_Ex_01 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
		
		
	}

}

abstract class Shape{
	String type;
	
	Shape(String type){
		this.type = type;		}
	
	abstract double area(); // 추상메서드
	abstract double length();
	@Override
	public String toString() {
		return "Shape";
	}
	
}
class Rectangle extends Shape{
	int a,b;
	Rectangle(int a, int b){
		super("사각형");
		this.a=a;		this.b=b;
	}
	@Override
	double area() {
		return a*b;
	}
	@Override
	double length() {
		return 2*(a+b);
	}
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
}

class Circle extends Shape{
	int r;
	Circle(int r) {
		super("원");
		this.r =r;	}
	

	@Override
	double area() {
		return Math.PI*r*r;
	}

	@Override
	double length() {
		return Math.PI*r*2;
	}


	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}


	
}