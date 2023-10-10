package ch06_obj1;
public class Constructor_Ex_02 {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 1234);
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c3);
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);
		System.out.println("c4: "+c4);
		
	}}
/*
 * 생성자도 오버로딩 가능하다
 * 내가 원하는 파라미터 형식을 쓰고싶으면 그 생성자를 오버로딩해서 만들면된다. 
 */
class Car{
	String color; int number;
	
	Car(String c, int n){
		color = c;		number = n;}
	Car(String c){
		color = c;		number = 1;}
	Car(int n){
		color = "white";	number = n;}
	Car(Car c){
		color = c.color;		number = c.number;}
	@Override
	public String toString() {
		return "Car [color=" + color + ", number=" + number + "]";
	}
	
}
