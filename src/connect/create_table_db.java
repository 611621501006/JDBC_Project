package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table_db {
	final String url="jdbc:mysql://localhost:3306/emp";
	final String username="root";
	final String password="sql@123";
public static void main(String[] args) {
	create_table_db obj=new create_table_db();
	try {
		Connection objConnection=DriverManager.getConnection(obj.url,obj.username,obj.password);
		Statement objStatement=objConnection.createStatement();
		{
			String sql="create table emp( id int primary key auto_increment,name varchar(50),salary int)";
			objStatement.executeUpdate(sql);
			System.out.println("successfully create table");
		}
		}
	catch (SQLException e) {
		System.out.println(e);
	}
}
}
