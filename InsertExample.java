package Sample;
import java.sql.*;

public class InsertExample {
	public static void main(String args[]) {
		try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a0588","root","1234");
	
		Statement stmt=con.createStatement();
     	stmt.executeUpdate("Insert into Employee values(4,'Ramu',50000,'HR')");
		con.close();
	}
		catch(Exception e) {
			e.printStackTrace();		}

}
}
