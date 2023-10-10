package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class List_Ex_06_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li );
		System.out.println("==================");
		Collections.sort(li, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o1.age-o2.age);
			}
			
			
			
		});  
		
		print(li );
		
	}
	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}
	}
}

class  OrderPerson  implements   Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return (o1.age-o2.age) * -1;
	}
	
} // 익명클래스 가능.

// 외부 클래스 제외시키고
//	Collections.sort(li, new OrderPerson(){
//		@Override
//		public int compare(Person o1, Person o2) {
//		return(o1.age-o2.age)*-1;}
// 가능
