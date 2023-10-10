package ch07_obj2;

import java.util.Date;

import temp.Pack2;
/*
 * package : 클래스들의 모임.
 * 		클래스 이름은 패키지명을 포함한다.
 * 		package 설정은 파일의 처음에 한번만 설정이 가능하다.
 * 		=> 하나의 파일에 있는 모든 클래스는 같은 패키지에 속한 클래스다.
 * 
 * import : 패키지명을 생략할 수 있도록 미리 사용될 클래스의 패키지를 선언하는 문장.
 * 
 * 패키지명을 생략할 수 있는 경우
 * 		1. 같은 패키지에 속한 클래스는 패키지명을 생략 가능함.
 * 		2. java.lang 패키지에 속한 클래스들은 패키지명을 생략 가능함.
 * 		3. import 구문으로 설정된 클래스는 패키지명을 생략 가능.
 */
public class Package_Ex_01 {
	public static void main(String[] args) {
			String str = " ";
			Pack1 p1 = new Pack1();
			p1.method();
			Pack2 p2 = new Pack2();
			p2.method();
			Date d = new Date();
	}}

class Pack1{
	void method() {
		System.out.println("ch07_obj2.Pack1.method() 호출하였음");
	}}