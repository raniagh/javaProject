package main;


import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class Connexion {
	String DiverName="com.mysql.jdbc.Driver";
	String URL="jdbc:mysql://localhost/ecole?useSSL=false";
	String user="root";
	String psw="";
	Connection con;
	public Connection Connexiond(){
	
		try {
			Class.forName(DiverName);
			try {
				con = (Connection) DriverManager.getConnection(URL,user,psw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
				}


		{
				}

		
	
	
	
}
