package ch12_API;


public class String_Ex_03 {

	public static void main(String[] args) {
			String s = "HTML-CSS-JavaScript-Java-JSP-스프링";
			String[] subject = s.split("-");
			for(int i = 0; i< subject.length; i++) {
				System.out.println((i + 1)+ ":"+subject[i]);
			}
			s = "홍길동,김삿갓,이몽룡,성춘향,임꺽정";
			String[] names = s.split(",");
			for(String n : names) {
				System.out.println(n);
			}
			System.out.println("전체 이름: "+ names.length + "명");
 		    // 숫자 <= 문자열
			
			int i = Integer.parseInt("100");
			System.out.println(i + 1); // 101
			double d = Double.parseDouble("100.5");
			System.out.println(d + 0.1); // 100.6
			System.out.println(++d); // 101.5
			//문자열을 Format 형태로 출력하기
			String sf = String.format("%.2f",d+0.125); // 101.63
			System.out.println(sf);
			sf = String.format("%10d", i);
			System.out.println(sf);
			sf = String.format("16진수 : %x", i);
			System.out.println(sf);
			sf = String.format("8진수 : %o", i);
			System.out.println(sf);
	}}
