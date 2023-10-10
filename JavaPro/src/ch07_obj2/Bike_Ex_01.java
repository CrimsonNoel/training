package ch07_obj2;
public class Bike_Ex_01 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println("바퀴"+ab.wheel+"개가 굴러간다.");
		System.out.println(ab.stop());
		System.out.println("천천히 멈춘다.");
		System.out.println("==================");
		Bike bi = new Bike(2);
		System.out.println(bi.drive());
		System.out.println("바퀴"+bi.wheel+"개가 굴러간다.");
		System.out.println(bi.stop());
		System.out.println("천천히 멈춘다.");
			
	}}

class Bike{
	int wheel;
	Bike(int wheel){		this.wheel = wheel;}//default 생성자 없음
	String drive() {		return "bike 페달을 밟는다.";}
	String stop() {		return "bike 브레이크를 잡는다.";}}
class AutoBike extends Bike{
	boolean power;
	AutoBike(int wheel){		super(wheel);}
	void power() { power =! power;}

	@Override
	String drive() {
		if(!power)power();		return "출발 버튼을 누른다";	}
		// power가 아닐때 power()를 실행한다. false일떄 power()실행 //false를 true로 바꾼다.
	@Override
	String stop() { if(power) return "정지 버튼을 누른다";	
	else		return "이미 정지 되어있음.";
	}
	
}