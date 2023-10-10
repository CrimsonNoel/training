package ch11_exception;
/*
 * 예외처리
 * try 블랙 : 예외가 발생할 가능성이 있는 문장들.
 * 			예외가 발생한 경우 제어catch블럭으로 이동.
 * catch블럭 : 예외가 발생하면 호출되는 블럭 
 * 			 예외가 발생하면, 예외는 잡고, 정상적으로 실행을 함.
 * 			 try 블럭과 함께 사용 해야함. 	
 */
public class Exception_Ex_01 {
	public static void main(String[] args) {
		try {
			System.out.println(2);
			System.out.println(1/0);// ArithmeticException 예외 발생
			System.out.println(3);
			System.out.println(4);
		}catch(ArithmeticException e) {
		System.out.println("0으로 나누지 마세요");
		return;
		}
		System.out.println(5);
		
		}	}
