package ch11_exception;
/*
 * throws : 예외처리 :  발생된 예외를 상위 method에 전달하기.
 * throw  : new 예외발생 :  예외 강제발생 
 */
public class Exception_Ex_04 {
	public static void main(String[] args) {
			try {
				throw new Exception("예외 강제 발생 ===========");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("예외 강제 발생 ===========");
			}
	}

}
