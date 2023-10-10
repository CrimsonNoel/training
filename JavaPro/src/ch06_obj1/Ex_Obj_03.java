package ch06_obj1;
/*
 * class Card 만들기
 * 변수 :
 *   인스턴스 변수 : kind, number
 *   static 변수 : width, height
 * 메소드 : toString() : 자동완성시 static 변수는 추가하여야함.
 * 	Heart : 1(100,250)
 */
public class Ex_Obj_03 {
	public static void main(String[] args) {
		//1. card1 선언, 객체 생성하기
				Card card1 = new Card();
		//2. card1.kind = "heart",number=1로 초기화하기
				card1.kind = "heart";	card1.number=1;
		//3. card1 출력하기
				System.out.println(card1.toString());
		//4. card2 객체 생성하기
				Card card2 = new Card();
		//5. card2.kind = "spade", number = 1로 초기화하기
				card2.kind = "spade";	card2.number=1;
		//6. card2 출력하기
				System.out.println(card2);
				
			System.out.println("--------------------------------------");
		//7. card의 static 가로와 세로를(50,60)으로 변경하기
				Card.width = 50;	Card.height = 80;
		//8. card1 출력하기
				System.out.println(card1);
		//9. card2 출력하기
				System.out.println(card2);
		
	}}
class Card{
	String kind;
	int number;
	static int width, height;
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "](w"+width+",h"+height+")";
	}
	
}

