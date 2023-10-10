package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BookDao {

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

public int insertBook(Book b) throws SQLException {
	Connection con = getConnection();
	PreparedStatement pstmt = 
			con.prepareStatement("insert into book values(?,?,?, sysdate)");
	pstmt.setString(1, b.getWriter());
	pstmt.setString(2, b.getTitle());
	pstmt.setString(3, b.getContent());

	return pstmt.executeUpdate(); // 3  3dml시 실행;
}

	public List<Book> selectBook() throws SQLException{
	Connection con = getConnection(); // 1
	PreparedStatement pstmt = 
			con.prepareStatement("select*from book order by rdate desc"); //2
	ResultSet rs =  pstmt.executeQuery(); // 실행
	List<Book> li = new ArrayList<>();
	
	while(rs.next()) {
		Book b = new Book(rs.getString("writer"),rs.getString("title"),
						rs.getString("content"));
		b.setRdate(rs.getDate("rdate"));
		
		li.add(b);
	}
	return li;
	}




}