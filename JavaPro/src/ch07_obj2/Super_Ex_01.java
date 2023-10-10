package ch07_obj2;
public class Super_Ex_01 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
				
	}}

class Parent{
	int x;
	Parent(){x=100;}
	public Parent(int x) {
		super();
		this.x = x;
	}
	
}

class Child extends Parent{
	int y;
	Child() {	super(0);	}      // 부모 클래스도 디폴트 생성자를 만들던가 상속 받는
	public Child(int x, int y) {   // 클래스에 디폴트 값을 넣어주면 된다.
		super(x);
		this.y = y;
	}}
