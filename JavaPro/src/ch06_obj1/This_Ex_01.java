package ch06_obj1;
/*
 * this 예약어 예제
 * this() 생성자 : 같은 클래스의 다른 생성자 호출시 사용됨.
 * 				this 생성자 사용시 반드시 첫줄에서 호출되어야 함.
 * this 참조변수 : 자기 참조 변수. 자기 참조값을 저장 변수 
 * 				
 * 
 * 인스턴스 멤버를 참조할때 사용됨.
 * 지역변수와 멤버변수의 구분시 사용됨.
 */
public class This_Ex_01 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();		Car2 c2 = new Car2("blue",1234);
		Car2 c3 = new Car2("red");		Car2 c4 = new Car2(5678);
		Car2 c5 = new Car2(c1);
		
		System.out.println("c1: "+c1);		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);		System.out.println("c4: "+c4);
		System.out.println("c5: "+c5);   }}

class Car2{
	String color;
	int number;
	Car2(String color, int number){
		System.out.println("(String,int) 생성자 호출");
		this.color = color;
		this.number = number;}
	Car2(){
		this("white",1234);
		System.out.println("()생성자 호출");}
    Car2(String color){			this(color,1234);		}
    Car2(int number){			this("white",number);		}
    Car2(Car2 c){			this(c.color,c.number);		}
	
    @Override
	public String toString() {
		return "Car2 [color=" + color + ", number=" + number + "]";
	}
    
    
}
