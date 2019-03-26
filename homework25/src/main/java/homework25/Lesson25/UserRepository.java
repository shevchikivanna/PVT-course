package homework25.Lesson25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {
	
	public static User findUser() {
		String url = "jdbc:mysql://localhost:3306/test_automation?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		String users = "SELECT * FROM users";
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(users)) {
			if (rs.next()) {
				return new User(rs.getString(2), rs.getString(3), rs.getString(4));
			}
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
