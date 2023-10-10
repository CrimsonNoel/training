package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * <Integer> : 제네릭표현 List<Integer>"
 * Integer 객체를 리스트에 저장함
 * ArrayList : 가변배열. 저장할 갯수를 몰라도 객체를 저장. 첨자 사용가능
 */
public class List_Ex_01_ {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
	// List.subList(1,4) : list 객체의 1번 인덱스 부터 3번 인덱스 까지 부분리스트로 리턴	
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		// list2를 정렬
		// Collections : Collection 프레임 워크에 관련된 추가 기능을 멤버로 가진 클래스
		Collections.sort(list2); // list2 List 객체를 정렬.
		// > 사용할려는 메서드가 반드시 구현.Comparable블 되어잇어야함 안되면 에러

		System.out.println(list2);
		
	}

}
