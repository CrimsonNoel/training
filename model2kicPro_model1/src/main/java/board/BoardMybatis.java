package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis.MemberAnno;
import mybatis.MybatisConnection;

	 

public class BoardMybatis{

	private SqlSession sqlSession = MybatisConnection.getConnection();
	private static final String NS = "mybatis.Board.";
	
	public int insertBoard(Board board) {
			try {
				return sqlSession.insert(NS+"insertBoard", board);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
					sqlSession.commit();
				}
				return 0;
			}
	
	public List<Board> boardList(int pageInt, int limit, String boardid){
			Map map = new HashMap();
			map.put("boardid", boardid);
			map.put("start", (pageInt-1)*limit+1);
			map.put("end", pageInt*limit);
			
		return sqlSession.selectList(NS+"boardList",map);
	}


	public int boardCount(String boardid) {
		
		return sqlSession.selectOne(NS+"boardCount",boardid);
		}
	
	public Board boardOne(int num){
		return sqlSession.selectOne(NS+"boardOne",num);
	}

	public int insertComment(String comment, int num) {
		Map map = new HashMap();
		map.put("comment", comment);
		map.put("num", num);
		try {
			return sqlSession.insert(NS+"insertComment", map);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
				sqlSession.commit();
			}
			return 0;
		}
	
	public List<Comment> commentList(int num) {
		
		return sqlSession.selectList(NS+"commentList",num);
	}
	
	public int boardUpdate(Board board) {
		try {
			return sqlSession.insert(NS+"boardUpdate", board);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				sqlSession.commit();
			}
			return 0;
		}
		
	public int boardDelete(int num) {
		try {
			sqlSession.delete(NS+"commentDelete", num);
			return sqlSession.delete(NS+"boardDelete", num);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				sqlSession.commit();
			}
			return 0;
	}
	
	
	
	
	
	
	
	
}//end
