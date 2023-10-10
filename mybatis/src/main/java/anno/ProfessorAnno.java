package anno;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import model.Professor;


public interface ProfessorAnno {

	@Select("select count(*) from professor")
	int count()	;
	
	@Select("select * from professor")
	List<Professor> list();
	
	@Select("select * from professor where deptno = #{deptno} ")
	List<Professor> selectdeptno(int detpno);
	
	@Select("select * from professor where name like '${name}%' and position = #{position} ")
	List<Professor> selectnameposition(Map map);
	
	@Select("<script>"
			+"  select * from professor"
			+"<trim prefix='where' prefixOverrides='AND || OR'>  "
			+ "		<if test='deptno != null'>and deptno=#{deptno}</if>  "
			+ "		<if test='position != null'>and position=#{position}</if>  "
			+ "		<if test='profno != null'>and profno=#{profno}</if>  "
			+ "		<if test='datas'>and deptno in  "
			+ "			<foreach collection='datas' item='d' separator=',' open='(' close=')'>  "
			+ "			#{d}  "
			+ "			</foreach>  "
			+ "		</if>  "
			+ "		</trim></script>  ") 
			//태그형식이라 닫기까지
			// xml 짜놓은 부분을 <script></script> 태그 안에 넣어서 다양하게 사용.
			// parameter 값에 따라 List 제네릭클래스 형태 지정 잊지말고 어노테이션 리턴값하고 구분해라.
	List<Professor> selectCollection(Map map);
	
} //end










