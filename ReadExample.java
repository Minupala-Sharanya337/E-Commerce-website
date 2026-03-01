package Sample;
import java.sql.*;
public class ReadExample {
	public static void main(String args[]) {
	try {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a0588","root","1234");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
}
