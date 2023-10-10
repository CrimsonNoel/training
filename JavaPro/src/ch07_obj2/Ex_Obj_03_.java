package ch07_obj2;
/*
 * Buyer 클래스 :
 * 멤버변수 : int money = 500, int point = 0;
 * 			Product[] cart = new Product[3]; 물건 3개 구매가능
 * 			int cnt;
 * 멤버메서드 : buy
 * 				p상품의 가격만큼 money 차감.
 * 				p상품의 포인트 만큼 point 증가
 * 				cart에 제품 추가
 */
public class Ex_Obj_03_ {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv(100);
		Computer com = new Computer(200); 
		SmartPhone sp = new SmartPhone(150);
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("구매후 잔액: "+b.money);
		System.out.println("구매후 적립 포인트: "+b.point);
		System.out.println("===============================");
		for(int i = 0; i<b.cart.length; i++) {
			System.out.println(b.cart[i]);
		}
		
	}}

class Buyer {              // 상속 받아서 해도 된다. 생략 가능한부분?
	
	int money = 500;
	int point = 0;
	Product[] cart = new Product[3];
	int cnt;
	
	void buy(Product p) {  // Ex_Obj_02에 있는 Product를 상속 받아 주소를 만들어 값을 가진다.?
		money -= p.price;
		point += p.price/10;
		cart[cnt++] = p;   // Product p
	}
}