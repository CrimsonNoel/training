package ch06_obj1;
public class MemberCall_Ex_02 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	public static void main(String[] args) {
		
		cv2 = new MemberCall_Ex_02().iv1; 
		// MemberCall_Ex_02 클래스 내에서 cv1,cv2는 static iv1,iv2는 int로만 선언
		new MemberCall_Ex_02().method1(); // static이 아닌 일반void만 선언되어서 따로 불러와야함.
		method2(); //클래스에 static 으로 선언되어 static으로 선언한 main 안에서는 선언안해도 괜찮다.
	}
	
	void method1() {
		System.out.println(cv1+cv2);
		System.out.println(iv1+iv2);
	}
	static void method2() {
		MemberCall_Ex_02 m = new MemberCall_Ex_02();
		System.out.println(cv1+cv2);
		System.out.println(m.iv1+m.iv2);
	}
		
			
	
	
}
