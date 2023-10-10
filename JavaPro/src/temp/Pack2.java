package temp;
public class Pack2 {
	public void method() {   // 접근제어자 생략. 같은 패키지 내에서는 가능함.
							 // 다른 패키지에서는 붙여줘야한다.
		System.out.println("temp.Pack2.method() 호출하였음");
	}
}
