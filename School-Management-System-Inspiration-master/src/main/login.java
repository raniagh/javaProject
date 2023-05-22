/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rania
 */
public class login extends javax.swing.JFrame {
     private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
        private JLabel label,label1;
	
	int xx,xy;


    /**
     * Creates new form login
     */
    public login() {
        
        setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
		setBounds(100, 100, 700, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
                
                panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 346, 490);
		contentPane.add(panel);
		panel.setLayout(null);
                 JLabel l = new JLabel("");
                 l.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
                 l.setForeground(new java.awt.Color(45, 118, 232));
                 l.setText("Maddresti");
                 contentPane.add(l);
		 JLabel label = new JLabel("");
               label.setIcon(new ImageIcon(Home.class.getResource("/main/images/0_b9786_72627e1a_XL.png")));
                
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 xx = e.getX();
			     xy = e.getY();
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            login.this.setLocation(x - xx, y - xy);  
			}
		});
		label.setBounds(0,0, 500, 500);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		panel.add(label);
		
		
		
		Button button = new Button("Se connecter");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLUE);
		button.setBounds(430, 300,200, 36);
                
                
		contentPane.add(button);
                button.addActionListener(new Ec());
               
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
               
                
                JLabel label2 = new JLabel("Inscrivez-vous");
                label2.setBounds(470, 330, 150, 36);
                label2.setFont(new java.awt.Font("Tahoma", 1,12)); // NOI18N
                label2.setForeground(new java.awt.Color(45, 118, 232));
		contentPane.add(label2);
                label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new inscription().show();
			}
		});
		
		
		
		JLabel label1 = new JLabel("LOGIN");
                label1.setBounds(500, 100, 70, 20);
		label1.setVerticalAlignment(SwingConstants.TOP);
                label1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                label1.setForeground(new java.awt.Color(45, 118, 232));
		
		contentPane.add(label1);
		JLabel lblEmail = new JLabel("adresse éléctronique");
		lblEmail.setBounds(395, 132, 200, 16);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(395, 157, 283, 36);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setBounds(395, 204, 96, 16);
		contentPane.add(lblPassword);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(395, 229, 283, 36);
		contentPane.add(passwordField);
		
		
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
	}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
            
                new login().setVisible(true);
                
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
    }
     class Ec implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Compte c=new Compte();
            c.verification(textField_1.getText(),passwordField.getText());
                    
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }            
                    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

