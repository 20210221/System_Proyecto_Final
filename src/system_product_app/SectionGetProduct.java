package system_product_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Rafael De La Cruz
 */

//Herencia: Hereda Los Elementos de la Superclase javax.swing.JFrame.

public class SectionGetProduct extends javax.swing.JFrame {
    
    Database db = Database.getInstance();
        
        Connection connect = db.Conexion();
        
         SectionErr SE = SectionErr.getInstance();
        
        String Identifique = null;

    /**
     * Creates new form SectionGetProduct
     */
    public SectionGetProduct() {
        initComponents();
        
         setResizable(false);
       
       setLocationRelativeTo(null);
       
       setIconImage(new ImageIcon(getClass().getResource("/Icons/Logo.png")).getImage());
    }

   
    public void GetData(String ID,String Name, String Marc, String Category, String Price, String Cant){
        
        //        Polimorfismo: Usa una misma función para agregar diversos valores a diversos elementos.
        
        NameProduct.setText(Name);
        
        MProduct.setText(Marc);
        
        CategoryProduct.setText(Category);
        
        PriceProduct.setText(Price);
        
        CantProduct.setText(Cant);
        
        this.Identifique = ID;
        
        
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameProduct = new javax.swing.JTextField();
        MProduct = new javax.swing.JTextField();
        CategoryProduct = new javax.swing.JTextField();
        PriceProduct = new javax.swing.JTextField();
        CantProduct = new javax.swing.JTextField();
        UpdateProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DeleteProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Producto");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusable(false);
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/GetProduct.png"))); // NOI18N
        jLabel1.setText("Editar Producto");

        NameProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameProduct.setBorder(null);

        MProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MProduct.setBorder(null);

        CategoryProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CategoryProduct.setBorder(null);

        PriceProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PriceProduct.setBorder(null);

        CantProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CantProduct.setBorder(null);

        UpdateProduct.setBackground(new java.awt.Color(0, 204, 204));
        UpdateProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        UpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Update.png"))); // NOI18N
        UpdateProduct.setText("Actualizar");
        UpdateProduct.setBorder(null);
        UpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateProduct.setFocusPainted(false);
        UpdateProduct.setFocusable(false);
        UpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProductActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");

        DeleteProduct.setBackground(new java.awt.Color(0, 204, 204));
        DeleteProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DeleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        DeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        DeleteProduct.setText("Borrrar");
        DeleteProduct.setBorder(null);
        DeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteProduct.setFocusPainted(false);
        DeleteProduct.setFocusable(false);
        DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CantProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(NameProduct)
                            .addComponent(PriceProduct)
                            .addComponent(CategoryProduct)
                            .addComponent(MProduct)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(UpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CategoryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProductActionPerformed
         
         //        Polimorfismo: Usa una misma función para asignar diversos valores a diversas variables.
        
        String Name = NameProduct.getText();
				
	 String Marc = MProduct.getText();
				
	 String Category = CategoryProduct.getText();
				
	String Price = PriceProduct.getText();
				
	String Cant = CantProduct.getText();
       
       
        if(Name.equals("")|| Marc.equals("")||Category.equals("")||Price.equals("")||Cant.equals("")){
        
        SE.GetMessagerErr("Complete Todos Los Campos");
        
        SE.setVisible(true);
        
        return;
        
        }
        
        
        try {
		
				
       PreparedStatement  upd = connect.prepareStatement("UPDATE productos SET NombreProducto = '"+NameProduct.getText()+"',MarcaProducto = '"+MProduct.getText()+"',CategoriaProducto = '"+CategoryProduct.getText()+"', PrecioProducto = '"+PriceProduct.getText()+"',StockProducto = '"+CantProduct.getText()+"' WHERE idProducto = '"+this.Identifique+"'");
				
				upd.executeUpdate();
                                
                               
                                
                        }catch(SQLException ex){}
        
        
        
        
         this.setVisible(false);
        
        
    }//GEN-LAST:event_UpdateProductActionPerformed

    private void DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductActionPerformed
        
                        
                        
			 	

			try {
		
				
				PreparedStatement  dlt = connect.prepareStatement("DELETE FROM productos WHERE idProducto = '"+this.Identifique+"'");
				
				dlt.executeUpdate();
                                
                               
                                
                        }catch(SQLException ex){}
        
        
        
         this.setVisible(false);
               
         
         
    }//GEN-LAST:event_DeleteProductActionPerformed

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
            java.util.logging.Logger.getLogger(SectionGetProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionGetProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionGetProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionGetProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionGetProduct().setVisible(true);
            }
        });
    }
    
    //    Encapsulamiento: Restringe el uso de estos elementos a solo esta clase.
    
        //    Abstracción: Define y declara los elementos que compondran esta clase.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantProduct;
    private javax.swing.JTextField CategoryProduct;
    private javax.swing.JButton DeleteProduct;
    private javax.swing.JTextField MProduct;
    private javax.swing.JTextField NameProduct;
    private javax.swing.JTextField PriceProduct;
    private javax.swing.JButton UpdateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

