package ch13_thread;
public class Thread_Ex_07 {
	public static void main(String[] args) {
			ATM atm = new ATM();
			Thread son = new Thread(atm,"아들");
			Thread doughter = new Thread(atm,"딸");
			son.start();
			doughter.start();	}}

class ATM implements Runnable{
	private int money=100000;
	public void run(){
		while(true) {
			try {
				Thread.sleep(1000);
//				Thread.sleep(1);
			} catch (InterruptedException e) {		}
			if(money <= 0) break;
			withdraw();
		}}
	synchronized void withdraw() {
		if(money <=0) return;
		money -=10000;
		System.out.println(Thread.currentThread().getName()+ "10000원 출금. 잔액 : "
				+money);		}
}