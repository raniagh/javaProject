/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author rania
 */
public class gereeleve extends javax.swing.JFrame {
Connection con;
	private JPanel p;
	static String sexe;
        static int id;
       	Statement r1;
	ResultSet res ;
    /**
     * Creates new form gereeleve
     */
    public gereeleve() {
        
        initComponents();
        Connexion c =new Connexion();
		con = c.Connexiond();

		try {
			Statement r1 = con.createStatement();
			res= r1.executeQuery("SELECT * FROM eleve");
			jTable1.setModel(new MonModel(res));
                      
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              
         
        
        
    }

         
        
     public void vider() {   
         jTextField2.setText("");
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jTextField5.setText(""); 
        jTextField6.setText(""); 
        jTextField7.setText(""); 
          jTextField1.setText(""); 

         
     }
    
public void charger() {
        
      
        Connexion c =new Connexion();
		con = c.Connexiond();

		try {
			Statement r1 = con.createStatement();
			res= r1.executeQuery("SELECT * FROM eleve");
			jTable1.setModel(new MonModel(res));
                      
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              
         
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("élèves");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 370, 80));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/0_b9786_72627e1a_XL.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -80, 1010, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Num inscription");
        jLabel2.setMaximumSize(new java.awt.Dimension(72, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(72, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Num inscription");
        jLabel3.setMaximumSize(new java.awt.Dimension(72, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(72, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Num inscription");
        jLabel4.setMaximumSize(new java.awt.Dimension(72, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(72, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Date De naissance");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 40));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 130, -1));

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Adresse");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 130, 40));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Sexe");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 40));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Téléphone");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 130, 40));

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Prénom_mère");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 130, 40));

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Nom");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 40));

        jLabel11.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Prénom_père");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, 40));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 130, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 130, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, -1));

        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 140, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName(""); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clik(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, 220));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/login-client.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setToolTipText("Modifier élève");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 70, 70));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setToolTipText("Ajouter élève");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 60, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/téléchargé.jpg"))); // NOI18N
        jLabel17.setToolTipText("Supprimer élève");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supp(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        jLabel16.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 204));
        jLabel16.setText("Prénom");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 40));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Garçon ");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Fille");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        jButton1.setText("Affecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supp
        // TODO add your handling code here:
        if( JOptionPane.showConfirmDialog(null,"Attention voulez-vous vraiment supprimer "+jTextField3.getText()+"   "+jTextField6.getText()+"","supprimer",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {

            eleve e=new eleve();
            int i = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();

            e.Suppression(Integer.parseInt(model.getValueAt(i,0).toString()));
            charger();
            vider();
        }

    }//GEN-LAST:event_supp

    private void add(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add

        
        
        if( JOptionPane.showConfirmDialog(null," voulez-vous vraiment Ajouter "+jTextField3.getText()+"   "+jTextField6.getText()+"","Ajouter",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {
        eleve e=new eleve();
        e.insertion(jTextField2.getText(),jTextField3.getText(),sexe,jTextField6.getText(), jTextField4.getText(), jTextField5.getText(), jTextField7.getText(), jTextField1.getText());

        JOptionPane.showMessageDialog(null,"Eleve bien ajouté","Ajout",JOptionPane.ERROR_MESSAGE);
        charger();

        // TODO add your handling code here:
    }//GEN-LAST:event_add
 }
    private void update(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update
        // TODO add your handling code here:
        eleve e=new eleve();
        
        if( JOptionPane.showConfirmDialog(null," voulez-vous vraiment Modifier "+jTextField3.getText()+"   "+jTextField6.getText()+"","Modifier",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();

        e.modification(Integer.parseInt(model.getValueAt(i,0).toString()),jTextField6.getText(),jTextField3.getText(),sexe,jTextField2.getText(), jTextField5.getText(), jTextField4.getText(), jTextField7.getText(), jTextField1.getText());

        //e.modification(18,"nom","prenom","sexe","date","adresse","tel","pp","pm");

        JOptionPane.showMessageDialog(null,"eleve Bien Modifié","Modification",JOptionPane.ERROR_MESSAGE);
        
        
        charger();
        }

    }//GEN-LAST:event_update

    private void clik(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clik
        // TODO add your handling code here:

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField3.setText(model.getValueAt(i,2).toString());
        jTextField6.setText(model.getValueAt(i,1).toString());
        jTextField2.setText(model.getValueAt(i, 4).toString());
        jTextField7.setText(model.getValueAt(i, 7).toString());
        jTextField1.setText(model.getValueAt(i, 8).toString());
        jTextField4.setText(model.getValueAt(i, 6).toString());
        jTextField5.setText(model.getValueAt(i, 5).toString());

    }//GEN-LAST:event_clik

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         
         
          sexe="Fille";
          
 
         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
         
          sexe="Garcon";
          
      
     
          
          
          
          
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new Affecte().show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gereeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gereeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gereeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gereeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
               
            
            
            public void run() {
                new gereeleve().setVisible(true);
            }
        });
        
        
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
