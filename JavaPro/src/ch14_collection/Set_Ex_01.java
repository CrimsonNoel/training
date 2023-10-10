package ch14_collection;

import java.util.HashSet;
import java.util.Set;

/*
 * Set 인터페이스 : 중복 객체를 저장하지 않는다.
 * 	 구현 클래스 : HashSet.LinkedHashSet, TreeSet 이 있다.
 */
public class Set_Ex_01 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향",
						"향단이", "홍길동", "김삿갓"};   // String 객체는 equals와 인스턴스가 이미 재정의이 되어있다.
		Set<Object> set1 = new HashSet<Object>();  // 1과 "1"은 다른 객체(int와 Sting) 이므로 중복이 아니다.
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
			// Set 인터페이스 : 중복 객체를 저장하지 않는다.
		for(int i=0; i<arr.length; i++) { 
			if(!set1.add(arr[i])) {		 // set1에 arr를 하나씩 저장  // !set1 안들어가면 true,set2..set3... 들어가면 flase
				if(!set2.add(arr[i])) {	 // set1에 저장이 단되면 set2에 저장
					set3.add(arr[i]);	 // set2에 안되면 set3에 저장
				}			}		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
	}}

/* - HashSet

add, remove, clear, clone, ontains, isEmpty, iterator, size 메소드가 있다.

add메소드는 String 타입의 객체만 저장할 수 있다.

Map 구조와 달리 중복을 허용하지 않는 특징이 있다.

Set 클래스에는 HashSet, TreeSet, LinkedHashSet이 있는데 HashSet이 가장 성능이 좋다.

HashSet은 저장순서를 유지하지 않으므로 저장순서를 유지하려면 LinkedHashSet을 사용해야한다.
*/