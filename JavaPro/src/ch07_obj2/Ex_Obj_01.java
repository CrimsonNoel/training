package ch07_obj2;
/*
 *1. Animal 클래스 => 추상클래스
 *		멤버변수 : 동물의 종류(type),다리수(leg)
 *		생성자 : 동물의 종류랑 다리수 입력받기.
 *		멤버메서드 :
 *			void eat(); => 추상메서드
 *			void sound(); => 추상메서드
 *2. Dog 클래스	:	Animal 클래스의 자손클래스
 *		생성자의 매개변수 없음.
 *		멤버메서드 : 
 *			void eat() :	"주인이 주는대로 먹는다" 출력
 *			void sound() :	" 멍멍";
 *3. Lion 클래스 :  Animal 클래스의 자손클래스
 *		생성자의 매개변수 없음.
 *		멤버메서드 : 
 *			void eat() :	"초식동물을 잡아먹는다" 출력
 *			void sound() :	" 어흥";
 *			 
 */
public class Ex_Obj_01 {
	public static void main(String[] args) {
			Animal1[]	animal = new Animal1[2];
			animal[0] = new Cat();
			animal[1] = new Puma();
			for(Animal1 a : animal) {
				System.out.print(a.type + "=>");
				a.sound1();
				a.eat1();
			}}}

abstract class Animal1{
	String type; int leg;
	
	public Animal1(String type, int leg) {
		super();
		this.type = type;		this.leg = leg;
	}
	abstract void sound1();
	abstract void eat1();
}
class Cat extends Animal1{
	Cat(){		super("고양이",4);}
	@Override
	void sound1() { System.out.print("야옹  ");
			}
	@Override
	void eat1() { System.out.println("통조림");
		}
	@Override
	public String toString() {
		return "고양이";
	}
	
	
}
class Puma extends Animal1{
	Puma(){ 	super("퓨마",4);}
	@Override
	void sound1() { System.out.print("어흥  ");
			}
	@Override
	void eat1() { System.out.println("사냥");
			}
	@Override
	public String toString() {
		return "퓨마";
	}
	
	}




