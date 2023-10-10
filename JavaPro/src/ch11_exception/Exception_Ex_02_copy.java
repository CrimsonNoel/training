package ch11_exception;
public class Exception_Ex_02_copy {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 예외 발생
//			System.out.println(args[0]);  // 1) 입력안함
			//NumberFormatException 예외 발생
			System.out.println(Integer.parseInt("1"));
//			System.out.println(10/Integer.parseInt("0"));
//			String str = null;
//			System.out.println(str.charAt(0));
			//NullPointerException
		}
		catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("관리자에게 문의하세요");		}
		
		}} //  에러나면 Exception 내에있는 에러 이유를 콘솔창에 찍어준다.
		   //  결국 Exception 상속이 이뤄지며 Exception 하나로 커버가 될수도있다.