package ch14_collection;

import java.util.Stack;

public class StackQueue_Ex_03 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	public static void main(String[] args) {
		goURL("1.네이트");	goURL("2.야후");	goURL("3.네이버");	goURL("4.다음");
		printStatus();
		goBack();	System.out.println("= 뒤로가기 버튼을 누른 후 =" );	printStatus();
		goBack();	System.out.println("= 뒤로가기 버튼을 누른 후 =" );	printStatus();
		goFoward(); System.out.println("= 앞으로 버튼 누른 후");
		printStatus();
		goURL("kic.com");
		System.out.println("= 새로운 주소로 이동 후");		printStatus();	}
	
	
	
	private static void printStatus() {
		System.out.println("back: "+back);
		System.out.println("forward: "+forward);
		System.out.println("현재 화면은 '"+back.peek()+"'입니다.");
		System.out.println();	}
	
	private static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) forward.clear();}
		
	private static void goFoward() {
		if(!forward.empty()) back.push(forward.pop());
	}
	private static void goBack() {
		if(!back.empty()) forward.push(back.pop());
	}
	

}
