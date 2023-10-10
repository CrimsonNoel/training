package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import anno.ProfessorAnno;
import model.Professor;

public class Main06ProfessorAnno {

	public static void main(String[] args) {
		
		SqlSession sqlSession = MybatisConnection.getConnection();
		int num = sqlSession.getMapper(ProfessorAnno.class).count();
		System.out.println("1. professor count= "+num);
		
		System.out.println("2. 교수테이블에 등록된 모든 정보를 출력하기");
		List<Professor>	li = sqlSession.getMapper(ProfessorAnno.class).list();
		print(li);
		
		System.out.println("3. 교수중 101번 학과의 교수 정보를 출력");
		li = sqlSession.getMapper(ProfessorAnno.class).selectdeptno(101);
						// list(parameter); 파라미터값은 여기들어가고
						// 타입은 anno작성한 interface에가서 설정하면된다.
		print(li);
		
		System.out.println("4. 교수중 성이 김씨인 정교수 정보를 출력");
		Map map = new HashMap();
		map.put("name", "김");
		map.put("position", "정교수");
		li = sqlSession.getMapper(ProfessorAnno.class).selectnameposition(map);
		print(li);
		
		System.out.println("5. collection을 이용한 sql");
		int num1 = 101; int num2 = 102;
		List<Integer> datas = Arrays.asList(num1,num2);
		map.put("position", "정교수");
		map.put("datas", datas);
		
		li = sqlSession.getMapper(ProfessorAnno.class).selectCollection(map);
		print(li);
	}
	
	public static void print(List li) {
		for(Object o : li) {
			System.out.println(o);
		}
	}
}//end
