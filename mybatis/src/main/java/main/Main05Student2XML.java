package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Student;

public class Main05Student2XML {
	private static final String NS = "xml.Student2."; // namespace 설정하고 맨뒤에.찍는거 빼먹지말자
	public static void main(String[] args) {
		SqlSession sqlSession = MybatisConnection.getConnection();
		System.out.println("selectIf=======================");
		Map map = new HashMap();
		map.put("grade", 1);
		List<Student> li = sqlSession.selectList(NS+"selectIf",map);
		print(li);
		
		System.out.println("selectChoose=======================");
		map.clear();
		map.put("height", 170);
		li = sqlSession.selectList(NS+"selectChoose",map);
		print(li);
		
		System.out.println("selectCollection=======================");
		List<Integer> ali = Arrays.asList(101,102);
		map.clear();
		map.put("col","deptno1");
		map.put("datas",ali);
		li = sqlSession.selectList(NS+"selectCollection",map);
		print(li);
		
	}

	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
}
