package ch11_exception;
/*
 * throws 예외 처리
 * throws Exception를 처리한 메소드는 콜한 메소드에서 처리하여야함
 * 단 RuntaimeException은 처리 하지 않아도 됨
 */
public class Exception_Ex_05 {

	public static void main(String[] args) {
		try {
			first();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main"); 	}
private static void first() throws Exception{
	second();
	System.out.println("===============1");
	System.out.println("first");		}
	
private static void second() throws RuntimeException{
	System.out.println("second 메서드");
	// NumberFormatException 예외 발생
	System.out.println(Integer.parseInt("1")); //  abc... 문자열 입력시 에러
}
	
	
}
