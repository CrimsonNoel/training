package model2;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControlerDo
 */
//url 패턴
//@WebServlet("*.naver") //확장자 방식
//@WebServlet("/member/*")  // 패스방식

@WebServlet(urlPatterns= {"/member/*"},
initParams= {@WebInitParam(name="configFile",value="/WEB-INF/commandDoHandler.properties")})

public class ControllerDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Map<String, CommandHandler> commandHandlerMap = 
	    		new HashMap<>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerDo() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	        String configFile = getInitParameter("configFile");
	        Properties prop = new Properties();
	        String configFilePath = getServletContext().getRealPath(configFile);
	       System.out.println(configFilePath);
	        try (FileReader fis = new FileReader(configFilePath)) {
	            prop.load(fis);  // key(String) :value(String)
	            System.out.println(prop);
	        } catch (IOException e) {
	            throw new ServletException(e);
	        }
	        //===============================
	        Iterator keyIter = prop.keySet().iterator();
	        while (keyIter.hasNext()) {
	            String command = (String) keyIter.next();
	            String handlerClassName = prop.getProperty(command);
	            try {
	                Class<?> handlerClass = Class.forName(handlerClassName);
	                CommandHandler handlerInstance = 
	                        (CommandHandler) handlerClass.newInstance();
	                
	                commandHandlerMap.put(command, handlerInstance);
	            } catch (ClassNotFoundException | InstantiationException 
	            		| IllegalAccessException e) {
	                throw new ServletException(e);
	            }
	        }
	        
	        System.out.println(commandHandlerMap);
	       
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ok");
		String command = request.getRequestURI();
		System.out.println("1:"+command);
		// 확장자 or path 방식이 있다.
		// @WebServlet("*.naver") => 확장자 방식 URL이 .naver면 naver의 서블릿을 실행하라.  '/' 가 있으면 안됨. 끝자리만 확인해서 
		// 							naver 면 실행한다.
		// @WevServlet("/naver/*") => path방식 마찬가지. '/' 가 무조건 있어야한다.
		// -> 상대경로(/를 안넣으면 계속 컨트롤러로 돌아가서 에러가난다.) 절대경로(프로젝트명이 들어간다. /를 넣어야 절대경로가 되며 패스형식으로 실행된다.)
		// request.getContextPath() = project name이다
		if(command.indexOf(request.getContextPath())==0){
			command = command.substring(request.getContextPath().length());
		}
		
		System.out.println("2:"+command);
		// CommandHandler c = new HelloHandler(); 이걸 밑에 한줄만 바꿔서 저장된 맵에따라 로드되는 객체변경가능
		// 그냥 실행시키면 에러창뜸 /member/* 뒤 *대신 프로퍼티에 저장된값 입력. hello나 joinForm입력한다.
		CommandHandler c = commandHandlerMap.get(command); // Student s 객체 대체한다.
					String viewName = c.process(request, response);
		
			//		System.out.println(request.getParameterNames());
		// ---------------------------------------외부의 class에 있는 method에서 작동하게한다
//			Student s = new Student("김자바", 30);
//			request.setAttribute("student", s);
//			String viewName = "/index.jsp";
		//-------------------------------------------------		
			RequestDispatcher dispatcher
				=request.getRequestDispatcher(viewName); // 절대경로 wabapp
			try {
			dispatcher.forward(request, response);
			}catch(ServletException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
		
}



class Student {
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	
}









