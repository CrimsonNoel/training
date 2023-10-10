package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MmemberDao {

	public Connection getConnection() {
		
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection connn =DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe","kic","1111"
						   	);
				System.out.println("db ok");
				return connn;
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("db error");
			return null;
		}
	
	public int insertMmember(Mmember m) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement("insert into Mmember values(?,?,?,?,?,?,'',sysdate )");
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getGender());
			pstmt.setString(5, m.getTel());
			pstmt.setString(6, m.getEmail());
				return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public Mmember oneMmember(String id) {
		Connection con = getConnection();
		PreparedStatement pstmt;
		ResultSet rs;
		
		try {
			pstmt = con.prepareStatement("select * from Mmember where id = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Mmember m = new Mmember();
				m.setId(rs.getString("id"));
				m.setPass(rs.getString("pass"));
				m.setName(rs.getString("name"));
				m.setGender(rs.getInt("gender"));
				m.setTel(rs.getString("tel"));
				m.setEmail(rs.getString("email"));
				return m;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int deleteMmember(String id) {
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
	
	
	
	
	
	
}
