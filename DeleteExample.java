import java.sql.*;
public class DeleteExample {
public static void main(String[] args) {
try {
// Load JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Connect to database
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabase",
"username", "password");
// Create statement and execute delete query
Statement stmt = con.createStatement();
stmt.executeUpdate("DELETE FROM students WHERE id=1");
// Close connection
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
