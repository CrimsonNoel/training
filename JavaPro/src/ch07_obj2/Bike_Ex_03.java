package ch07_obj2;
public class Bike_Ex_03 {
	public static void main(String[] args) {
		AutoBike3 auto = new AutoBike3(2); //100
		System.out.println("가격은 "+ auto.price+"만원 입니다.");
		auto.drive();
		auto.stop();
		System.out.println("======================");
		Bike3 bike = auto;
		System.out.println("가격은 "+ bike.price+"만원 입니다.");		
		bike.drive();
		bike.stop();
	
	}}

class Bike3{
	int wheel;
	int price = 10;
	Bike3(int wheel){		this.wheel = wheel;}   //default 생성자 없음
	void drive() {		 System.out.println("bike 페달을 밟는다.");}
	void stop() {		System.out.println("bike 브레이크를 잡는다.");}}

class AutoBike3 extends Bike3{
	boolean power; int price = 200;
	AutoBike3(int wheel){		super(wheel);	}
	void power() {
		power =! power;
		if(power) System.out.println("전원이 켜졌습니다.");
		else	  System.out.println("전원이 꺼졌습니다.");}	
	@Override
	void drive()	{
		if(!power)power();
		System.out.println(this.price+ "원 : 출발 버튼을 누른다.");
		System.out.println(super.price + "원 : 출발 버튼을 누른다.");	}
	@Override
	void stop() {
		if(power) System.out.println("정지 버튼을 누른다.");
		else System.out.println("전원이 꺼졌습니다. 멈출 수 없습니다.");	}
}