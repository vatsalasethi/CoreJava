import java.sql.*;

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // odjo
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			String sql = " {? = call big1(?,?)}";
			CallableStatement cstmt = con.prepareCall(sql);

			cstmt.registerOutParameter(1, Types.INTEGER);

			cstmt.setInt(2, 25);
			cstmt.setInt(3, 125);

			cstmt.execute();

			System.out.println("Executed");
			System.out.println("Biggest no " + cstmt.getInt(1));

			/*
			 * else { System.out.println("Not executed"); }
			 */

			cstmt.close();
			con.close();
		}

		catch (ClassNotFoundException | SQLException c) {
		};

	}

}
