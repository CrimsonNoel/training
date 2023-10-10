package ch03_op;

public class Op_Ex_11 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char)(c1+1); // (c1+1)만 넣으면 char+int기 떄문에 int가된다 a=97 +1 = 98 : b가나옴.
								//int 이하의 값이 int를 만나면 int가 된다  
		int i = (c1+1);
		char c3 = 'a'+1;
		int i1 = 100;
		byte b = 100;
		
		System.out.println(c2);
		System.out.println(c2+":"+(int)c2);
	}

}
