package ch07_obj2;
public class Bike_Ex_02 {
	public static void main(String[] args) {
			AutoBike auto1	= new AutoBike(2); //100 주소
			AutoBike auto2; // null
			
			Bike bike;   // null
			auto1.power();
			System.out.println(auto1.drive());
			System.out.println("바퀴"+auto1.wheel+"개가 굴러간다.");
			System.out.println(auto1.stop());
			bike = auto1;   // bike : 100주소
//error		bike = power();
//			bike = new Bike(2);  // 바로 위에서 bike를 =auto1 주소 100이라 정했는데 Ex_01에서 부모 클래스로
//			주소가 바뀐다			 // 선언 해버리니 바뀐 주소에 bike가 없어서 밑에 명시적 캐스팅 한곳에서 에러가 난다
			System.out.println("===============");
			System.out.println(bike.drive());  // Ex_01에서 Override 되었기때문에 그대로 유지된다.
			auto2 = (AutoBike)bike;				// 명시적 캐스팅 (   )   ;
			auto2.power();
			System.out.println(auto2.drive());
			System.out.println(auto2.stop());
	}}
