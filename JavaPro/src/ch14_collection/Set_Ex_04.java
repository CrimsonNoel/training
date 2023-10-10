package ch14_collection;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

/*
 * 정렬 관련 인터페이스
 * Comparable 인터페이스 : 추상메서드 compareTo(Object)
 * 같은클래스에서 진행		클래스의 기본 정렬 방식 지정
 * Comparator 인터페이스 : 추상메서드 compare(Object o1,Object o2)
 * 외부클래스에서 가능		기본정렬 방식 대로 정렬하지 않고 사용자가 임의로 정렬 방식을 지정
 */
public class Set_Ex_04 {

	public static void main(String[] args) {
		System.out.println("나이순으로 출력");
		SortedSet<Person2> set = new TreeSet<>(); 
		// () 파라미터값 없으면 무조건 Comparable;
		set.add(new Person2("홍길동", 33));
		set.add(new Person2("김삿갓", 22));
		set.add(new Person2("이몽룡", 55));
		System.out.println(set);
		
		set = new TreeSet<>(new DescPerson2()); // 외부 클래스만들었다 그래도 파라미터값을 입력해야 Comparator가능
		
		/* 익명클래스 Comparator		
		set = new TreeSet<>(new Comparator<Person2>() {
			
			@Override
			public int compare(Person2 o1, Person2 o2) {
				return(o1.age-o2.age)*-1;
//				return o2.age-o1.age;  // 이거도 역순 정순*-1 도가능
			}		}); // List_Ex_06에서 외부클래스 Comparator 해놓은거 메인에 넣은식이다.
			
*/			
		System.out.println("나이의 역순으로 출력");
		set.add(new Person2("홍길동", 33));
		set.add(new Person2("김삿갓", 22));
		set.add(new Person2("이몽룡", 55));
		System.out.println(set);
		}}

class DescPerson2 implements Comparator<Person2>{

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return (o1.age-o2.age)*-1;
	}
	
}