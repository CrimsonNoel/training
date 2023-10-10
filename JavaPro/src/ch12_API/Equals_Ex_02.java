package ch12_API;
// String 객체는 equals(), hashcode()메소드를 재정의 하였슴.
public class Equals_Ex_02 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10); 
		Equal e2 = new Equal(10);
		
		String s1 = new String("abc"); // 주소가 다름.
		String s2 = new String("abc"); // String은 equals가 overriding 되어있다
		if(s1==s2) { 				   // 따로 정의 안해도 equals가 적용된다.
			System.out.println("s1과 s2는 같은 객체임");
		}else {
			System.out.println("s1과 s2는 다른 객체임");
		}
		if(s1.equals(s2)) { 
			System.out.println("s1과 s2는 같은 내용의 객체임");
		}else {
			System.out.println("s1과 s2는 다른 내용의 객체임");
		}
		//Ex_01에서  Equal의 hashcode를 override해서 value값으로 
		// 리턴해서 동일한 값으로 만들었다
		System.out.println("e1.hashCode()= "+e1.hashCode()); 
		System.out.println("e2.hashCode()= "+e2.hashCode());
		System.out.println("s1.hashCode()= "+s1.hashCode());
		System.out.println("s2.hashCode()= "+s2.hashCode());
	}}
