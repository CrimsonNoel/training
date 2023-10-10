package ch08_interface;
/*
 * final 변경불가.
 * final method : 재정의 불가. 오버라이딩 불가 메서드
 */

public class FinalMethod_Ex_01 {
	
	final void finalMethod_Ex_01(){ // 오버라이딩 불가 메서드
		System.out.println("FinalMethod 오버라이딩 불가");
	}}

class SubMethod extends FinalMethod_Ex_01{
//	void finalMethod_Ex_01()) {
	{	System.out.println("FinalMethod 오버라이딩 불가");
	}
}
	
