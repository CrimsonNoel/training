package ch12_API;
// thinClone(같은 주소공유) > deepClone(서로 다른주소) 
public class Clone_Ex_04 {
	public static void main(String[] args) {
			Circle2 c1 = new Circle2(new Point(1, 1), 2.0);
			Circle2 c2 = c1.clone();
			System.out.println("c1= "+c1);
			System.out.println("c2= "+c2);
			c1.p.x = 9;		c1.p.y=9;
			System.out.println("= c1의 변경 후 =");
			System.out.println("c1= "+c1);
			System.out.println("c2= "+c2);
			
	}}

class Circle2 implements Cloneable{
	Point p ;  double r; 
	Circle2(Point p, double r){ 
		this.p = p;		this.r = r;	}
	public Circle2 clone() {  // (deep Clone)
		Object obj = null;    //  오버라이딩&클래스 만들기 아무거나 선택해서 해도된다. 대신 클론위치가 외부클래스는 안된다.
		try {
			obj = super.clone();
			Circle2 c = (Circle2) obj;
			c.p = new Point(this.p.x, this.p.y);
			//p주소가 복제되서 원본과 클론의 값이 공유가되니 새로운 p의 주소를 잡아주었다.
		}catch(CloneNotSupportedException e) {		}
		return (Circle2) obj;	}
	@Override
	public String toString() {
		return "Circle2 [p=" + p + ", r=" + r + "]";
	}}