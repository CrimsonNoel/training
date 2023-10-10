package ch14_collection;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 :Collection 프레임 워크 이전에 사용되던 클래스
 * 			   List 의 구현 클래스
 * list.addElement(5.0); // Vector의 추가기능 메서드, add와 같은 기능
 */
public class List_Ex_02_ {

	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
		// list.addElemint(5.0);  // Vector 추가기능 메서드. add와 같은 기능
		list.add(5.0);
		
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("1: "+list);
		double num = 5.0;
		double num1	= 4.0;
		int index = list.indexOf(num);
		if(index>=0) {
			System.out.println(num+"의 위치: "+index);
		}else {
			System.out.println(num+"은 list에 없습니다.");
		}
		
		num = 0.3;
		System.out.println(list.indexOf(num)); // num(값0.3)의 위치
		System.out.println(list.indexOf(5.0)); // 값 5.0의 위치
		if(list.contains(num)) { // list의 요소중 0.3인 데이터가 있는가?
			list.remove(num); // 삭제 or list.removeElement(num);
			System.out.println(num+" - 삭제됨");
		}
		System.out.println("2: "+list);
		System.out.println(list.indexOf(num)); // -1
		System.out.println(list.indexOf(5.0)); // 1
		System.out.println(list);
	
	
	
	}}
