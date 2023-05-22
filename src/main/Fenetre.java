package main;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import com.mysql.jdbc.Connection;
import main.Connexion;

public class Fenetre  extends JFrame implements ActionListener{
	
	private static JSplitPane js;
	Connection con;
	private JPanel p;
	private JTable ta;
	
	ResultSet res ;

	public Fenetre(){

		setTitle("Gestion eleve");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta= new JTable();
		
		Container c=getContentPane();
		c.add(ta);
		
	

		
	}
	public void fetch(){
		Connexion c =new Connexion();
		con = c.Connexiond();

		try {
			Statement r1 = con.createStatement();
			res= r1.executeQuery("SELECT * FROM eleve");
			ta.setModel(new MonModel(res));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	
		}
	}



