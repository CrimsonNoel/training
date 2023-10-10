package ch06_obj1;

public class Ex_Obj_09 {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu1 jjajang = new Menu1("짜장", 4900);
		Menu1 jjambbong = new Menu1("짬뽕", 5900);
		Menu1 tangsook = new Menu1("탕수육",13900);
		//메뉴를 조합하여 주문을 생성
		Menu1[] menuArr = { jjajang, jjambbong, tangsook};
		Order1 order = new Order1(123, menuArr);
		
		//주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
	}}
/*
 * Menu class 
 * 변수 : name : Menu이름, price:가격
 * Order class
 * 변수
 * OrderNum : 주문번호
 * Menu[] Menus; 메뉴 배열
 * 메소드
 * totalPrice
 * 
 */

class Menu1{
	String name;
	int price;
	public Menu1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
class Order1{
	int ordernum;
	Menu1[] menuArr;
	public Order1(int ordernum, Menu1[] menuArr) {
		super();
		this.ordernum = ordernum;
		this.menuArr = menuArr;
	}
	int totalPrice() {
		int sum=0;
		for(int i=0; i<this.menuArr.length;i++) {
			sum+=menuArr[i].price;
		}
		return sum;
	}
	
}