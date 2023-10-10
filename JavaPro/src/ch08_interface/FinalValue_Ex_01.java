package ch08_interface;
/*
 * final 변수 : 변경 불가 변수. 상수
 * final 변수도 생성자에서 한번은 값을 설정 할 수 있다.
 * 단 명시적으로 초기화 되지 않은 경우에만 가능하다.
 * 상수는 final 제어자로 표현함.
 */
class FinalValue{
	final int NUM; //1.명시적 초기화
	{		 //NUM=300;
			//2. 초기화 블럭
	}
	
	FinalValue(int num){
		//NUM = num;	// 3.생성자에서 변경 한번 가능함.
		NUM=200;	}
	}



public class FinalValue_Ex_01 {

	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(100);
		// f1.NUM = 200; 	// NUM은 상수
	}

}
