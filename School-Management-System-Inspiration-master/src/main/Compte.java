package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

public class Compte {
	Connection con;
	public void creercompte(String log,String pwd,String adresse){
		Connexion c =new Connexion();
		 con= c.Connexiond();
		try {
			Statement r2 = con.createStatement();
			String	sql="INSERT INTO `compte` ( `Login`, `password`,`adresse`) VALUES ('"+log+"','"+pwd+"','"+adresse+"')";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb+"ojjjjj");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	
	public boolean confirmation(String pass1,String pass2){
		
		if(pass1.equals(pass2))
		{
			return true;
			
			
		}else
			
			return false;
		
	}
	
	public void verification(String log,String pwd){
		Connexion c =new Connexion();
		con=c.Connexiond();
		int i=0;
		con=c.Connexiond();
		try {
			Statement r1 = con.createStatement();

			ResultSet res = r1.executeQuery("SELECT * from	compte where `Login`='"+log+"' and `password`='"+pwd+"'");
			while( res.next()) {
				i=i+1;
			}
		
			if(i==0){
				JOptionPane.showMessageDialog(null,"Mot passe ou Login invalide","Erreur",JOptionPane.ERROR_MESSAGE);
				
				
			}
			else{
				
				new Home().show();
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
	}
	
	

}
