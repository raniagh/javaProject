package main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class eleve {
	static java.sql.Statement r1;
	java.sql.Statement r2;
	static ResultSet res;
	static Connection con;
	
	String nom;String prenom;String sexe;String date;String adresse;String tel;String pp;String pm;
	static Statement st=null;
	public eleve(){
		
		
		
	}
	
	public eleve (String nom,String prenom,String sexe,String date,String adresse,String tel,String pp,String pm) {
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.date=date;
		this.adresse=adresse;
		this.tel=tel;
		this.pp=pp;
		this.pm=pm;
		
		
		
	}
	public void fetch(){
		Connexion c =new Connexion();
		con=c.Connexiond();

		try {
			r1 =  con.createStatement();
			res= r1.executeQuery("SELECT * FROM eleve");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	
	
	

	public ResultSet afficher()
	{
		Connexion c =new Connexion();
		con=c.Connexiond();
	try {
		r1 =  con.createStatement();

		res= r1.executeQuery("SELECT * FROM eleve");
		while( res.next()) {
			System.out.println("Nom: "+res.getString("nom")+" Pr�nom: "+res.getString("prenom")+" date: "+res.getString("D-naiss"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res;
	}
	
	
	
	
	public void insertion(String nom,String prenom,String sexe,String date,String adresse,String tel,String pp,String pm){
		Connexion c =new Connexion();
		con=c.Connexiond();
		try {
			r2 =  con.createStatement();
			String	sql="INSERT INTO `eleve` ( `Nom`, `Prenom`, `Sexe`, `D-naiss`, `Adresse`, `N-tel`, `Prenom-pere`, `Prenom-mere`) VALUES ('"+nom+"','"+prenom+"','"+ sexe+"','"+date+"','"+adresse+"','"+ tel+"','"+ pp+"','"+pm+"')";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	
	
	
	
	
	
	public java.sql.Statement getR1() {
		return r1;
	}

	public void setR1(java.sql.Statement r1) {
		this.r1 = r1;
	}

	public java.sql.Statement getR2() {
		return r2;
	}

	public void setR2(java.sql.Statement r2) {
		this.r2 = r2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public void Suppression(int id){
		Connexion c =new Connexion();
		con=c.Connexiond();
		try {
			r2 =  con.createStatement();
			String	sql="delete from eleve where `N-insc`="+id+"";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	public void modification(int id,String nom,String prenom,String sexe,String date,String adresse,String tel,String pp,String pm){
		
		try {
                    Connexion c =new Connexion();
		con=c.Connexiond();
			r2 =  con.createStatement();
			String	sql="UPDATE `eleve` set `Nom`='"+nom+"',`Prenom`='"+prenom+"',`Sexe`='"+sexe+"',`D-naiss`='"+date+"',`Adresse`='"+adresse+"',`N-tel`='"+tel+"',`Prenom-pere`='"+pp+"',`Prenom-mere`='"+pm+"' WHERE `N-insc`="+id+"";
			
			
			int nb=r2.executeUpdate(sql);
			System.out.print(nb);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	
	public ResultSet Selecte(){

		Connexion c =new Connexion();
		con=c.Connexiond();
	try {
		r1 =  con.createStatement();

		res= r1.executeQuery("SELECT * FROM eleve");
		while( res.next()) {
			System.out.println("Nom: "+res.getString("nom")+" Pr�nom: "+res.getString("prenom")+" date: "+res.getString("D-naiss"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res;
	}
	
	
	public static int modifier(String req)
	{Connexion c =new Connexion();
	con=c.Connexiond();
		int l=0;
		try {

			l=st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;

	}
}




