package ch12_API;
public class HashCode_Ex_02 {
	public static void main(String[] args) {
		String s1 = new String("str");
		String s2 = new String("str");
		String s3 = "aaa";
		String s4 = "aaa";
		System.out.println(s3==s4);
		System.out.println(s1==s2);
		System.out.println("-----------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 객체 진짜 해쉬값 :"
							+System.identityHashCode(s1));
		System.out.println("s1 객체 진짜 해쉬값 :"
							+System.identityHashCode(s2));
		
	}

}
