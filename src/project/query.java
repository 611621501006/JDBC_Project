package project;

public class query {
	static String insert = "insert into stud_details values(?,?,?,?)";
	static String display = "select * from stud_details";
	static String delete = "delete from stud_details where Sid=?";
	static String search = "select * from stud_details where Sid=?";
	static String update = "update stud_details set Sname=?,Sdept=?,Sro_no=? where Sid=?";
}
