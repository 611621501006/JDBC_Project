package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_DB {
public static void main(String[] args) throws SQLException{
	String url="jdbc:mysql://localhost:3306/";
	String username="root";
	String password="sql@123";
	
	Connection objConnection=DriverManager.getConnection(url, username, password);
	Statement objStatement=objConnection.createStatement();
	String sql="create database emp;";
	 int count=objStatement.executeUpdate(sql);
	System.out.println("successfully create datebase");
	
	objConnection.close();
}
}
