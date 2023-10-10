package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Member;

public class Main01MemberXML {

	static final String namespace="xml.member"; //member.xml 에서 namespace랑 같아야한다 
	
	public static void main(String[] args) {
		
		SqlSession sqlSession = MybatisConnection.getConnection();
//		Member member = new Member();
//		member.setEmail("email");
//		member.setGender(1);
//		member.setId("id1"); //primary key >id 여서 1붙임
//		member.setName("name01");
//		member.setPass("1111");
//		member.setTel("123-1234");
//		member.setPicture("aaa.png");

		
//			sqlSession.insert(namespace+".memberInsert", member);
//			sqlSession.commit();
			System.out.println("count==========================");
			int num = sqlSession.selectOne("count"); // row 한개
			System.out.println(num);
			
			System.out.println("list==========================");
			List<Member> li = sqlSession.selectList("list"); // row 여러개
			print(li);
			
			System.out.println("selectId==========================");
		    Member m = sqlSession.selectOne("selectId","bzqgytdc");// row 한개씩 while로 //List넣어서 여러개도가능
			System.out.println(m);
			
			System.out.println("selectName==========================");
			li = sqlSession.selectList("selectName","김");// 동일 name이 있을수있어서 List?? //row 한개씩 김찾기
			print(li);
			
			Map map = new HashMap();
			map.put("col","id");
			map.put("value","c");
			
			System.out.println("selectColumn==========================");
			li = sqlSession.selectList("selectColumn",map);// row 한개씩 c찾기
			print(li);
			
			map.clear();
			
			map.put("name", "나");
			map.put("gender", 1);
			System.out.println("selectNameGender==========================");
			li = sqlSession.selectList("selectNameGender",map);// row 한개씩 c찾기
			print(li);
			
			
			System.out.println("end");
		
	}
	
	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
	
	
}
