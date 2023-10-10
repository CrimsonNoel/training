package ch14_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Ex_04_ {
	public static void main(String[] args) {
			List<Person> li = new ArrayList<Person>();
			li.add(new Person("홍길동", 10));
			li.add(new Person("홍길동", 10));
			li.add(new Person("홍길동", 30));
			li.add(new Person("이정연", 10));
			li.add(new Person("김윤민", 16));
			Person p1 = new Person("김삿갓",20);
			li.add(p1);
			Print(li);
			System.out.println(li.indexOf(new Person("홍길동",10)));// -1; >> 0
			// indexOf() 는 equals()만 비교한다.
			System.out.println(li.indexOf(p1)); //5
			
			
	}
	public static void Print(List<Person> li) {
		for(Object ob : li) {
			System.out.println(ob);
		}		}}

class Person implements  Comparable<Person>{
	String name;	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
//		return (age-o.age);
		
		// 0==int, 0<int, 0>int
	}
	@Override  // 인스턴스 말고 값이 같으면 같은값으로 하고싶을때; indexof는 해쉬코드.인스턴스 말고 e
			   // quals로만 비교하는걸 이용한다. 
	
	public boolean equals(Object obj) {
		Person p = (Person) obj;
				
		return name.equals(p.name) && age==p.age;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}