package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Sachin777#");
		System.out.println(con);
		
//		String a="use database student2";
//		Statement s=con.createStatement();
//		int r=s.executeUpdate(a);
//		System.out.println(r);
//		
		String query="insert into student2 values(1001,'vaibhav',90.7)";
		Statement st=con.createStatement();
		int row=st.executeUpdate(query);
		System.out.println(row);
		
		String query1="select * from Student2";
		ResultSet  rs=st.executeQuery(query1);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getDouble("per"));
		}
		
		con.close();
		st.close();
		
	}

}
