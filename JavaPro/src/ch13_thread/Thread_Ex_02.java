package ch13_thread;
public class Thread_Ex_02 { // Runnable 이용하는 스레드 절차
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable r = new Runnable1(); // 스레드 객체 아님
		Thread t1 = new Thread(r,"First"); // new상태
		Thread t2 = new Thread(r,"Second"); // new상태
		Thread t3 = new Thread(r); // new상태
		Thread t4 = new Thread(r); // new상태
		t1.start();	t2.start(); t3.start(); t4.start();
		// start 메서드 작동시 run()메서드가 실행된다.
		System.out.println("main 스레드 종료");
	}}

class Runnable1 implements Runnable{
	// Runnale 인터페이스의 구현 클래스. Thread 클래스 아님.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			// Thread.currentThread().getName() " 현재 실행 중인 스레드의 이름.
			System.out.println(i+ "="+ Thread.currentThread().getName());
			try{Thread.sleep(10);
			}catch(InterruptedException e) {}	}	}}
