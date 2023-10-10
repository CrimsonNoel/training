package ch06_obj1;
public class Method_Ex_02 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		
		
		System.out.println(m.add1()); //30
		System.out.println("1====================");
		System.out.println(m.add2(100, 200)); //300 // 밑에서 스태틱으로 사용되었기때문에 
		System.out.println(m.x);					// 여기서 메서드하면 아래서 에러남
		System.out.println("2====================");
		System.out.println(Math2.add2(100,200)); //300
		
	}

}
class Math2{
	int a, b, x;   //까지 변수   
	
	int add1() {
		for(int i=0; i<5;i++) {   int x=7;  } // x 값 정해도 지역변수라 빠져나오면 사라짐
		System.out.println(x);
		return a+b;
	}		//까지 메서드
	
	static int add2(int A, int B) {
		int x = 5; // 여기도 지역변수 static 안에서만 x = 5
		return A+B;
	}       // 까지 스태틱     
}