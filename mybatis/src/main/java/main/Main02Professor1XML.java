package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Professor;

public class Main02Professor1XML {
	static final String namespace="xml.Professor1.";
	// xml 의 namespace와 같아야한다.
	public static void main(String[] args) {
		
		SqlSession sqlSession = MybatisConnection.getConnection();
		
		System.out.println("count==========================");
		int num = sqlSession.selectOne(namespace+"count"); //alias=member에서 사용했기 때문에 namespace 써줘야 에러가안난다
		System.out.println(num);
		
		System.out.println("list==========================");
		List<Professor> li = sqlSession.selectList(namespace+"list"); 
		print(li);
		
		System.out.println("selectdeptno==========================");
		li = sqlSession.selectList(namespace+"selectdeptno",101); 
		print(li);
		
		System.out.println("selectnameposition==========================");
		Map map = new HashMap();
		map.put("name", "명");
		map.put("position", "정교수");
		li = sqlSession.selectList(namespace+"selectnameposition",map); 
		System.out.println(li);
		
		
		
		
		
	}

	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
	
}//end