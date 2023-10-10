package login;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kic.mskim.MsInterceptor;

public class LoginAdmin implements MsInterceptor {

	@Override
	public String loginCheck(HttpServletRequest request, HttpServletResponse response) {
		
			System.out.println("admin");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		
		String login = (String)session.getAttribute("id");
		request.setAttribute("msg", "접근 불가 입니다");
		request.setAttribute("url", "/member/loginForm");
		if(login == null || !login.equals("admin")){ // login.ok
		
			return "alert";
		
		}else {
			return null;
		}
	
}
}