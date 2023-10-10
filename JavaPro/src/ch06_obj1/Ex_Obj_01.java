package ch06_obj1;

/*
 * 1) 직사각형(Rectangle) 클래스 만들기
 * 가로(width), 세로(height)의 변수를 가지고 있는
 * 모든 멤버의 접근제한자는 생략한다.
 * 모든 멤버는 인스턴스 멤버이다.
 * 멤버 메서드로는 넓이를 print 하는 area(),둘레를 print 하는 length()를 가진다.
 * ExObj01 : 구동클래스. main 메서드를 멤버로 가지고 있는 클래스.
 * 			보통 public 클래스임.
 * 파일의 이름은 반드시 public 클래스의 이름과 동일해야 함.
 */
public class Ex_Obj_01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;		r1.height = 5;
		System.out.println("넓이 : ");		r1.area();
		System.out.println("둘레 : ");		r1.length();
		
		// 가로가 30, 세로가 20인 직사각형의 객체를 생성하고, 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이 : ");
		r2.area();
		System.out.print("둘레 : ");
		r2.length();  }}
/*
 * 넓이: 10*5=50
 * 둘레: (10+5)*2=30
 * 넓이: 30*20=600
 * 둘레: (30+20)*2=100
 */
class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println(width+"*"+height+"="+(width*height));	}
	void length() {
		System.out.println("("+width+"+"+height+")*2"+"="+(width+height)*2);	}
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

}
	
