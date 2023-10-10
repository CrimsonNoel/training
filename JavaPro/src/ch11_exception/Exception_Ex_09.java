package ch11_exception;

import java.io.IOException;

public class Exception_Ex_09 {

	public static void main(String[] args) {

	}}
/*
 * 오버라이딩 된 메서드의 예외처리는 부모메서드의
 * 예외처리와 같거나 자손(child) Exception만 가능하다.
 * 또한 관련없는 예외처리도 안된다.
 */
class Parent{
	void method(int i) throws Exception{
		System.out.println(i);	}	}
class Child extends Parent{
	@Override
	void method(int i) throws IOException{
		System.out.println(i);
		// throw new IOEXception();
	}	}