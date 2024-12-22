package connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callable_Stmt {
	static final String url="jdbc:mysql://localhost:3306/emp";
	static final String query="{call name}";
public static void main(String[] args) throws SQLException {
	 Link objLink=new Link();
	Connection objConnection=DriverManager.getConnection(url, objLink.getUsername(), objLink.getPasword());
	CallableStatement objCallableStatement=objConnection.prepareCall(query);
	ResultSet objResultSet=objCallableStatement.executeQuery();
	while(objResultSet.next())
	{
		System.out.println(objResultSet.getInt(1));
		System.out.println(objResultSet.getString(2));
		System.out.println(objResultSet.getInt(3));
	}
	objConnection.close();
			}
}
