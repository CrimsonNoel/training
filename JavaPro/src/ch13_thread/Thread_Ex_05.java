package ch13_thread;
// 동기화 되지 않은 경우
/*
 * 동기화 synchronized 예약어 표현
 * 	동기화 블럭 : ThreadEx5.java
 * 			  lock 객체를 소유한 스레드만 동기화 영역을 실행
 * 			  lock 은 object 객체여야 한다. 객체여야함
 * 			  기본자료형은 lock으로 사용할 수 없다.
 *			  모든 스레드가 공유하는 공유 객체여야 함
 */
public class Thread_Ex_05 {
	public static void main(String[] args) {
		Thread t1 = new PrintThread('A');
		Thread t2 = new PrintThread('B');
		Thread t3 = new PrintThread('C');
		t1.start(); t2.start(); t3.start();
	}}

class PrintThread extends Thread{
	char ch;
	PrintThread(char ch){		this.ch=ch;		}
	static int [] lock = new int[3];   //  기본형X 참조형만 가능함.
	//static List lock = new ArrayList();
	//static int lock;	//참조형
	//static String lock = "aaa";
	
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock){  // synchronized 가 없으면 결과값이 뒤섞인다. 스레드 정리??
				for(int j=0; j<80; j++) {
					System.out.print(ch);
			}
			System.out.println();		}}	}}

