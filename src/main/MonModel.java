package main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.mysql.jdbc.Connection;
import main.Connexion;




public class MonModel extends AbstractTableModel {
	
	Statement st=null;
	ResultSetMetaData rsmd;
	Connection con;
	Connexion c ;

	int nb_ligne;
	int nb_col=0;
	
	ArrayList<Object[]>data= new ArrayList<Object[]>();
	@SuppressWarnings("rawtypes")
	private Class[] className;
	
	
	public MonModel(ResultSet rs) throws ClassNotFoundException, SQLException{
		
		rsmd= rs.getMetaData();
		nb_col=rsmd.getColumnCount();
		
		Object[]e = null;
		className=new Class[nb_col];
		
		while (rs.next()){
			
			nb_ligne++;
			e=new Object[nb_col];
			
			for (int i = 0; i < nb_col; i++) {
				 
				e[i]=rs.getObject(i+1);
				className[i]=rs.getObject(i+1).getClass();
			}
			data.add(e);
		}
		}



	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return nb_ligne;
	}

	@Override
	public int getColumnCount() {
		// TODOAuto-generated method stub
		return nb_col;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		String x = "";

		try{
			x= rsmd.getColumnName(column+1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block

		}return x;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data.get(rowIndex)[columnIndex];
		}

	@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
		data.get(rowIndex)[columnIndex]=aValue;
		
		String champs=getColumnName(columnIndex);
		String colonne=getColumnName(0);
		String req="UPDATE `eleve` SET "+champs+" = ? where "+colonne+"=?";
		
		try {
			
			 c  =new Connexion();
			con = c.Connexiond();
			PreparedStatement ps=con.prepareStatement(req);
			ps.setObject(1,aValue );
			ps.setObject(2, getValueAt(rowIndex, 0));
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return className[columnIndex];
	}
	
}



