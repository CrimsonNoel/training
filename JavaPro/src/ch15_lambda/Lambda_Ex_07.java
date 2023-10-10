package ch15_lambda;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
/*
 * Supplier 인터페이스 예제 
 * 매개변수는 없고, 리턴값은 존재
 */
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public class Lambda_Ex_07 {

	public static void main(String[] args) {
		Supplier<String> s1 = () ->{
			return "Java";
		};
		System.out.println(s1.get()); //여긴 get()이다
		
		Supplier<String> s2 = ()->"Java";
		System.out.println(s2.get());
		
		IntSupplier s3 = ()->{
		int num = (int)(Math.random()*6)+1;
		return num; };
		System.out.println(s3.getAsInt());
		
		IntSupplier s4 = ()-> (int)(Math.random()*6)+1;
		System.out.println("주사위: "+s4.getAsInt());
	
		DoubleSupplier s5 = ()->{
		double d = Math.random();
		return d; };
		System.out.println("임의의 실수 : "+s5.getAsDouble());
	
		DoubleSupplier s6 = ()-> Math.random();
		System.out.println("임의의 실수 : "+s6.getAsDouble());
	}

}
