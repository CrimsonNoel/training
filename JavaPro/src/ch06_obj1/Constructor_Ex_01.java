package ch06_obj1;
/*
 *  생성자란 ? 
 *  	객체화시 호출되는 메서드
 *  	생성자 없이 객체 생성은 불가함.
 *  	기능은 인스턴스 변수의 초기화 담당함.
 *  
 *  생성자 구현
 *  1. 생성자의 이름은 클래스명과 같다.
 *  2. 리턴타입을 기술하지 않는다. 
 *   return 기술시 or void 클래스로 생성시(return 생략가능), 혹은 return값만 다른경우는 불가능
 *  
 *  기본생성자
 *   클래스에 생성자를 하나도 구현하지 않으면 컴파일러가 추가해주는 생성자
 *   public 클래스명(){} 형태임  
 */
public class Constructor_Ex_01 {
	public static void main(String[] args) {

		Number1 n1 = new Number1();
		n1.num = 10;
		Number2 n2 = new Number2();
		Number2 n3 = new Number2(20);
		System.out.println("Number1 클래스의 num = "+ n1.num);
		System.out.println("Number2 클래스의 num = "+ n2.num);
		System.out.println("Number2 클래스의 num = "+ n3.num);
		
	}}
	class Number1{
		int num;
	}
	class Number2{
		int num;
		
		 Number2(){}
		   
		 
		Number2(int x){
			num = x;
		}
	}
