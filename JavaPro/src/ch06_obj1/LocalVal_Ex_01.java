package ch06_obj1;
/*
 * 지역변수 : 메서드 내부에서 선언된 변수.
 * 		   반드시 초기화 되어야 한다.
 * 		   매개변수는 지역변수다.
 */

public class LocalVal_Ex_01 {
	static String grade2;
	public static void main(String[] args) {
		// args : 지역변수
		int num; //지역변수
		boolean b = true; //지역변수
		String grade;
		
		
		if(b) num = 100;     // 초기화를 해줘야한다. num =0;이라던가 if를 제외하고 num 값이라던가
		else  num = 999;	 // else를 포함해서 if-else내에서 선언해주던가 해야함.
		
		System.out.println(num);
	    int score = 80; //지역변수
	    
		switch(score/10) {
	    case 9 : grade = "A";break;
	    case 8 : grade = "B";break;
	    case 7 : grade = "C";break;
	    case 6 : grade = "D";break;
	    default : grade = "F"; // grade의 값을 default, 기본으로 한번 선언을 해줘야 에러가 안난다.
	    }					   // 마찬가지로 =null; 등으로 선언해줘야함
	    
		System.out.println("학점 : "+grade);
		
	}

}
