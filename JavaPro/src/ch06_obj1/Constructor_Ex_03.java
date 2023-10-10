package ch06_obj1;
class Constructor_Ex_03 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		Car3 c3 = new Car3("red","manual",9);
		Car3 c4 = new Car3("black","auto");
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);
		System.out.println("c4: "+c4);
	}}
/* 생성자에서 this를 사용하여 다른 생성자를 사용할 수 있다*/
class Car3{
	String color; // 색상
	String gearType; // 변속기 종류 - auto / manual
	int door; // 문의 개수

	Car3(){		this("white","auto",4);		}
	
	Car3(String color){		this(color,"auto",4);		}
	
	Car3(String color, String gearType, int door){
		this.color = color;		this.gearType = gearType;
		this.door = door;	}
	
	Car3(String color, String gearType){
		this(color,gearType,9);
	}
	
	
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}