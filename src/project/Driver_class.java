package project;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver_class {
public static void main(String[] args) throws SQLException {
    Scanner objScanner=new Scanner(System.in);
    boolean flag=true;
    while(flag)
    {
    	System.out.println("1.Insert");
    	System.out.println("2.DisplayALL");
    	System.out.println("3.Delete");
    	System.out.println("4.Search");
    	System.out.println("5.update");
    	System.out.println("6.Exit");
    	System.out.println("Enter the any option");
    	int num=objScanner.nextInt();
    	switch(num)
    	{
    	case 1:
    	{
    		System.out.println("Enter the Student Id: ");
    		Integer id=objScanner.nextInt();
    		System.out.println("Enter the Student Name: ");
    		String name=objScanner.next();
    		System.out.println("Enter the Student dept: ");
    		String dept=objScanner.next();
    		System.out.println("Enter the Student Roll_No: ");
    		Long roll_no=objScanner.nextLong();
    		crud_method.insert(id, name, dept, roll_no);
    		System.out.println("Successfully insert👍");
    		System.out.println("*******************************************");
    		break;
    	}
    	case 2:
    	{
    		crud_method.displayAll();
    		break;
    	}
    	case 3:
    	{
    	     System.out.println("you want delete enter the Id: ");
    	     Integer id=objScanner.nextInt();
    	     crud_method.detele(id);
    	     System.out.println("Successfully delete👍");
     		System.out.println("*******************************************");
    	     break;
    	}
    	case 4:
    	{
    		System.out.println("Enter the Stud Id: ");
    		Integer id=objScanner.nextInt();
    		crud_method.search(id);
    		System.out.println("*******************************************");
    		break;
    	}
    	case 5:
    	{
    		System.out.println("which id you can want update Enter the id: ");
    		Integer c_id=objScanner.nextInt();
    		if(c_id!=0)
    		{
        		System.out.println("Enter the New Student Name: ");
        		String name=objScanner.next();
        		System.out.println("Enter the New Student dept: ");
        		String dept=objScanner.next();
        		System.out.println("Enter the New  Student Roll_No: ");
        		Long roll_no=objScanner.nextLong();
        		crud_method.update(name,dept,roll_no,c_id);
        		System.out.println("Successfully update");
        		System.out.println("**************************************************");
        		break;
    		}
    		else {
    			System.out.println("invalid Student Id 😵‍💫😵‍💫");
    			break;
    		}
    	}
    	case 6:
    	{
    		System.out.println("you exit many enter the Y/N");
    		String click=objScanner.next();
    		if(click.equalsIgnoreCase("y"))
    		{
    			flag=false;
    		}
    	}
    	default:
    	{
    		System.out.println("Invalid option");
    	}
    	}
    }
    objScanner.close();
}
}
