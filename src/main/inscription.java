package main;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class inscription {
	java.sql.Statement r1;
	java.sql.Statement r2;
	ResultSet res;
	Connection con;
	public void afficher()
	{
		Connexion c =new Connexion();
		con=c.Connexiond();
	try {
		r1 =  con.createStatement();

		res= r1.executeQuery("SELECT * FROM inscription");
		while( res.next()) {
			System.out.println("id"+res.getInt("id-i")+"id-eleve "+res.getInt("id-eleve")+" annee "+res.getString("annee_scolaire")+" niveau: "+res.getString("niveau"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	public void insertion(int ide,String annee,String niveau,int idg){
		Connexion c =new Connexion();
		con=c.Connexiond();
		try {
			r2 =  con.createStatement();
			String	sql="INSERT INTO `inscription` (`id-eleve`, `annee_scolaire`,`niveau`,`id-groupe`) VALUES  ("+ide+",'"+annee+"','"+niveau+","+idg+")";
 
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	
	
	
	
	
	
	public void Suppression(int idi){
		Connexion c =new Connexion();
		con=c.Connexiond();
		try {
			r2 =  con.createStatement();
			String	sql="delete from `inscription` where `id-i`='"+idi+"'";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	public void modification(int idi,int ide,String annee,String niveau){
		Connexion c =new Connexion();
		con=c.Connexiond();
		try {
			r2 =  con.createStatement();
			String	sql="UPDATE `inscription` set `id-eleve`='"+ide+"',`annee_scolaire`='"+annee+"',`niveau`='"+niveau+"' WHERE `id-i`="+idi+"";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	

}
