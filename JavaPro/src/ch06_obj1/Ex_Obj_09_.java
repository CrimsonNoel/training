package ch06_obj1;

public class Ex_Obj_09_ {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육",13900);
		//메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook};
		Order order = new Order(123, menuArr);
		
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

class Menu{
	int price;
	String name;
	public Menu(String name,int price) {
		super();
		this.price = price;
		this.name = name;
	}
	}
class Order{
	int OrderNum;
	Menu[] menus;
	public Order(int orderNum, Menu[] menus) {
		super();
		OrderNum = orderNum;
		this.menus = menus;
	}
int totalPrice() {
	int sum=0;
	for(Menu m: menus) {
		sum+=m.price;
	}
	return sum;
}}
