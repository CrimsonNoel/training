package ch16_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 * - 객체를 외부로 전송하는 스트림.
 * - 전송되는 객체는 반드시 Serializable 인터페이스를 구현해야 한다.
 *    java.io.NotSerializableException : 직렬화 대상 객체가 아님 
 * - 객체를 외부로 전송하는 기능을 직렬화라 한다.
 * - ObjectInputStream 을 이용하여 객체를 받을 수 있다.
 */
public class ObjectOutputStream_Ex_01 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("src/ch16_IO/object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20); // 객체 생성
		Customer c2 = new Customer("김삿갓", 30);
		oos.writeObject(c1); // c1 객체를 외부로 출력
		oos.writeObject(c2);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("고객1 : "+c1);
		System.out.println("고객2 : "+c2);
	}

}

class Customer implements Serializable{
	private String name;
	// transient : age 변수값은 직렬화 대산에서 제외시킴
	// ObjectInputStream_Ex_01 에서 age값이 0으로 나온
	transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [" + (name != null ? "name= " + name : "") + " age= "+age+"]";
	}
	
	
}