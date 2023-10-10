package controller;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.List;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import board.Board;
import board.BoardMybatis;
import board.Comment;
import kic.mskim.MskimRequestMapping;
import kic.mskim.RequestMapping;

@WebServlet(urlPatterns={"/board/*"}, // path방식 
initParams = {@WebInitParam(name="view", value="/view/board/"),
			  @WebInitParam(name="login", value="login")} )//package

public class BoardController extends MskimRequestMapping{

	
	 @RequestMapping("index") // /board/index
	public String index(HttpServletRequest request, HttpServletResponse reponse) {
			request.setAttribute("index", "board 입니다");
		
		return "index";
	}

	 @RequestMapping("boardInfoForm")
	 public String boardInfoForm(HttpServletRequest request, HttpServletResponse response) {
		
		 return "boardInfoForm";
	 }
	
	 
	 
@RequestMapping("boardInfoPro")
public String boardInfoPro(HttpServletRequest request, HttpServletResponse response) {
	String path = request.getServletContext().getRealPath("/")
		 	  +"view/board/images";
	String filename = "";
	String msg="게시물 등록 실패";
	String url="/board/boardInfoForm";
	String boardid = (String) request.getSession().getAttribute("boardid");
	if(boardid == null)
		boardid = "1";
	
	try {
		 MultipartRequest multi = new MultipartRequest(request, path,10*1024*1024,"UTF-8");
				 
		filename = multi.getFilesystemName("file1");
		Board board = new Board();
		
		board.setBoardid(boardid);
		board.setName(multi.getParameter("name"));
		board.setPass(multi.getParameter("pass"));
		board.setSubject(multi.getParameter("subject"));
		board.setContent(multi.getParameter("content"));
		
		if(filename==null) {filename="";}
		board.setFile1(filename);
//		System.out.println(board);
		BoardMybatis bd = new BoardMybatis();
		int num = bd.insertBoard(board);
		System.out.println(num+"저장");
		
		if(num>0) {
			msg ="게시물 등록 성공";
			url ="/board/boardList";
		}
	 } catch (IOException e) {
		e.printStackTrace();
	}

    request.setAttribute("filename", filename);
	request.setAttribute("msg", filename+msg);
	request.setAttribute("url", url);
	
	return "alert";
}

	@RequestMapping("boardList")
	public String boardList(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();

		if(request.getParameter("boardid")!=null) {
			session.setAttribute("boardid", request.getParameter("boardid"));
			session.setAttribute("pageNum", "1"); // boardid = 게시판종류 , 게시판 종류가 바뀔때 page가 1로돌아간다.
		}
		String boardid = (String) session.getAttribute("boardid");
		System.out.println(boardid);
		if(boardid == null)
			boardid = "1";
		
		if(request.getParameter("pageNum")!=null) {
			session.setAttribute("pageNum", request.getParameter("pageNum"));
		}
		String pageNum = (String) session.getAttribute("pageNum");
		if(pageNum == null)
			pageNum = "1";
		
		int limit = 5; // 한페이지당 게시할 게시물 갯수
		int pageInt = Integer.parseInt(pageNum);
		
		BoardMybatis bd = new BoardMybatis();
		int boardCount = bd.boardCount(boardid);
		int boardNum = boardCount - (pageInt-1)*limit;
		
		List<Board> list = bd.boardList(pageInt, limit, boardid);
		System.out.println(boardid);
		String boardName = "";
			switch(boardid){
				case "1" : boardName = "공지사항"; break;
				case "2" : boardName = "자유게시판"; break;
				case "3" : boardName = "QnA"; break;
			}
			//pagging
			int bottomLine = 3;
		 	int start = (pageInt-1)/bottomLine*bottomLine+1;
		 	int end = start + bottomLine - 1;
		 	int maxPage = (boardCount/limit) + (boardCount % limit==0?0:1);
		 	if(end>maxPage) end=maxPage;
		 	
		 	request.setAttribute("bottomLine", bottomLine);
		 	request.setAttribute("start", start);
		 	request.setAttribute("end", end);
		 	request.setAttribute("maxPage", maxPage);
		 	request.setAttribute("pageInt", pageInt);
			request.setAttribute("list", list);
			request.setAttribute("boardNum", boardNum);
			request.setAttribute("boardName", boardName);
	 return "boardList"; //view/board/boardList.jsp
}
	
