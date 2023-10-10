package ch10_innerclass;
/*
 * 내부클래스 객체에서 사용되는 this
 */
public class Inner_Ex_03 {
	public static void main(String[] args) {
			Outer3 out = new Outer3();
			Outer3.InstanceInner ii = out.new InstanceInner();
			ii.method1();
	}}

class Outer3{
	int iv = 10;
	int iv2 = 20;
	
	class InstanceInner{
		int iv = 100;
		void  method1() {
			int iv = 300;
			
			System.out.println("iv = "+ iv); //300
			System.out.println("this.iv = "+this.iv);// 100
			// Outer.this.iv : Outer3 클래스의 멤버 변수 iv값
			Outer3.this.iv = 50; // 변경가능
			System.out.println("Outer3.this.iv = "+ Outer3.this.iv); }// 50;	//?왜10임
		
	}}
