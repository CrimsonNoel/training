package ch14_collection;
/*
 /*
 * 객체의 중복을 논리적 판단하는 기준(동등객체)
 *  1. equals(Object) : 결과가 true
 *  2. hashCode()     : 결과가 동일
 *  두개의 메서드가 Object의 멤버 메서드임
 *  => equals 메서드를 오버라이딩   
 *  => hashcode() 메서드도 오버라이딩 
 *  => toString() 메서드 오버라이딩 
 *  
 *  String equals(), hashCode() 오버라이딩
 */

 
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Set_Ex_02 {

	public static void main(String[] args) {
			Set<Object> set = new HashSet<Object>();
			set.add(new String("abc"));
			set.add(new String("abc"));
			set.add(new Person2("홍길동", 10));
			set.add(new Person2("홍길동", 10));
			set.add(new Person2("홍길동", 30));
			set.add(new Person2("이정연", 10));
			set.add(new Person2("김윤민", 16));
			print(set);
			System.out.println("=======================");
			Person2 p1 = new Person2("김삿갓", 20);
			System.out.println("p1주소 "+p1);
			Person2 p2 = new Person2("김삿갓", 20);
			System.out.println("p2주소 "+p2);
//			p2 = p1; // 주소가 같아져서 중복객체가 된다
			System.out.println("변한p2주소 "+p2);
			System.out.println("=======================");
			set.add(p1);
			set.add(p2);
			print(set);
	}
			public static void print(Set li) {
				for(Object ob : li) {
					System.out.println(ob);
				}			}	}

class Person2 implements Comparable<Person2>{
	String name; int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;	}
	
	
	@Override
	public boolean equals(Object obj) {
		Person2 p = (Person2) obj;
		return name.equals(p.name)&&age == p.age;
	}
	
	@Override
	public int hashCode() {
		return (name.hashCode()+age); // String은 HashCode가 이미 오버라이딩 되어있기 떄문에
	}
	
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Person2 o) {
		return age-o.age;
	  //return (age-o.age)*-1;
	}

	
}