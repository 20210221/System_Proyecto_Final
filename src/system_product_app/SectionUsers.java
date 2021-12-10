package system_product_app;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael De La Cruz
 */

//Herencia: Hereda Los Elementos de la Superclase javax.swing.JFrame.

public class SectionUsers extends javax.swing.JFrame {
    
    Database db = Database.getInstance();
    
    Connection connect = db.Conexion();
                                    
    
    /**
     * Creates new form SectionClients
     */
    public SectionUsers() {
        initComponents();
        
        setResizable(false);
       
       setLocationRelativeTo(null);
       
       setIconImage(new ImageIcon(getClass().getResource("/Icons/Logo.png")).getImage());
       
        See();
        
        
      
    }
    
    

    public void See(){
        
        DefaultTableModel modelo = new DefaultTableModel();
       
        String[] Datos = new String[6];
        
 //        Polimorfismo: Usa una misma función para asignar diversos valores a una misma tabla.

       modelo.addColumn("Id");
        
        modelo.addColumn("Usuario");
        
        modelo.addColumn("Nombre");
        
        modelo.addColumn("Apellido");
        
        modelo.addColumn("Teléfono");
        
        modelo.addColumn("Email");
        
       
        
       try {
			
			PreparedStatement  slt = connect.prepareStatement("Select * From usuarios");
			
			ResultSet Data = slt.executeQuery(); 
			
			
			while(Data.next()) {
                            
                            //        Polimorfismo: Usa una misma función para asignar diversos valores a un mismo arreglo.
				
				Datos[0] = Data.getString(1);
				
				Datos[1] = Data.getString(2);
				
				Datos[2] = Data.getString(3);
				
				Datos[3] = Data.getString(4);
				
				Datos[4] = Data.getString(5);
                                
                                Datos[5] = Data.getString(6);
                                
                                
				
				 modelo.addRow(Datos);
				
			}}catch(SQLException ex){}
        
        TableUser.setModel(modelo);
        
        TableUser.getTableHeader().setBackground(new Color(0,224,224));
        
        TableUser.getTableHeader().setForeground(Color.white);
        
        TableUser.getTableHeader().setFont(new Font("Arial",Font.PLAIN,12));

}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUser = new javax.swing.JTable();
        UpdateUser = new javax.swing.JButton();
        BackUsero = new javax.swing.JButton();
        DeleteUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFocusable(false);

        TableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableUser.setFocusable(false);
        TableUser.setGridColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(TableUser);

        UpdateUser.setBackground(new java.awt.Color(0, 204, 204));
        UpdateUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        UpdateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Update.png"))); // NOI18N
        UpdateUser.setText("Actualizar");
        UpdateUser.setBorder(null);
        UpdateUser.setFocusPainted(false);
        UpdateUser.setFocusable(false);
        UpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserActionPerformed(evt);
            }
        });

        BackUsero.setBackground(new java.awt.Color(0, 204, 204));
        BackUsero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BackUsero.setForeground(new java.awt.Color(255, 255, 255));
        BackUsero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Back.png"))); // NOI18N
        BackUsero.setText("Volver");
        BackUsero.setBorder(null);
        BackUsero.setFocusPainted(false);
        BackUsero.setFocusable(false);
        BackUsero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackUseroActionPerformed(evt);
            }
        });

        DeleteUser.setBackground(new java.awt.Color(0, 204, 204));
        DeleteUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        DeleteUser.setText("Eliminar");
        DeleteUser.setBorder(null);
        DeleteUser.setFocusPainted(false);
        DeleteUser.setFocusable(false);
        DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackUsero, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(UpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackUsero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserActionPerformed
        SectionUpdateUser SUS = new SectionUpdateUser();
        
        SUS.setVisible(true);
        
        int row = TableUser.getSelectedRow();
        
               //        Polimorfismo: Usa una misma función para asignar diversos valores a diversas variables
			
		String IDUser = TableUser.getValueAt(row, 0).toString();
                
                String User = TableUser.getValueAt(row, 1).toString();
                
                String Name = TableUser.getValueAt(row, 2).toString();
                
                String LName = TableUser.getValueAt(row, 3).toString();
                
                String Phone = TableUser.getValueAt(row, 4).toString();
                
                String Email = TableUser.getValueAt(row, 5).toString();
                
                SUS.GetData(IDUser, User, Name, LName, Phone, Email);
                
       
      
     
      Timer time = new Timer();  
      
      TimerTask Task = new TimerTask(){
      
      @Override
      
      public void run(){
          
          if(SUS.isVisible() == false){
              
               See();
          
              time.cancel();
          }
      }
      
      };
      
      time.schedule(Task, 0, 100);
        
    }//GEN-LAST:event_UpdateUserActionPerformed

    private void DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserActionPerformed
        
       int row = TableUser.getSelectedRow();
			
			String rowValue = TableUser.getValueAt(row, 0).toString();
                        
                        
			 	

			try {
				
				PreparedStatement  dlt = connect.prepareStatement("DELETE FROM usuarios WHERE idUser = '"+rowValue+"'");
				
				dlt.executeUpdate();
                                
                               See();
                                
                        }catch(SQLException ex){}
                        
                   
    }//GEN-LAST:event_DeleteUserActionPerformed

    private void BackUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackClientActionPerformed
        
        SectionOptions SO = new SectionOptions();
        
        SO.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_BackClientActionPerformed

    private void BackUseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackUseroActionPerformed
       SectionOptions SO = new SectionOptions();
        
        SO.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_BackUseroActionPerformed

   public void none(){}                                        

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
            java.util.logging.Logger.getLogger(SectionUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionUsers().setVisible(true);
            }
        });
    }
    
    //    Encapsulamiento: Restringe el uso de estos elementos a solo esta clase.
    
        //    Abstracción: Define y declara los elementos que compondran esta clase.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackUsero;
    private javax.swing.JButton DeleteUser;
    private javax.swing.JTable TableUser;
    private javax.swing.JButton UpdateUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
