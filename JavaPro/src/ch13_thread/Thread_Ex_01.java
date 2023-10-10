package ch13_thread;
/*
 * start() 기능
 * 1. 스택영역을 병렬화 함.
 * 2. 자신의 스택 영역에 run()메서드 호출
 */
public class Thread_Ex_01 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First"); // new상태
		Thread1 t2 = new Thread1("Second"); // new상태
		t1.start(); //Runnable 상태	  //t1.join() t1.start/ join try-catch문 / t2.start
		t2.start(); //Runnable 상태		위처럼 작성하면 t1이 끝나야 t2가 실행된다 join();
		// t1.run(); t2.run();
		System.out.println("main 스레드 종료");
	}}

class Thread1 extends Thread{ // 스레드 상속받아서 객체만들고 스레드 실행하는 방법
	Thread1(String name){		super(name);		}
	@Override 
	public void run() { // Running 상태
		for(int i = 0; i<5; i++) {
			System.out.println(i+ "=" + getName());
			try {
				
				sleep(1000); // 1000밀리초 = 1초 대기, 대기상태
			} catch (InterruptedException e) {	}
		}
	}}