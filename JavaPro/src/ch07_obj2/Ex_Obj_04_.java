package ch07_obj2;
/*
 *  1) 좌표 클래스 : Point
 * 멤버변수 : int x,y
 * 생성자	  : Point(x,y)
 * 
 *  2) 도형 클래스 : Figure
 * 멤버변수 : String type // 도형종류
 * 생성자	  : 도형종류를 입력받아 객체 생성
 * 
 *  3) 원클래스 : Circle => Figure 클래스를 상속받아 작성하기
 *   멤버변수 : 반지름(r), Point p
 *   생성자 (도형종류, r, x, y) : Point(x,y)
 *    메소드
 *  	도형의 넓이 area() : Math.PI이용
 *  	도형의 둘레 length(): Math.PI이용
 *  
 *  4) 사각형 :  Rectangle => Figure 클래스를 상속받아 작성하기
 *    멤버변수    Point p+1,    Point p2
 *    생성자(도형종류, x1, y, x2, y2)
 *    Point(x1,y1)
 *    Point(x2,y2)
 *    *사각형 점은 (p1.x,p1,y) (p1.x,p2.y),(p2.x,p1.y),(p2.x,p2.y)를 의미한다
 *    메소드
 *    	도형의 넓이 area()
 *     	도형의 둘레 length()
 *  
 */

public class Ex_Obj_04_ {
	public static void main(String[] args) {
			Figure[] fig = new Figure[2];
			fig[0] = new Circle2("원",5,1,1);
			fig[1] = new Rectangle2("사각형",1,4,3,7);
			// x1, y1, x2, y2
			// 3-1=2 가로  7-4=3 세로
			for(Figure f : fig) {
				System.out.println(f+"-->면적: "+f.area()+"  둘레: "+f.length());	}
		}}

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;	} }

abstract class Figure{
	String type;
	public Figure(String type) {
		this.type = type;	}
	abstract double area();
	abstract double length(); }

class Circle2 extends Figure{
	int r;
	Point p;
	public Circle2(String type, int r, int x, int y) {
		super(type);
		this.r = r;	
		p = new Point(x,y);}
	@Override	
	double area(){		double area = Math.PI*r*r;
						return area;		}
		@Override
	double length() {		double length = Math.PI*r*2;
						return length;		}
		@Override
		public String toString() {
			return "원";
		}
		
}
class Rectangle2 extends Figure	{
	Point p1; Point p2;
	public Rectangle2(String type,int x1,int y1, int x2, int y2) {
		super(type);
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);	}
	
	
	@Override	
	double area(){		
		int h = Math.abs(p1.x - p2.x);
		int v = Math.abs(p1.y - p2.y);
		return h*v;		}
	@Override
	double length(){		
		int h = Math.abs(p1.x - p2.x);
		int v = Math.abs(p1.y - p2.y);
		return 2*(h+v);		}


	@Override
	public String toString() {
		return "사각형";
	}
		
	
}


