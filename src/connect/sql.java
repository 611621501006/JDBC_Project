package connect;
import java.sql.*;
public class sql {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/productdetails";
	String username="root";
	String password="sql@123";
	String query="select * from productdetails";
   Connection objConnection=DriverManager.getConnection(url,username,password);
   Statement objStatement=objConnection.createStatement();
    ResultSet objResultSet=objStatement.executeQuery(query);
    
    while(objResultSet.next()) {
    	System.out.println(objResultSet.getInt(1));
    	System.out.println(objResultSet.getString(2));
    	System.out.println(objResultSet.getString(3));
    	System.out.println(objResultSet.getString(4));
    	System.out.println(objResultSet.getBigDecimal(5));
    	System.out.println(objResultSet.getString(6));
    	System.out.println(objResultSet.getBoolean(7));
    	System.out.println(objResultSet.getDate(8));
    	System.out.println(objResultSet.getInt(9));
    	System.out.println("-----------------------------------------");
    	}
    objConnection.close();
    }
}
