package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class crud_method {
static	Connection objConnection;
static Statement objStatement;
static PreparedStatement objPreparedStatement;
  public static void insert(Integer id,String name,String dept,Long roll_no) throws SQLException
  {
	  objConnection=DriverManager.getConnection(link.url,link.username,link.password);
	  objPreparedStatement=objConnection.prepareStatement(query.insert);
	  objPreparedStatement.setInt(1, id);
	  objPreparedStatement.setString(2, name);
	  objPreparedStatement.setString(3, dept);
	  objPreparedStatement.setLong(4, roll_no);
	  objPreparedStatement.executeUpdate();
	  objConnection.close();
  }
  public static void displayAll() throws SQLException
  {
	  objConnection=DriverManager.getConnection(link.url,link.username,link.password);
	  objStatement=objConnection.createStatement();
	  ResultSet objResultSet=objStatement.executeQuery(query.display);
	  
	  while(objResultSet.next())
	  {
		  System.out.println("Stud_id: "+ objResultSet.getInt(1));
		  System.out.println("Stud_Name: "+ objResultSet.getString(2));
		  System.out.println("Stud_dept: "+ objResultSet.getString(3));
		  System.out.println("Stud_Roll_no: "+ objResultSet.getLong(4));
		  System.out.println("--------------------------------------------------------");
	  }
	  objConnection.close();
  }
  public static void search(Integer id) throws SQLException
  {
	  objConnection=DriverManager.getConnection(link.url,link.username,link.password);
	  objPreparedStatement=objConnection.prepareStatement(query.search);
	  objPreparedStatement.setInt(1, id);
	  ResultSet objResultSet=objPreparedStatement.executeQuery();
	  while(objResultSet.next())
	  {
		  System.out.println("Stud_id: "+ objResultSet.getInt(1));
		  System.out.println("Stud_Name: "+ objResultSet.getString(2));
		  System.out.println("Stud_dept: "+ objResultSet.getString(3));
		  System.out.println("Stud_Roll_no: "+ objResultSet.getLong(4));
	  }
	  objConnection.close();
  }
  public static void detele(Integer id) throws SQLException
  {
	  objConnection=DriverManager.getConnection(link.url,link.username,link.password);
	  objPreparedStatement=objConnection.prepareStatement(query.delete);
	  objPreparedStatement.setInt(1, id);
	   objPreparedStatement.executeUpdate();
	   objConnection.close();
  }
  public static void update(String name,String dept,Long roll_no,Integer c_id ) throws SQLException{
	  objConnection=DriverManager.getConnection(link.url,link.username,link.password);
	  objPreparedStatement=objConnection.prepareStatement(query.update);
	  objPreparedStatement.setString(1, name);
	  objPreparedStatement.setString(2, dept);
	  objPreparedStatement.setLong(3, roll_no);
	  objPreparedStatement.setInt(4, c_id);
	  objPreparedStatement.executeUpdate();
	  objConnection.close();
  }
}
