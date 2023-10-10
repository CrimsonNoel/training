package ch07_obj2;
public class Text_02 {
	public static void main(String[] args) {
		TParent p1 = new TParent();
		TChild c1 = new TChild();
		TChild c2;
		TParent p2;
		
//		c2 = p1;		p2 = c1;	
		}}

class TParent{
	int x;
	void method1() {
		System.out.println("TParent");	}
}
class TChild{
	int x;
	int y;
	void  method1() {
		System.out.println("TChild");	}
}
