package ch06_obj1;
/*
 * 매개변수 예제.
 * 기본형 매개변수	: read only	   (값! 밸류!)
 * 참조형 매개변수	: read & write (주소! 인스턴스!)
 */
public class Parameter_Ex_01 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		// 순차적으로 실행된다.
		change1(v.val);
		System.out.println("2:change1(100) 이후 : "+v.val);
		change2(v);
		System.out.println("4:change2(1000:주소) 이후 : "+v.val);	
		System.out.println("===============================");
		System.out.println(v.val);
		System.out.println(v.val+v.val);
		System.out.println(v.val);
		v.val =400;
		System.out.println(v.val);
		change1(v.val);
		change1(v.val);
		System.out.println("===============================");
		change2(v);
		change2(v);
		change2(v);
		System.out.println("===============================");
		change2(v);
		change1(v.val);
		change3(v.val);
	}
	    
	static void change3(int a) {a = 100; System.out.println(a);}
	static void change1(int val) { // value 값만 변경 //아무 상관없는 val이다.
		val += 100;
		System.out.println("1:change1() : "+val);
	}
	
	static void	change2(Value v) { // v instance 주소 자체값이 변경
		v.val += 100;
		System.out.println("3:change2() : "+v.val);
	}
	
}

class Value{
	int val;
	
}