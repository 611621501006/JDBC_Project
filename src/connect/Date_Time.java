package connect;

import java.sql.Date;
import java.sql.Time;
public class Date_Time {
public static void main(String[] args) {
	
	java.util.Date objDate=new java.util.Date();
	long javatime=objDate.getTime();
	System.out.println("today date : "+ objDate.toString());
	
	Date objDate2=new Date(javatime);
	System.out.println("today date: "+ objDate2.toString());
	
	Time objTime=new Time(javatime);
	System.out.println("time in current : "+ objTime.toString());

}
}
