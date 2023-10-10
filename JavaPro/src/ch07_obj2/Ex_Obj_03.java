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
public class Ex_Obj_03 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		Tv2 tv = new Tv2(100);
		Computer2 com = new Computer2(200); 
		SmartPhone2 sp = new SmartPhone2(150);
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("구매후 잔액: "+b.money);
		System.out.println("구매후 적s립 포인트: "+b.point);
		System.out.println("===============================");
		for(int i = 0; i<b.cart.length; i++) {
			System.out.println(b.cart[i]);
		}		
	}}
class Buyer1{
	int money = 500;			int point = 0;
	Product1[] cart = new Product1[3];
	int cnt; 
	void buy(Product1 p) {
		money -= p.price;
		point += p.price/10;
		cart[cnt++]=p;
	}}
