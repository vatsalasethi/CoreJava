import java.sql.*;
public class StatementMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
		
		
		
		//Statement stmt=con.createStatement();
		/*String firstName="V";
		String lastname="S";
		String department="Bowling";
		String designation="Pace";
		String doj="30-jul-2018";
		Date doj1=Date.valueOf(doj);
		*/
		/*8String sql="Insert into employee values('V', 's','department', 'a','2018-02-2')";
		
		int rowsAffected=stmt.executeUpdate(sql);
	if(rowsAffected>1)
		System.out.println("inserted");
		else System.out.println("Not inserted") */
		
	
		/*	Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
		ResultSet rs=stmt.executeQuery("Select * from EMPLOYEE");
	/*	ResultSetMetaData md= rs.getMetaData();
		System.out.println(md.getColumnName(1));
		System.out.println(md.getColumnType(1)); // 12 is for varchar
		System.out.println(md.getColumnType(3));
	//	System.out.println(rs.getString(1)+"and" + rs.getString(2));
		//System.out.println(md.getTableName());
		*/
	//	rs.close();
		//stmt.close();
		//con.close();
	
		PreparedStatement psmt=con.prepareStatement("insert into EMPLOYEE(NAME,SAL,DEPARTMENT) values(?,?,?)");  
		psmt.setString(1, "Katy");
		psmt.setDouble(2, 200.0);
		psmt.setString(3, "IT");
		psmt.addBatch();
		psmt.setString(1, "a");
		psmt.setDouble(2, 3254.4);
		psmt.setString(3, "IT0");
		psmt.addBatch();
		psmt.executeBatch();
		psmt.close();
		con.close();
		

}

catch(ClassNotFoundException e)
{
	
	System.out.println("Class not found");
}

catch(SQLException e)
{
	System.out.println("SQL Exception");
	System.out.println(e.getMessage());
}


}
}