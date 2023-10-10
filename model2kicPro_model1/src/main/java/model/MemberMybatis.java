package model;

import java.sql.Connection;
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

public class MemberMybatis {

	private SqlSession sqlSession = MybatisConnection.getConnection(); 
	
		public int insertMember(Member m){ 
			try {
			return sqlSession.getMapper(MemberAnno.class).insertMember(m);
			}catch(Exception e) {
				e.printStackTrace();
			}
				finally {
					sqlSession.commit();
				}
				return 0;
			}
	public Member oneMember(String id) {
			
		return sqlSession.getMapper(MemberAnno.class).oneMember(id);
	}

	public int updateMember(Member m) {
		
			try {
				return sqlSession.getMapper(MemberAnno.class).updateMember(m);
				}catch(Exception e) {
					e.printStackTrace();
				}
					finally {
						sqlSession.commit();
					}
					return 0;
				}
		
		
		public int deleteMember(String id) {
			try {
				return sqlSession.getMapper(MemberAnno.class).deleteMember(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
					finally {
						sqlSession.commit();
					}
					return 0;
		}
		
		
		public int changePass(String id, String newPass) {
			Map map = new HashMap();
			map.put("id",id);
			map.put("pass", newPass);
			try {
				return sqlSession.getMapper(MemberAnno.class).deleteMember(id);
				}catch(Exception e) {
					e.printStackTrace();
				}
					finally {
						sqlSession.commit();
					}
					return 0;
			
		}
		
		public List<Member> memberList() {
		
			return sqlSession.getMapper(MemberAnno.class).memberList();
		}
	
}
