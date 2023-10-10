package ch12_API;

public class Clone_Ex_01 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point) original.clone(); // 복제(clone)해서 새로운 객체 생성
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original == copy);// 주소확인 false. 값은 달라도 생성주소가 다름
		
	}
	
}

/*
 * Object clone()은 protected 이기 떄문에
 * clone() 메소드를 만들어서 class내부에서 사용하여야한다.
 * clone()은 반드시 예외처리를 해주어야 한다.
 */
class Point implements Cloneable{  // Clone() 메서드 사용시 Cloneable을 상속받아야 사용할수 있도록 해놨다.
								   // 접근제어자를 완화하는 과정이고 가져다 쓸수있게 풀어주는?게 되기떄문에 (protected>public) 해놓은듯?
								   // Clone()+Cloneable 필수.
	int x,y;
	
	public Point(int x, int y) { 
		super();
		this.x=x;
		this.y=y;	}
	@Override // override 조건. clone()의 접근 제어자는 protected
			  // override 할려면 기존 clone()의 접근 제어자보다 조건이 느슨해야한다. protected->public
	public Object clone(){
		try {
			return super.clone();	
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return null;
	
	}
	@Override
	public String toString() {
			return "Point [x="+x+", y="+y+"]";	
	}

}