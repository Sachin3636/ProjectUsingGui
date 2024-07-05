package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	//driver load
	public void createDatabase() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "Sachin777#";
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			
			
			String query ="create table student1";
			stm.execute(query);
			System.out.println("table created successfully ");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		
	}
   }

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/student1";
			String userName = "root";
			String password = "Sachin777#";
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			
			
			String query ="create table student(sid int(3),sname varchar(200),semail varchar(200))";
			stm.execute(query);
			System.out.println("table created successfully ");
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		
	}
	
	}

	public void createdata() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db="student1";
			String userName = "root";
			String password = "Sachin777#";
			
			Connection conn = DriverManager.getConnection(url+db,userName,password);
//			Statement stm=conn.createStatement();
			
			
			
//			String query ="INSERT into student VALUES (1,'sachin','sr3630768@gmail.com')";
//			stm.execute(query);
//			System.out.println("value inserted  successfully ");
			
			// 2nd method ,if above insert function does'nt work
			
			String query ="INSERT into student (sid,sname,semail) VALUES (?,?,?)";
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setInt(1, 2);
			pstm.setString(2, "saidata");
			pstm.setString(3, "sai@gamil.com");
			pstm.executeUpdate();
			System.out.println("value inserted  successfully ");
			
			
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		
		
	}
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db="student1";
			String userName = "root";
			String password = "Sachin777#";
			Connection conn = DriverManager.getConnection(url+db,userName,password);
			
			
			String query="Select * from student";
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("id= "+rs.getInt(1));
				System.out.println("name= "+rs.getString(2));
				System.out.println("email= "+rs.getString(3));
			}
			System.out.println("read successfully");
			
			
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		
		
	}
		
	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db="student1";
			String userName = "root";
			String password = "Sachin777#";
			
			Connection conn = DriverManager.getConnection(url+db,userName,password);

			
			
			String query ="UPDATE student set sid=? where sname=?";
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setInt(1, 12);
			pstm.setString(2, "saidata");
		
			pstm.execute();
			System.out.println("value update  successfully ");
			
			
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		
		
	}
		
	}

}

