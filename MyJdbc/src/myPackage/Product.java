package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Products","root","Sachin777#");
		
		System.out.println(con);
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=1;i<=3;i++) {
				System.out.println("enter id: ");
				int id=sc.nextInt();
				
				System.out.println("enter name: ");
				String t=sc.next();
				
				PreparedStatement ps=con.prepareStatement("insert into ProductDe value(?,?);");
				ps.execute();
				ps.setInt(1, id);
				ps.setString(2, t);
				ps.close();
				
			}
		}
		
		con.close();
}
}
