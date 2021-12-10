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

public class SectionProduct extends javax.swing.JFrame {
    
    Database db = Database.getInstance();
    
    Connection connect = db.Conexion();

    /**
     * Creates new form SectionProduct
     */
    public SectionProduct() {
        initComponents();
        
        setResizable(false);
       
       setLocationRelativeTo(null);
       
       setIconImage(new ImageIcon(getClass().getResource("/Icons/Logo.png")).getImage());
      
       
      See();
        
        
    }

   
    public void See(){
    
         DefaultTableModel modelo = new DefaultTableModel();
       
        String[] Datos = new String[6];
        
         //        Polimorfismo: Usa una misma función para agregar diversos valores a una misma tabla.
        
          modelo.addColumn("Id");
        
        modelo.addColumn("Nombre");
        
        modelo.addColumn("Marca");
        
        modelo.addColumn("Categoría");
        
        modelo.addColumn("Precio");
        
        modelo.addColumn("Cantidad");
        
        
        
       try {
			

			
			PreparedStatement  slt = connect.prepareStatement("Select * From productos");
			
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
        
        
       TableProduct.setModel(modelo);
        
        TableProduct.getTableHeader().setBackground(new Color(0,224,224));
        
        TableProduct.getTableHeader().setForeground(Color.white);
        
        TableProduct.getTableHeader().setFont(new Font("Arial",Font.PLAIN,12));
        
    
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ScrollTableProduct = new javax.swing.JScrollPane();
        TableProduct = new javax.swing.JTable();
        NewProduct = new javax.swing.JButton();
        BackProduct = new javax.swing.JButton();
        Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFocusable(false);

        ScrollTableProduct.setBackground(new java.awt.Color(255, 255, 255));
        ScrollTableProduct.setBorder(null);

        TableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableProduct.setFocusable(false);
        TableProduct.setGridColor(new java.awt.Color(0, 204, 204));
        ScrollTableProduct.setViewportView(TableProduct);

        NewProduct.setBackground(new java.awt.Color(0, 204, 204));
        NewProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewProduct.setForeground(new java.awt.Color(255, 255, 255));
        NewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/New.png"))); // NOI18N
        NewProduct.setText("Nuevo");
        NewProduct.setBorder(null);
        NewProduct.setFocusPainted(false);
        NewProduct.setFocusable(false);
        NewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewProductActionPerformed(evt);
            }
        });

        BackProduct.setBackground(new java.awt.Color(0, 204, 204));
        BackProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BackProduct.setForeground(new java.awt.Color(255, 255, 255));
        BackProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Back.png"))); // NOI18N
        BackProduct.setText("Volver");
        BackProduct.setBorder(null);
        BackProduct.setFocusPainted(false);
        BackProduct.setFocusable(false);
        BackProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackProductActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(0, 204, 204));
        Editar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.setBorder(null);
        Editar.setFocusPainted(false);
        Editar.setFocusable(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ScrollTableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollTableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
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

    private void BackProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackProductActionPerformed
        
         SectionOptions SO = new SectionOptions();
        
        SO.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_BackProductActionPerformed

    private void NewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewProductActionPerformed
       
        NewProduct NP = new NewProduct();
        
        NP.setVisible(true);
        
          Timer time = new Timer();  
      
      TimerTask Task = new TimerTask(){
      
      @Override
      
      public void run(){
          
          if(NP.isVisible() == false){
              
               See();
          
              time.cancel();
          }
      }
      
      };
      
      time.schedule(Task, 0, 100);

        
    }//GEN-LAST:event_NewProductActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        
          SectionGetProduct SGP = new SectionGetProduct();
          
         
          int row = TableProduct.getSelectedRow();
          
             //        Polimorfismo: Usa una misma función para asignar diversos valores a diversas variables.
			
		String IDValue = TableProduct.getValueAt(row, 0).toString();
                
                String NameValue = TableProduct.getValueAt(row, 1).toString();
                
                String MarcValue = TableProduct.getValueAt(row, 2).toString();
                
                String CategoryValue = TableProduct.getValueAt(row, 3).toString();
                
                String PriceValue = TableProduct.getValueAt(row, 4).toString();
                
                String CantValue = TableProduct.getValueAt(row, 5).toString();
                
                
                SGP.GetData(IDValue, NameValue, MarcValue, CategoryValue, PriceValue, CantValue);
                
                SGP.setVisible(true);
        
          Timer time = new Timer();  
      
      TimerTask Task = new TimerTask(){
      
      @Override
      
      public void run(){
          
          if(SGP.isVisible() == false){
              
               See();
          
              time.cancel();
          }
      }
      
      };
      
      time.schedule(Task, 0, 100);
    }//GEN-LAST:event_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(SectionProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionProduct().setVisible(true);
            }
        });
    }
    
    //    Encapsulamiento: Restringe el uso de estos elementos a solo esta clase.
    
        //    Abstracción: Define y declara los elementos que compondran esta clase.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackProduct;
    private javax.swing.JButton Editar;
    private javax.swing.JButton NewProduct;
    private javax.swing.JScrollPane ScrollTableProduct;
    private javax.swing.JTable TableProduct;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
        
