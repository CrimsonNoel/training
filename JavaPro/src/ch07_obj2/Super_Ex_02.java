package ch07_obj2;
public class Super_Ex_02 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}}

class Child2 extends Parent{
	int x = 20;
	Child2(){}  // <=디폴트 생성자
	/* Parent에 디폴트 생성자를 만들던가 
	 * Child2(){ super(0) } 로 작성하면된다.
	 */
	void method() {
		int x = 30;
		// x : 1. 지역변수=> 2. 현재클래스의 멤버 중 x=> 3.부모클래스의 객체의 멤버 중 x
		System.out.println(x); //30 //지역변수
		// 1.현재클래스의 멤버중 x=> 2. 부모클래스의 객체의 멤버 중x
		System.out.println(this.x);//20 //this는 클래스 지칭. Child2
		// 부모클래스의 객체의 멤버 중x
		System.out.println(super.x);//100 // super는 상속받을 클래스 Parent;
	}

}
