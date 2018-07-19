import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","666666");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
