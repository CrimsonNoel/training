package ch12_API;

// String : (jdk 제공객체)은 equals(), hashCode()를 오버라이딩 함
public class HashCode_Ex_01 {

	public static void main(String[] args) {
		Value v1 = new Value("abc");
		Value v2 = new Value("abc");	
		System.out.println("v1.equals(v2)= "+v1.equals(v2));
		System.out.println("v1.hashCode()= "+v1.hashCode());
		System.out.println("v2.hashCode()= "+v2.hashCode());
		System.out.println("System.identityHashCode(v1)= "
							+System.identityHashCode(v1));
		System.out.println("System.identityHashCode(v2)= "
							+System.identityHashCode(v2));
	}}

class Value{
	String value;
	public Value(String value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value e = (Value)obj;
			return(value == e.value);
			// Equals_Ex_02에선 s1==s2 비교한게 다르다고 나오지만 여기서 value==e.value
			// 이값은 위 Value("리터럴"); 에서 리터럴로 값을 초기화하고 return에서 주소를 비교
			// 한 것이라고함. 이해??
		}
			return false;		}		
	@Override
	public int hashCode() {
		return value.hashCode();	}
	
}