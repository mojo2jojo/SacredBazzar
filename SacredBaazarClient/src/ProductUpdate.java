
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ProductUpdate extends javax.swing.JFrame {

    /**
     * Creates new form ProductUpdate
     */
    
    private Socket sc;
    private DataOutputStream out=null;
    private DataInputStream in=null;
    
    public ProductUpdate() {
        initComponents();
    }

    public ProductUpdate(Socket sc)
    {
        //My defined constructor definition 
        initComponents();
        this.sc=sc;
        try {
            
            out = new DataOutputStream(sc.getOutputStream());
            in=new DataInputStream(sc.getInputStream());
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error in ProductUpdate Constuctor");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        cb11 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t10 = new javax.swing.JTextArea();
        mydate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Warranty");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 644, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Extra Feature");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 568, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 56, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 96, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Image");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Brand");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 267, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date Of Manufacturing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 336, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Size");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 297, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Offer");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 377, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Offer Discount(%)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 418, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Author");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 452, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Colour");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 500, -1, -1));
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 638, 220, -1));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 455, 220, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 420, 220, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 140, 220, -1));

        cb11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics", "Clothing", "Footwear", "Watches", "Stationary", "Other" }));
        cb11.setName(""); // NOI18N
        cb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb11ActionPerformed(evt);
            }
        });
        getContentPane().add(cb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 96, 220, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile", "Electronic equipment", "Computer equipment", "T Shirts", "Jeans", "Shirt", "Hoodie", "Sports Shoes", "Sneakers", "Running Shoes", "Loafers", "Formal Shoes", "Digital watch", "Analog watch", "Smart watch", "Notebooks", "Pen ", "Bag", "Books", "Other" }));
        cb2.setName(""); // NOI18N
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 96, 220, -1));

        jButton1.setText("CHOOSE IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 219, -1, -1));

        cb1.setText("Applicable");
        cb1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cb1StateChanged(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 377, -1, -1));

        jButton2.setText(" Back To Welcome page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 409, 220, -1));

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 502, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Your Email Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 16, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 13, 220, -1));

        jButton4.setText("Back to your Account");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 345, 220, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 262, 220, -1));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 297, 220, -1));
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 500, 220, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 53, 220, -1));

        t10.setColumns(20);
        t10.setRows(5);
        jScrollPane1.setViewportView(t10);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 540, 220, 66));
        getContentPane().add(mydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 337, 207, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 185, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 179, 220, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacredbaazar/ProductUpdate.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Welcome obj=new Welcome();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //To go to RetailerAccount page
        RetailerAccount obj=new RetailerAccount(sc);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //TO Add Product 
        String email=t1.getText();
        String qty=t2.getText();
        String pname=t3.getText();
        String type1=(String)cb11.getSelectedItem();
        String type2=(String)cb2.getSelectedItem();
        String price=t4.getText();
        String brand=t5.getText();
        String size=t6.getText();
        String offerdisc=t7.getText();
        String author=t8.getText();
        String colour=t9.getText();
        String features=t10.getText();
        String warranty=t11.getText();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");//date
        String date = dcn.format(mydate.getDate() );//date
        
        try {
            
            out.writeUTF("req@product");//My request to Server
            out.writeUTF(email);
            out.writeUTF(pname);
            out.writeUTF(type1);
            out.writeUTF(type2);
            out.writeUTF(price);
            out.writeUTF(qty);
            out.writeUTF(fpath);
            out.writeUTF(brand);
            out.writeUTF(size);
            out.writeUTF(date);
            out.writeUTF(offerdisc);
            out.writeUTF(author);
            out.writeUTF(colour);
            out.writeUTF(features);
            out.writeUTF(warranty);
            try{
                OutputStream outputStream = sc.getOutputStream();
                BufferedImage image = ImageIO.read(new File(fpath));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", byteArrayOutputStream);
                byte[] siz = ByteBuffer.allocate(1000).putInt(byteArrayOutputStream.size()).array();
                outputStream.write(siz);
                outputStream.write(byteArrayOutputStream.toByteArray());
               // outputStream.flush();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in Sending Image");
            }
            String status=in.readUTF();//Server's Response
            if(status.equals("success"))
            {
                JOptionPane.showMessageDialog(null,"PRODUCT SUCCESFULLY ADDED");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error in Status");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error in Addition of product");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cb1StateChanged
        {
            //getting whether there is an offer or not
            String offer;
            if(cb1.isSelected())
            {
                offer="1";
                t7.setEditable(true);
            }
            else
            {
                offer="0";
                t7.setEditable(false);
            }
        }
    }//GEN-LAST:event_cb1StateChanged
    //private File file;
    private String fpath;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //To select Picture from Location in my System
            
        JFileChooser jf=new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jf.showDialog(this,"Select Image");
        File file=jf.getSelectedFile();//Path of Selected Image
        if(file!=null)
        {
            fpath = (String)file.getAbsolutePath();
            System.out.println("Path to the Selected file : "+fpath);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb11ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JComboBox<String> cb11;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser mydate;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
