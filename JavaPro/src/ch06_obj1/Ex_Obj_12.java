package ch06_obj1;

import java.util.Arrays;

/*
 * SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현하기
 * SutdaDeck 클래스
 * 1. 멤버변수
 *    SutdaCard 20장을 저장할 배열.
 * 2. 생성자
 *    SutdaCard 20장을 생성하여 배열에 저장하기
 * 3. 메서드
 *    (1) void shuffle() : 카드를 섞기.
 *    (2) SutdaCard pick(int index) : index 에 해당하는 카드 한장을 반환
 *    (3) SutdaCard pick() : 임의의 카드 한장을 반환 
 * SutdaCard 클래스
 *  1. 멤버변수 : int number,boolean isKwang
 *  2. 생성자 : this 생성자 이용하기
 *     - () : number=1, isKwang=true 인 객체 생성
 *     - (int, boolean) : 멤버변수에 값을 저장하기
 *  3. 메서드 
 *   void  info : number+iskwang?"K":"" 정보 출력하기      
 */
public class Ex_Obj_12 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		// 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10.
		System.out.println(deck);
		System.out.println("============================================");
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick(1));
	}}

class SutdaCard{
	int number;
	boolean isKwang;
	public SutdaCard(int number, boolean isKwang) {
		super();
		this.number = number;
		this.isKwang = isKwang;
	}

void info() {
	System.out.println(this);
}
@Override
public String toString() {
	return number+((isKwang)?"K":"");
}
}

class SutdaDeck{
	 
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {
		for(int i =0; i<cards.length; i++) {
			cards[i] = new SutdaCard((i%10+1),
					(i==0 || i==2 || i==7)?true:false);
		}
	}

	@Override
	public String toString() {
		String line = "";
		for(SutdaCard s : cards) {
			line += s+",";
		}
		return line;
	}
	
	void shuffle() {
		for(int i=0; i<=1000; i++) {
			int f = (int)(Math.random()*20);
			int t = (int)(Math.random()*20);
			SutdaCard temp =cards[f];
			cards[f] = cards[t];
			cards[t] = temp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int i=(int)(Math.random()*20);
		return cards[i];
	}
}








