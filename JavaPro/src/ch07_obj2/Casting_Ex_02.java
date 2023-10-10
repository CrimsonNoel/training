package ch07_obj2;
public class Casting_Ex_02 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); //100주소
		FireEngine fe2 = null;
		fe.water();
		car = fe; // 조상타입<- 자손타입 auto casting
//		car.water();  //  100주소로 만들어서 car안에 FireEngine이 있긴하지만
					  // water();가 car타입에 없기떄문에 안나온거다. 
					  // 멤버는 자기 클래스만 본다. 주소는 잘 맞지만 water();는 FireEngined에만 있다. 
		
		fe2 = (FireEngine) car; // 100 자손타입 <ㅡ	조상타입 명시적 casting
		fe2.water();
		
		
	}

}
