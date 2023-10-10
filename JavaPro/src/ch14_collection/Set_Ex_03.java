package ch14_collection;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 예제
 * 		Set > SorteSet Interface
 * 		Set : 중복불가 : 동등객체
 * 		SorteSet : 정렬됨
 * 
 * 		=> 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스
 * 		   TreeSet에 요소로 저장 가능
 * 
 * 	정렬 관련 인터페이스
 * 		- Comparator : 기본 정렬 방식을 추가로 변경할때 사용.
 * 		- Comparable : 기본 정렬 방식 지정할때 사용.
 */
public class Set_Ex_03 {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		// 대문자 > 소문자 순으로 정렬. ABC..abc..;
		String from = "bat";		String to = "d";
		set.add("abc");	set.add("ailen");	set.add("bat");	set.add("azz");
		set.add("car");	set.add("Car"); set.add("disc");	set.add("dance");
		System.out.println(set);
		System.out.println("from: "+from+" ,to: "+to); 
		// subset쓸려면 set을 상속받는 SortedSet 사용.
		System.out.println(set.subSet(from,to)); // 정렬되어야 함.
		System.out.println("from: "+from+" ,to: "+to+"zzzz");
		System.out.println(set.subSet(from,to+"zzzz"));
	}}

