package ch04_control;
/*
 * 반복문사용하여 아래 내용을 프린트 하세요 
 * ┌──────┐
 * │Hello │
 * └──────┘
 * ┌──────────────┐
 * │GO JAVA5 hello│
 * └──────────────┘
 *   ㅂ에 한자
 */

public class Ex_control_17 {

	public static void main(String[] args) {
		
		String str = "Hello";
		method(str);
		
			
			
	System.out.println("============================================");		
			
			
		str ="Go JAVA5 hello";
		method(str);	
	
	
	} //main end
	
	public static void method(String str) {
			
		System.out.print("┌");
	for(int i=1; i<str.length(); i++) {
		System.out.print("─");
	}
	System.out.print("─");
	System.out.println("┐");
	System.out.print("│");
	System.out.print(str);
	System.out.println("│");
	System.out.print("└");

	for(int i=0; i<str.length(); i++) {
		System.out.print("─");}
	System.out.println("┘");

	
	}
	
} //class end


