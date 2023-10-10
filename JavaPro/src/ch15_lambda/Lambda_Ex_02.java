package ch15_lambda;
// Runnable 인터페이스 이용하여람다식으로 스레드 생성하기
class Aaa implements Runnable{
	@Override
	public void run() {
	
	}}

public class Lambda_Ex_02 {
	public static void main(String[] args) {
			System.out.println("main 시작");
			Runnable r = () ->{
				int sum=0;
				for(int i=1;i<=100;i++) {
					sum+=i;				}
				System.out.println("1부터 100까지의 합: "+sum);	};
				
			Thread t = new Thread(r);	
			
			Thread t2 = new Thread(()->{
				int sum=0;
				for(int i=1; i<=100;i++) {
					sum+=i;
				}
				System.out.println("********1부터 100까지의 합2: " + sum);
			});
			t.start();  t2.start(); System.out.println("main 종료");
		
	}

}
