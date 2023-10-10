package ch06_obj1;
/*
 * 초기화 블럭 예제
 *  static 초기화 블럭 :
 *      주요기능 : 클래스 변수의 초기화
 *      실행시기 : 클래스 정보가 로드 되고, 한번 실행.
 *  인스턴스 초기화 블럭
 *      주요기능 : 인스턴스 변수의 초기화. 생성자와 기능이 겹침
 *      실행 시기: 객체 생성시 생성자 호출전에 먼저 호출됨.     
 *
 *  class명 call -> static 변수  -> static block --> static method
 *  객체화  -->instance 변수 --> instance block ---> 생성자
 */
public class Init_Ex_01 {
		Init_Ex_01(){//생성자
			System.out.println("5.생성자 호출됨");	}
		static int cv; // 클래스 변수
		int iv; 	   // 인스턴스 변수
		static {	   // static 초기화 블럭
			cv = (int)(Math.random()*100);
			System.out.println("1.클래스 초기화 블럭cv = "+cv);
//			 iv = (int)(Math.random()*100);// error
//			▲ 사용시 new Init_Ex_01().iv = 으로 해줘야 에러가 안난다
		}
		{// 인스턴스 초기화 블럭
			iv = (int)(Math.random()*100);
			System.out.println("4.인스턴스 초기화 블럭 생성자 보다 먼저 호출됨"+iv);		}
		
	public static void name() {
		System.out.println("name");	}	
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main Init1 객체 생성");
		Init_Ex_01 init1 = new Init_Ex_01();
		name();
		System.out.println("main init2 객체 생성");
		Init_Ex_01 init2 = new Init_Ex_01();
		Init_Ex_01 init3 = new Init_Ex_01();
		Init_Ex_01 init4 = new Init_Ex_01();
		Init_Ex_01 init5 = new Init_Ex_01();
	}

}
