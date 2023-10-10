package ch11_exception;

import java.util.Scanner;

/*
 * 나만의 예외를 만들기
 */
public class Exception_Ex_08 {
	public static void main(String[] args) {
			try {
				String id = "hong";
				String pw = "1234";
				Scanner scan = new Scanner(System.in);
				System.out.println("아이디를 입력하세요.");
				String inputId = scan.nextLine();
				System.out.println("비밀번호를 입력하세요.");
				String inputPw = scan.nextLine();
			   if(id.equals(inputId)&&pw.equals(inputPw)) {
				   System.out.println("로그인 성공");
			   }else if(!id.equals(inputId)) {
				   throw new LoginFailException("아이디가 틀립니다. 다시 로그인 하세요.");
			   }else {
				   throw new LoginFailException("비밀번호가 틀립니다. 다시 로그인 하세요.");
			   }
				
			}catch(LoginFailException e) {
				System.out.println("========== : "+e.getMessage() );
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}}

class LoginFailException extends Exception{  // 
	String msg;
	LoginFailException(String msg){this.msg=msg;}
	@Override
	public String getMessage() {return msg;}	}