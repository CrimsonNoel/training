package ch15_lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
//import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Java API 함수적 인터페이스 예제 : Cunsumer 인터페이스
 * 매개변수가 있고, 리턴값은 없는 경우
 */
public class Lambda_Ex_06 {

	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println(t+8.0);
		c1.accept("Java");
		
		BiConsumer<String, String> c2 = (t, u) -> System.out.println(t+u);
		c2.accept("java", "8.0이후");
		
		DoubleConsumer c3 = d -> System.out.println("java"+d);
		c3.accept(8.0);
		
		ObjIntConsumer<String> c4 = (t, i) -> System.out.println(t+i+".0");
		c4.accept("java", 8);
		
	
		IntConsumer c5 = x ->{
			int sum = 0;
			for(int i=1; i<=x; i++) 
				sum+=i;
				System.out.println("1부터 "+ x+"까지의 합: "+sum);	};
			
		c5.accept(10); // 10까지의 합 출력
		c5.accept(100);// 100까지의 합 출력
		
}}
