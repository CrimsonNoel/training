package ch06_obj1;
/*
 * 오버로딩된 메서드의 선택 기준
 * 1. 호출시 입력된 자료형과 선언부의 선언된 자료형이 동일한 메서드 선택.
 * 2. 1의 조건이 없는 경우
 *    최소 갯수로 자동형변환이 되는 매개변수를 가진 메서드를 선택.
 * 3. 주의사항
 *    최소 갯수로 자동형변환이 되는 메서드가 여러개인 경우 오류 발생. 
 *      오버로딩의 조건
 *
 *  1. 메서드의 이름이같다.
 *  2. 매개변수 (type)목록이 다르다.
 *  
 *  리턴타입, 접근제어자등은 상관없다.     
 */
public class Overload_Ex_02 {
	public static void main(String[] args) {

		Math4 m =new Math4();
		System.out.println(m.add(10,10));
		System.out.println(m.add(10,10L));
		System.out.println(m.add(10L,10));
		System.out.println(m.add(10L,10L));
	}}
	
	class Math4{
		int add(int a, int b) {
			System.out.print("int int 메서드 결과 : "); return a + b;}
		// int add(int x, int y){
		// System.out.print("int int 메서드 결과 : ");
		// return x + y; }
		// 메서드는 같다, 매개변수가 달라야된다. 매변수가 이전과 같으면 에러가남..
		
		long add(long a, int b) {
			System.out.print("long int 메서드 결과 : "); return a + b;
		}
		long add(int a, long b) {
			System.out.print("long int 메서드 결과 : "); return a + b;
		}
		long add(long a, long b) {
			System.out.print("long int 메서드 결과 : "); return a + b;
		}
	
	
}
