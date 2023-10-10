package ch13_thread;
public class Thread_Ex_04 {
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true); // 데몬스레드로 설정. New상태에서만 설정이 가능함
		t2.setDaemon(true); // 데몬스레드로 설정.
		
		t1.start();  t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
		
	}}

class DaemonThread extends Thread{
	public void run() {
		while(true) {		// main이 끝날떄까지 계속 실행한다.
			System.out.println(getName());// 기본이름 설정: Thread-n
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
			
		}
	}
}
