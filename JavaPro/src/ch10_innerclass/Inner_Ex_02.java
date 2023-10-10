package ch10_innerclass;
//지역 내부 클래스에서 사용되는 메서드의 지역 변수는 상수화(final)되어야 한다.
public class Inner_Ex_02 {
	public static void main(String[] args) {
			Outer2 out = new Outer2();
			out.method(1111);	}}
class Outer2{
	private static int outercv = 20;		private int outeriv = 10;
	void method(int pv){ // 파라미터는 지역변수다. // final int pv 중 final 생략됨 다시 재정의하지 않는한 괜찮다.
		//지역 내부 클래스에서 사용되는 메서드의 지역 변수는 상수화(final)되어야 한다.
		int i = 0; // 마찬가지 final 생략함
		// pv++;		
		// i++ // final아님
		outeriv++;
		class LocalInner{ // 지역 내부클래스
			int liv = outeriv; // 외부클래스의 private 멤버 접근가능
			int liv2 = outercv; // 외부클래스의 private 멤버 접근가능
			
			void method() {
				// 지역 내부클래스에서 내부클래스가 속한 메서드의 지역변수 변경안됨
				// i = 100; // pv++;
				System.out.println("i= "+i);
				System.out.println("pv= "+pv);
				System.out.println(liv+","+liv2); // 11,20
				System.out.println(outeriv+","+outercv); // 11,20
				//외부클래스의 private 멤버 접근 가능
			}		}
		LocalInner li = new LocalInner();
		li.method();	}}