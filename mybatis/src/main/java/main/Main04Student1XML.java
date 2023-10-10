package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.Student;

public class Main04Student1XML {
	private static final String NS = "xml.Student1.";
	public static void main(String[] args) {

		SqlSession sqlSession = MybatisConnection.getConnection();
		
		System.out.println("student insert ======================");
		Student s = new Student();
		s.setStudno(1111); s.setName("새로운"); s.setGrade(1);
		s.setId("kic01"); s.setJumin("1111111111111"); s.setMajor1(101);
		
		int num = sqlSession.insert(NS+"insert",s);
		
		List<Student> li = sqlSession.selectList(NS+"select");
		print(li);
		System.out.println("update=====================");
		s = new Student();
		s.setGrade(2); s.setWeight(60); s.setHeight(80);
		s.setProfno(2222); s.setStudno(1111);
		
		num = sqlSession.insert(NS+"update",s);
		li = sqlSession.selectList(NS+"selectRMap");
		print(li);
		
		System.out.println("delete=====================");
		num = sqlSession.insert(NS+"delete",1111);
		li = sqlSession.selectList(NS+"selectRMap");
		print(li);
		
		
		System.out.println("end");
	}

	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
	
}

