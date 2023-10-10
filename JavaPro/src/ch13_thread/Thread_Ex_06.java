package ch13_thread;
/*
 * 동기화 영역
 * 		동기화 메서드 예제
 * 		=> 공유객체의 메서드여야 함.
 * 		=> 공유객체 : 모든 스레드가 하나의 객체를 공유하고 있어야 한다.
 */
public class Thread_Ex_06 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		Thread t1 = new PrintThread3(ptr,'A');
		Thread t2 = new PrintThread3(ptr,'B');
		Thread t3 = new PrintThread3(ptr,'C');
		t1.start(); t2.start(); t3.start();
	}}

class Printer{
	public synchronized void printChar(char ch) { // 동기화 메서드
		for(int i=0; i<80; i++) {
			System.out.print(ch);
		}		System.out.println();		}}

class PrintThread3 extends Thread{
	Printer ptr;		char ch;
	PrintThread3(Printer ptr, char ch){
		this.ptr = ptr;		this.ch = ch;	}
	public void run() {
		for(int i=0; i<20; i++) {
			ptr.printChar(ch);
		}	}}
