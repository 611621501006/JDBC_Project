package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insert_value {
public static void main(String[] args) throws SQLException {
	Link objLink=new Link();
	String url="jdbc:mysql://localhost:3306/emp";
	String query="insert into emp values(?,?,?)";
	Connection objConnection=DriverManager.getConnection(url, objLink.getUsername(),objLink.getPasword());
	PreparedStatement objPreparedStatement=objConnection.prepareStatement(query);
	objPreparedStatement.setInt(1, 1);
	objPreparedStatement.setString(2, "kumar");
	objPreparedStatement.setInt(3, 45000);
//	objPreparedStatement.setInt(1, 2);
//	objPreparedStatement.setString(2, "Ravi");
//	objPreparedStatement.setInt(3, 55000);
	int insert=objPreparedStatement.executeUpdate();
	
	ResultSet objResultSet=objPreparedStatement.executeQuery("select * from emp");
	while(objResultSet.next()) {
		System.out.println("Id:" + objResultSet.getInt(1));
		System.out.println("Name : " + objResultSet.getString(2));
		System.out.println("Salary :" +objResultSet.getInt(3));
	}
	objConnection.close();
}
}
