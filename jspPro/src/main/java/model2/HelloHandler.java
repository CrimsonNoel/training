package model2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("HelloHandler====");
		req.setAttribute("result", "HelloHandler  안녕=====fdfdf");
		return "/view/simpleView.jsp";
	}
	
	
}
