package ch12_API;
/*
 * Object클래스
 * equals 메서드 예제	: 동등을 정의 하는 메서드 => 오버라이딩 필요.
 * => 같은 객체인지 여부는 == (instance)로 구분가능함
 */
public class Equals_Ex_01 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10); // 100
		Equal e2 = new Equal(100); // 200
		e1=e2; //e1주소가 e2로 같아진다.
		if(e1==e2) { // 주소가 다름. flase
			System.out.println("e1과 e2는 같은 객체임");
		}else {
			System.out.println("e1과 e2는 다른 객체임");
		}
		// Equal 클래스에는 equals라는 클래스가없는데 최상위클래스 Object가 가지고있어서 사용가능하다
		if(e1.equals(e2)) { // value == e.value value같음:true
			System.out.println("e1과 e2는 같은 내용의 객체임");
		}else {
			System.out.println("e1과 e2는 다른 내용의 객체임");
		}
	
	}}

class Equal {
	int value;
	Equal(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) { // obj 안에 equals가 잇어서 obj로 변수를 잡아도 에러는 안나지만
		if(obj instanceof Equal) {      // value 값이 obj에 없기 때문에 캐스팅을 통해 Equal을 사용한다.
			Equal e = (Equal) obj;
			return (value == e.value);		} // true;
			return false;	}				  // false; 값도 정의해주자.아니면 error;
	
	@Override
	public int hashCode() {
		return value;	}

}


