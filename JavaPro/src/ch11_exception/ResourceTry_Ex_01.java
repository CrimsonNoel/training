package ch11_exception;

public class ResourceTry_Ex_01 {

	public static void main(String[] args) {
		// jdk 1.7 이상 사용 가능
		
		try(AutoCloseableUse cr = new AutoCloseableUse()){
			System.out.println("process");
		}System.out.println();
	}}

class AutoCloseableUse implements AutoCloseable{
	
	public void close() {
		System.out.println("close()가 호출됨===");
	}
}




/*
 * 예외 발생 여부와 상관없이 사용했던 리소스 객체(데이터를 읽고 쓰는 객체들)의 close() 메소드를 호출해서 안전하게 리소스를 닫아줍니다.
사용하기 위해서는 리소스 객체는 java.lang.AutoCloseable 인터페이스를 구현하고 있어야 합니다.
AutoCloseable은 인터페이스이며 자바 7부터 지원합니다.
AutoCloseable에는 close() 메소드가 정의되어 있는데 try-with-resource는 AutoCloseable 구현체의 close() 메소드를 자동으로 호출합니다.
 */ 
