package ch06_obj1;
public class Sonata_Ex_01 {
	public static void main(String[] args) {
		System.out.println
		   ("자동차 크기: "+Sonata.width+","+Sonata.height);

		Sonata car1 = new Sonata();
		car1.color = "white";	car1.number=1234;
		System.out.println("car1: "+car1); // car1.toString();메서드 호출
		Sonata car2 = new Sonata();
		car2.color = "black";	car2.number=2345;
		System.out.println("car2: "+car2);
		System.out.println("===========================");
		
		car2.width = 300;
		car1.height = 200;  // 위에서 car1,car2 = new Sonata();인걸 선언했기에 서로다른
							// 변수를 변경해도 함수 Sonata();값이 바뀌므로 width300 heigth200출력
		String temp = "aaa: "+car1;
		System.out.println(temp);
		System.out.println("===========================");
		System.out.println("car1: "+car1);
		System.out.println("car2: "+car2);
	}

}
