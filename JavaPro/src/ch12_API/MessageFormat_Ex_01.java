package ch12_API;

import java.text.MessageFormat;

public class MessageFormat_Ex_01 {

	public static void main(String[] args) {
			String msg = "adress: {4} \nName: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
			
			Object[] arguments = {
					"이자바","02-123-1234","27","07-09","서울"
			};
	
	String result = MessageFormat.format(msg, arguments);
	System.out.println(result);
	System.out.printf("adress: %s , 이름: %s, 나이: %d, 생일: %.2f","서울","김자바",25,0.222222);

	
	}
}
//printf 
//s 문자 | d 정수 | f 실수;