package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class BoardDao{

	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn =DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kic","1111");
			System.out.println("db ok");
			return conn;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e	) {
			e.printStackTrace();
		}
		System.out.println("db error");
		return null;
	}
	
	
	public int insertBoard(Board board) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(//번호 하나씩 증가						(증가하고난 뒤)현재번호가 찍힘.
			"insert into board values(boardseq.nextval,?,?,?,?,?,?, sysdate,0,boardseq.currval,0,0)");
			pstmt.setString(1, board.getBoardid());
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getPass());
			pstmt.setString(4, board.getSubject());
			pstmt.setString(5, board.getContent());
			pstmt.setString(6, board.getFile1());
			
			return pstmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Board> boardList(int pageInt, int limit, String boardid){

		Connection con = getConnection();
		PreparedStatement pstmt;
		ResultSet rs = null;
		List<Board> li = new ArrayList<>();
		try {
			/*
			 * select * from(
			   select rownum rnum , a.* from
			   (select * from board where boardid = '1'
			   order by num desc) a) where rnum BETWEEN 1 and 5;
			 */
			String sql = " select * from("+
						 " select rownum rnum , a.* from"+
						 " (select * from board where boardid = ?"+
					     " order by num desc) a) where rnum BETWEEN ? and ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardid);
			pstmt.setInt(2, (pageInt-1)*limit+1); // 1, 11, 21 ....
			pstmt.setInt(3, pageInt*limit); //10, 20, 30 ....
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board b = new Board();
				b.setNum(rs.getInt("num"));
				b.setName(rs.getString("name"));
				b.setPass(rs.getString("pass"));
				b.setSubject(rs.getString("subject"));
				b.setContent(rs.getString("content"));
				b.setFile1(rs.getString("file1"));
				b.setRegdate(rs.getDate("regdate"));
				b.setReadcnt(rs.getInt("readcnt"));
				li.add(b);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return li;
		
	}


	public int boardCount(String boardid) {
		

		Connection con = getConnection();
		PreparedStatement pstmt;
		ResultSet rs = null;
		String sql = "select nvl(count(*),0)  from board where boardid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				return rs.getInt(1); // 컬럼의 순서?
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public Board boardOne(int num){

		Connection con = getConnection();
		PreparedStatement pstmt;
		ResultSet rs = null;
		try {
			String sql = " select * from board where num = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Board b = new Board();
				b.setNum(rs.getInt("num"));
				b.setName(rs.getString("name"));
				b.setPass(rs.getString("pass"));
				b.setSubject(rs.getString("subject"));
				b.setContent(rs.getString("content"));
				b.setFile1(rs.getString("file1"));
				b.setRegdate(rs.getDate("regdate"));
				b.setReadcnt(rs.getInt("readcnt"));
				return b;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public int insertComment(String comment, int num) {
		
		Connection con = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(
				"insert into boardcomment values(boardcomseq.nextval,?,?,sysdate)");
			pstmt.setInt(1, num);
			pstmt.setString(2, comment);
			
			return pstmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	
	}
	
	public List<Comment> commentList(int num) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		ResultSet rs = null;
		List<Comment> li = new ArrayList<>();
		try {
			String sql = " select * from boardcomment where num = ? order by regdate desc ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Comment c = new Comment();
				c.setSer(rs.getInt("ser"));
				c.setNum(rs.getInt("num"));
				c.setContent(rs.getString("content"));
				c.setRegdate(rs.getDate("regdate"));
				li.add(c);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return li;
	}
	
	public int boardUpdate(Board board) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(
			"update board set subject=?, content=?, file1=? where num = ?");
			
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getFile1());
			pstmt.setInt(4, board.getNum());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int boardDelete(int num) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		String sql1=" delete from board where num = ?";
		// 기존 보드 삭제
		String sql2=" delete from boardcomment where num = ?";
		// 코멘트 보드 삭제 -  게시판 지우면 코멘트도 같이 삭제되어야한다.
				
		try {
			pstmt = con.prepareStatement(sql2);
				pstmt.setInt(1,  num);
				pstmt.executeUpdate();
				
				pstmt = con.prepareStatement(sql1);
				pstmt.setInt(1,  num);
				
			return pstmt.executeUpdate();
	}catch(SQLException e) {
		try {
			con.rollback();
			//delete 도중 에러발생시 데이터 되돌리기
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	
	
	
	
}//end
