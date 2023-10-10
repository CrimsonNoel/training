package ch08_interface;
public class Complexer_Ex_01 {
	public static void main(String[] args) {
			Complexer com = new Complexer();
	      // com.INK = 200; //상수
			com.ink=Printerable1.INK;
	      System.out.println("기본 잉크량:" + Printerable1.INK);
	      System.out.println("FAX 번호:" + Complexerable.FAX_NO);
	      com.print();   com.scan();   com.receive("02-5678");   com.send("02-5678");
	      System.out.println("=============================");
	      if (com instanceof Complexer) {
	         System.out.println("====com 참조변수의 객체는 Complexer 입니다");      }
	      if (com instanceof Printerable1) {
	         System.out.println("====com 참조변수의 객체는 Printerable 입니다");
	         com.print();   }
	      if (com instanceof Scannerable) {
	         System.out.println("====com 참조변수의 객체는 Scannerable 입니다");
	         com.scan();         }
	      if (com instanceof Faxable) {
	         System.out.println("====com 참조변수의 객체는 Faxable 입니다");
	         com.receive("02-5678");      com.send("02-5678");   }  
	         }}

interface Printerable1{
	// public static final 젱자 생략
	int INK = 100; // 상수
	// public abstract 제어자 생략
	void print(); }
interface Scannerable{		void scan();		}

interface Faxable{
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);	}

interface Complexerable extends Printerable1, Scannerable, Faxable{}

class Complexer implements Complexerable{
	int ink;
	@Override
	public void print() {System.out.println("종이에 출력합니다. 남은 잉크량: "+--ink);	}
	@Override
	public void scan() {System.out.println("이미지를 스캔합니다.");}
	@Override
	public void send(String tel) {System.out.println(tel+"에서 "+FAX_NO+"로 FAX를 수신");}
	@Override
	public void receive(String tel) {
		System.out.println(FAX_NO+"에서 "+tel+"번호를 FAX를 전송");	}
	}

