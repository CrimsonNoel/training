package ch05_array;

public class Array_Ex_05 {
/*
 * main mehtod에 파라미터를 입력,전송해서 실행하기
 * 배열이용?.. 
 */
	public static void main(String[] args) {  // 우클릭 Run As > Run configurations
		System.out.println(args.length);	  // Argument 작성후 apply
		if(args.length==0) {
			System.out.println("커트라인에 파라미터를 입력하세요");
			System.out.println("java ch05_array.ArrayEx05 홍길동 김삿갓");
			return;
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
		
		
	}

}
