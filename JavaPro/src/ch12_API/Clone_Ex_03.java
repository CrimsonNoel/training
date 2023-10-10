package ch12_API;
// thinClone?
public class Clone_Ex_03 {
	public static void main(String[] args) {
			Circle c1 = new Circle(new Point(1, 1), 2.0);
			Circle c2 = c1.clone();
			System.out.println("c1= "+c1);
			System.out.println("c2= "+c2);
			c1.p.x = 9;		c1.p.y=9;
			System.out.println("= c1의 변경 후 =");
			System.out.println("c1= "+c1);
			System.out.println("c2= "+c2);
			// Clone 간에 서로 주소가 다르기에 c1값을 바꾸면 c2는 변경이 없어야한다.
			// 하지만 여기서는 c2값도 바뀌는 현상이발생. p의 주소가 같이 복제된거다.
	}}

class Circle implements Cloneable{
	Point p ;  double r; // 반지름
	Circle(Point p, double r){  // x,y는 앞부분에서 처리되어있음
		this.p = p;		this.r = r;	}
	public Circle clone() { // 얕은 복사(thin clone)
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {		}
		return (Circle) obj;	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}}