package ch06_obj1;
/*
 * call stack 영역
 * 재귀메서드(함수) : 자신이 자신메서드를 다시 호출하는 메서드
 * 		=> 스택 영역이 존재하므로 가능함.
 */
public class Factorial_Ex_01 {

	public static void main(String[] args) {
		System.out.println("4! ="+ factorial(4));
		//4*3*2*1 
		
	}
	public static int factorial(int i) {
		System.out.println(" i="+i);
		return (i==1)?1:i*factorial(i-1);
		//팩토리얼 특성상 입력값 -1씩해서 1이될때까지 곱연산하는걸 이용함
	}
	
}
