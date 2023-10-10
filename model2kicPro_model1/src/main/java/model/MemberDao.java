package model;
/*
 * DAO
 * DAO(Date Access Object) 는 데이터베이스의 data에 접근하기 위한 객체입니다.
 * DataBase에 접근 하기 위한 로직&비지니스 로직을 분리하기 위해 사용합니다.
 * 
 * DTO
 * DTO(Data Transfer Object)는 계층 간 데이터 교환을 하기 위해 사용하는 객제로,
 * DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스 입니다.) 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MemberDao {

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

public int insertMember(Member m){ // 예외처리하라고 컴파일 에러가 나지만
								   // 파일이 끝까지 실행되어야 하기에 서라운드에드를 했다.
	Connection con = getConnection();
	PreparedStatement pstmt;
	
	
	try {
		pstmt = con.prepareStatement("insert into Member values(?,?,?,?,?,?,?, sysdate)");
		pstmt.setString(1, m.getId());
		pstmt.setString(2, m.getPass());
		pstmt.setString(3, m.getName());
		pstmt.setInt(4, m.getGender());
		pstmt.setString(5, m.getTel());
		pstmt.setString(6, m.getEmail());
		pstmt.setString(7, m.getPicture());
		return pstmt.executeUpdate(); 
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
	
}
//생성자 리턴타입 클래스네임
public Member oneMember(String id) {
	
	Connection con = getConnection();
	PreparedStatement pstmt;
	ResultSet rs = null;
	
	try {
		pstmt = con.prepareStatement("select  *  from member where id = ?");
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			Member m = new Member();
			m.setId(rs.getString("id"));
			m.setPass(rs.getString("pass")); //  sql에서 pass로 해놧다.
			m.setName(rs.getString("name"));
			m.setGender(rs.getInt("gender"));
			m.setTel(rs.getString("tel"));
			m.setEmail(rs.getString("email"));
			m.setPicture(rs.getString("picture"));
			return m;
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}

public int updateMember(Member m) {
	
	Connection con = getConnection();
	PreparedStatement pstmt;
	String sql = "update member set name=?, gender=?, tel=?,"
					+"email=?, picture=? where id = ?";
				// 마지막 , 는 있으면 안된다  ~~~ , where id=? >>> , 제거해야함
	try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, m.getName());
		pstmt.setInt(2, m.getGender());
		pstmt.setString(3, m.getTel());
		pstmt.setString(4, m.getEmail());
		pstmt.setString(5, m.getPicture());
		pstmt.setString(6, m.getId());
		
		
		return pstmt.executeUpdate(); 
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
}
public int deleteMember(String id) {
	Connection con = getConnection();
	PreparedStatement pstmt;
	String sql = "delete from member where id = ?";
	try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		return pstmt.executeUpdate(); 
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
}

public int changePass(String id, String newPass) {
	Connection con = getConnection();
	PreparedStatement pstmt;
	String sql = "update member set pass=? where id = ?";
	try {    //  패스가 어딨는지 물어보고 newpass를 입력해서 변경한다.
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, newPass);
		pstmt.setString(2, id);
		return pstmt.executeUpdate(); 
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
}

public List<Member> memberList() {
	
	Connection con = getConnection();
	PreparedStatement pstmt;
	ResultSet rs = null;
	List<Member> li = new ArrayList<>();
	try {
		pstmt = con.prepareStatement("select  *  from member");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Member m = new Member();
			m.setId(rs.getString("id"));
			m.setPass(rs.getString("pass"));
			m.setName(rs.getString("name"));
			m.setGender(rs.getInt("gender"));
			m.setTel(rs.getString("tel"));
			m.setEmail(rs.getString("email"));
			m.setPicture(rs.getString("picture"));
			li.add(m);
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return li;
	
}

}//end
