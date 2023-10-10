package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinFormHandler implements  CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		System.out.println("JoinFormHandler====");
		request.setAttribute("result", "JoinFormHandler 안녕======fdfdfd");
		return "/view/simpleView.jsp";
	}

}
