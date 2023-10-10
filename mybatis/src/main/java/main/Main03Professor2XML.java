package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Professor;

public class Main03Professor2XML {
	static final String namespace="xml.Professor2.";
	public static void main(String[] args) {

		SqlSession sqlSession = MybatisConnection.getConnection();
		List<Integer> datas = Arrays.asList(101,102);

		Map map = new HashMap();
		map.put("position", "정교수");
		map.put("datas", datas);
		
		System.out.println("select<script>===========");
		List<Professor> li = sqlSession.selectList(namespace+"select",map);
		print(li);
		
		System.out.println("=======================");
		map.clear();
		Professor p = li.get(0);
		p.setName("새로운");
		p.setPosition("임시작");
		
		int num = sqlSession.insert(namespace+"insertProfessor",p);
		print(li);
		
		
		map.clear(); //클리어하고 아무 조건 안넣으면 trim /trim사이의 if들이 없다보고 select전체가 동작한다
		System.out.println("select all ==============");
		li = sqlSession.selectList(namespace+"select",map); 
		print(li);
		
		System.out.println("end");
	}
	
	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
}//end