	@RequestMapping("boardComment")
	public String boardComment(HttpServletRequest request, HttpServletResponse response) {
		int num=1;
		try {
		 num = Integer.parseInt(request.getParameter("num"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		BoardMybatis bd = new BoardMybatis();
		Board board = bd.boardOne(num);
		List<Comment> commentLi = bd.commentList(num);
		
		request.setAttribute("board", board);
		request.setAttribute("commentLi", commentLi);
		return "boardComment";
	}
	
	@RequestMapping("boardCommentPro")
	public String boardCommentPro(HttpServletRequest request, HttpServletResponse response) {
		int boardNum = 1;
		try {
		 boardNum = Integer.parseInt(request.getParameter("num"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		String comment = request.getParameter("comment");
		BoardMybatis bd = new BoardMybatis();
		int num= bd.insertComment(comment, boardNum);		
		
		if(num==0)comment = "저장 실패";
		
		Comment c = new Comment();
		c.setContent(comment);
		c.setRegdate(new Date());
		request.setAttribute("c", c);
		return "boardCommentPro";
	}
	
	@RequestMapping("boardUpdateForm")
	public String boardUpdateForm(HttpServletRequest request, HttpServletResponse response) {
		int num=1;
		try {
		 num = Integer.parseInt(request.getParameter("num"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		BoardMybatis bd = new BoardMybatis();
		Board board = bd.boardOne(num);
		
		
		String boardid = (String)request.getSession().getAttribute("boardid");
		
		if(boardid==null) boardid="1";
		String boardName = "";
		switch(boardid){
			case "1" : boardName = "공지사항"; break;
			case "2" : boardName = "자유게시판"; break;
			case "3" : boardName = "QnA"; break;
		
			
	
	}
		request.setAttribute("board", board);
		request.setAttribute("boardName", boardName);
		return "boardUpdateForm";
	}
	
	@RequestMapping("boardUpdatePro")
	public String boardUpdatePro(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getServletContext().getRealPath("/")
			 	  +"view/board/images";
		String msg="";
		String url="";
		
		try {
			 MultipartRequest multi = new MultipartRequest(request, path,10*1024*1024,"UTF-8");
					 
			Board board = new Board();
			board.setNum(Integer.parseInt(multi.getParameter("num")));
			board.setName(multi.getParameter("name"));
			board.setPass(multi.getParameter("pass"));
			board.setSubject(multi.getParameter("subject"));
			board.setContent(multi.getParameter("content"));
			
			String file2 = multi.getFilesystemName("file2");
			if(file2!=null) {
				board.setFile1(file2);
			}else {
				board.setFile1(multi.getParameter("file1"));
			}
			
			System.out.println("업데이트 저장완료");
			BoardMybatis bd = new BoardMybatis();
			Board dbboard = bd.boardOne(board.getNum()); // 패스확인용
			

			if(board.getPass().equals(dbboard.getPass())) {// 수정가능확인
				if(bd.boardUpdate(board)>0) { // Update ok 
					msg = "수정 완료";
					url = "/board/boardComment?num="+board.getNum();// ?num="+board.getNum() >> 게시글좌표찍어주기
				}else {
					msg = "수정 실패";
					url = "/board/boardUpdateForm?num="+board.getNum();
				}
			}else {
				msg = "비밀번호가 틀렸습니다.";	
				url = "/board/boardUpdateForm?num="+board.getNum();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "alert";
	
	}
	
	 @RequestMapping("boardDeleteForm")
	 public String boardDeleteForm (HttpServletRequest request, HttpServletResponse response) {
		 
		 int num = Integer.parseInt(request.getParameter("num"));
		 request.setAttribute("num", num);
		 System.out.println(num);
		 return "boardDeleteForm";
	 }
	
	 @RequestMapping("boardDeletePro")
 	 public String boardDeletePro (HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		String pass = request.getParameter("pass");
		BoardMybatis bd = new BoardMybatis();
		Board dbboard = bd.boardOne(num);
		System.out.println(num);
		String msg = "";
		String url = "";
		
		
		if(pass.equals(dbboard.getPass())) {
			if(bd.boardDelete(num)>0) {
				msg = "게시글이 삭제 되었습니다";
				url = "/board/boardList";
			}else {
				msg = "삭제 실패";
				url = "/board/boardDeleteForm";
			}
		}else {
			msg = "비밀번호를 확인하세요";
			url = "/board/boardDeleteForm";
	 }
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "alert";
	 }
	
	
	
	
	


}//end