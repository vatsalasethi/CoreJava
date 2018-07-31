import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			con.setAutoCommit(false);

			// read data from user

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			String name = "";
			String wdate = "";
			int steps = 0;

			System.out.println("enter name");
			name = br.readLine();
			System.out.println("date");
			wdate = br.readLine();
			System.out.println("steps");
			steps = Integer.parseInt(br.readLine());

			// Insert
			PreparedStatement psmt1 = con.prepareStatement("Insert into dailysteps1(name, dates,steps) values(?,?,?)");
			psmt1.setString(1, name);
			psmt1.setDate(2, Date.valueOf(wdate));
			psmt1.setInt(3, steps);

			int cnt1 = psmt1.executeUpdate();

			PreparedStatement psmt2 = con.prepareStatement("Update tots set stepss=steps+? where usr=?");
			psmt2.setString(1, name);
			psmt2.setInt(2, steps);

			int cnt2 = psmt2.executeUpdate();

			if (cnt1 > 0 && cnt2 > 0) {
				con.commit();
			} else {
				System.out.println("Rollback");
				con.rollback();

			}

			String sql = ("Update tots set stepss=545 where Usr='Peter'");

			psmt1.close();
			psmt2.close();
			con.close();
			con.close();

		}

		catch (ClassNotFoundException ee) {
		} catch (SQLException ss) {
		}

		catch (NumberFormatException n) {
		} catch (IOException ioe) {
		}

	}

}
