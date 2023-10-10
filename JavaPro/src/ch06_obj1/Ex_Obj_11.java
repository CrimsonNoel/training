package ch06_obj1;
public class Ex_Obj_11 {
	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45",10000);
		Account b = new Account("567-89",10000);
		
		// 송금: 3천원씩 a계좌에서 -> b계좌로!
		boolean result = true;
		while(result) {
			result = a.transfer(b,3000);
		}
		System.out.println("====================");
		// 결과 출력
		System.out.println(a); // num :balance print
		System.out.println(b);
		
	}}

class Account{
	String AccountName;
	int balance;
	public Account(String accountName, int balance) {
		super();
		AccountName = accountName;
		this.balance = balance;
	}
	
	// a.transfer의 balance = a의 balance
	// Account b를 불러왔기 때문에 b.balance b의balance 가능
	boolean transfer(Account b,int amount) {
		if(balance<amount) {
			System.out.println("잔액이 부족합니다");
			return false;		}
		balance -= amount;
		b.balance += amount;
		System.out.println(this);  // 나(class Account)를 지칭하는 
								   // 대표 변수
			return true;
		// true; 일떄는 계	속돌고 false; 일때 끝난다.
			
	}
	@Override
	public String toString() {
		return "Account [AccountName=" + AccountName + ", balance=" + balance + "]";
	}
	
	
}
