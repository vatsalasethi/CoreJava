import java.sql.*;

public class JDBCConnectDemo {
	static Connection con;

	public static Connection giveConnection() {

		// Step 1: Load the JDBC Driver.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // loading any class manually/dynamically
		}

		catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate driver");
			System.out.println(e1.getMessage());
		}

		// Step 2: Connecting to the server
		// String jdbcURL="jdbc:oracle:thin:127.0.0.1:1521:orcl";

		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "tiger";
		Connection con = null;

		try {
			con = DriverManager.getConnection(jdbcURL, username, password);

			System.out.println("Connection Successful!");
		} catch (SQLException e) {

			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		System.out.println("Hi");
		return con;

	}

	public static ResultSet executeQuery(String query) {

		// Step 3: Create a statement object.

		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();

			// Step 4: select SQL Query

			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

	public static void main(String[] args) throws SQLException {

		Connection con = giveConnection();
		ResultSet rs = executeQuery("Select * from EMPLOYEE");

		while (rs.next()) {

			String fname = rs.getString(1); // reading the firstname column
			int sal = rs.getInt(2);
			String dept = rs.getString(3);

			System.out.println(fname + " " + sal + " " + dept);

		}

		rs.close();

		con.close();

	}

}
