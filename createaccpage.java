/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dsafinalproject2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class createaccpage extends javax.swing.JFrame {
     //String variables for row input in clienttable
     String adname, adusername, adpassword, adcontact, adaddress;
     
     
     //ArrayList for the username values in clienttable
     ArrayList createuser;
     
     //integer value for contact textfield
     int clength;
     
     public createaccpage() {
        initComponents();
   
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createaccpage = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienttable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        backloginpage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registername = new javax.swing.JTextField();
        registerusername = new javax.swing.JTextField();
        registercontact = new javax.swing.JTextField();
        registeraddress = new javax.swing.JTextField();
        registerbutton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        registerpassword = new javax.swing.JPasswordField();
        view = new javax.swing.JButton();
        hide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spring N' Flow - Sign Up");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1322, 758));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        createaccpage.setBackground(new java.awt.Color(255, 255, 255));
        createaccpage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        clienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Contact", "Address"
            }
        ));
        clienttable.setOpaque(false);
        jScrollPane1.setViewportView(clienttable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(21, 23, 658, 663);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 6, 515, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsafinalproject2/pxfuel (2).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 760));

        createaccpage.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 0, -1, 758));

        backloginpage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        backloginpage.setText("Back");
        backloginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backloginpageActionPerformed(evt);
            }
        });
        createaccpage.add(backloginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 25, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("SIGN UP");
        createaccpage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 71, -1, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name");
        createaccpage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 132, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");
        createaccpage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 221, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");
        createaccpage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contact Number");
        createaccpage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 399, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Delivery Address");
        createaccpage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 488, -1, -1));

        registername.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        registername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registernameActionPerformed(evt);
            }
        });
        createaccpage.add(registername, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 162, 423, 47));

        registerusername.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        registerusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerusernameActionPerformed(evt);
            }
        });
        registerusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registerusernameKeyPressed(evt);
            }
        });
        createaccpage.add(registerusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 251, 423, 47));

        registercontact.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        registercontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registercontactActionPerformed(evt);
            }
        });
        registercontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registercontactKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registercontactKeyTyped(evt);
            }
        });
        createaccpage.add(registercontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 429, 423, 47));

        registeraddress.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        createaccpage.add(registeraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 518, 423, 47));

        registerbutton.setBackground(new java.awt.Color(255, 153, 51));
        registerbutton.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(255, 255, 255));
        registerbutton.setText("Register Account");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        createaccpage.add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 612, 423, 92));

        jPasswordField1.setText("jPasswordField1");
        createaccpage.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        registerpassword.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        registerpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerpasswordActionPerformed(evt);
            }
        });
        createaccpage.add(registerpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 340, 423, 47));

        view.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view.setText("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewMousePressed(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        createaccpage.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 80, 50));

        hide.setText("Hide");
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        createaccpage.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createaccpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createaccpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backloginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backloginpageActionPerformed
        
        
        //If "back" button is clicked, it will display landing page
        
        landingpage lap = new landingpage();
        lap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backloginpageActionPerformed

    
    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed

        
        
    //Registration Button
        
             adname =  registername.getText();
             adusername = registerusername.getText();
             adpassword = registerpassword.getText();
             adcontact = registercontact.getText();
             adaddress = registeraddress.getText();
             
             
    //ArrayList for the username column values in clienttable 
             
            createuser = new ArrayList();
            
            
    //It will scan username values and continues to loop until it reaches the last row of column 1(usernames) in clienttable.
            
            for(int i = 0;i<clienttable.getModel().getRowCount();i++)
            {
                createuser.add(clienttable.getModel().getValueAt(i,1)); //get the all row values at column index 0
            }
             
             
             
             
             
            
    //If any of these textfields are empty, a pop up message "Please input all fields" will appear.
            
            if (adname.isEmpty() || adusername.isEmpty() || adpassword.isEmpty() || adcontact.isEmpty() || adaddress.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input all fields", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        
            
    //If the value of adusername is already existing in the username column of clienttable, a pop up message "Username already in use" will appear.
      
            else if(createuser.contains(adusername)){

               JOptionPane.showMessageDialog(this,"Username already in use", "Try again", JOptionPane.ERROR_MESSAGE);

        
            } 
            
    // If contact number digits is not equal to 11        
            
            else if (clength != 11){
               JOptionPane.showMessageDialog(this,"Invalid contact number (11 digits)", "Try again", JOptionPane.ERROR_MESSAGE);
            }
            
            
    //If the create account details are valid it will fall down to else statement.       
            else{  
                
               
   //Getting the clienttable model to be utilized
   
            DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
            
   //Textfield values are to be inserted in the clienttable to their respective columns
   
            mod.addRow(new Object[]{adname, adusername, adpassword, adcontact, adaddress});

           registername.setText("");
           registerusername.setText("");
           registerpassword.setText("");
           registercontact.setText("");
           registeraddress.setText("");
           
    //Loginpage will show up     
           
    
           JOptionPane.showMessageDialog(this,"Registered Successfully!", "Spring N' Flow", JOptionPane.INFORMATION_MESSAGE);
           loginpage lp = new loginpage();
           lp.setVisible(true);
    
    //Closes createaccpage
           this.dispose();
            }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void registernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registernameActionPerformed
        
    }//GEN-LAST:event_registernameActionPerformed

    private void registercontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registercontactKeyTyped
 
    //Filters only numbers, Strings are declined    
        
        char num = evt.getKeyChar();
        
        if(!Character.isDigit(num)){
            evt.consume();
        }
    }//GEN-LAST:event_registercontactKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    //WHEN JFRAME FORM IS CLOSED, IT WILL SAVE TABLE AND LINKEDLISTS DATA IN "FILE.BIN"    
      
    //Getting the clienttable model to be utilized     
        
        DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
        
    //Clienttable assigned to Vector    
        
        Vector<Vector> tableData = mod.getDataVector();
        Vector<Vector> myList = mod.getDataVector();
        
        try {

    //Create and Exports "file.bin" that contains column table values in the file of the project.        
            
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
              
    //Creates and Exports "file.bin" that contains the LinkedLists values in the file of the project. 
     
            FileOutputStream fout = new FileOutputStream("file.bin");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(myList);
            
    //Writes data of clienttables
    
            output.writeObject(tableData);
            output.close();
            out.close();
            fout.close();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        

        
        
        
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           
        
    //WHEN JFRAME FORM IS OPENED, IT WILL READ TABLE AND LINKEDLISTS DATA IN "FILE.BIN"     
        
        
        try {
           
    //Imports "file.bin" that contains column table values in the file of the project.               
                 
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            
    //Imports "file.bin" that contains the LinkedLists values in the file of the project.         
            
            FileInputStream fin = new FileInputStream("file.bin");
            ObjectInputStream in = new ObjectInputStream(fin);
            
            
    // Method for deserialization of object
            
    
    //Reads "file.bin" that contains the column table values
    
            Vector<Vector> tableData = (Vector<Vector>)input.readObject();
            
            input.close();
            file.close();
            
            
    //Reads "file.bin" that contains the LinkedLists values       
            
            Vector<Vector> myList = (Vector<Vector>)in.readObject();
            in.close();
            fin.close();
            
            
    //Getting the clienttable model to be utilized          
            
            DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
            
          
    //For loop that will scan the "file.bin" on how many rows does the saved table have       
            
            for (int i = 0; i < tableData.size(); i++) {    
                Vector row = tableData.get(i);
                
                
    //Adds or copy every row indexes data to the clienttable.           
                
                mod.addRow(new Object[]{row.get(0), row.get(1), row.get(2), row.get(3), row.get(4)});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
    
    //WHEN JFRAME FORM IS LOST FOCUS, IT WILL SAVE TABLE AND LINKEDLISTS DATA IN "FILE.BIN"       

    //Getting the clienttable model to be utilized   
    
        DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
  
    //Clienttable and linkedlist data assigned to vector    
        
        Vector<Vector> tableData = mod.getDataVector();
        Vector<Vector> myList = mod.getDataVector();
       
        try {
     
    //Create and Exports "file.bin" that contains column table values in the file of the project.          
           
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
    //Create and Exports "file.bin" that contains linkedlists values in the file of the project.         
            
            FileOutputStream fout = new FileOutputStream("file.bin");
            ObjectOutputStream out = new ObjectOutputStream(fout);

     //Writes data of linkedlists values       
            out.writeObject(myList);
            
     //Writes data of clienttables
            output.writeObject(tableData);

            output.close();
            out.close();
            fout.close();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void registerusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerusernameActionPerformed

    }//GEN-LAST:event_registerusernameActionPerformed

    private void registerpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerpasswordActionPerformed
     
    }//GEN-LAST:event_registerpasswordActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
   
        

    }//GEN-LAST:event_viewActionPerformed
 
    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked

 
    }//GEN-LAST:event_viewMouseClicked

    private void viewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMousePressed
        
    
    //When View Button is pressed, the PasswordField will show characters.    
        
        view.setVisible(false);
        hide.setVisible(true);
     registerpassword.setEchoChar((char)0);
    }//GEN-LAST:event_viewMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
           
        
    //When Hide Button is pressed, the PasswordField characters will become asterisks.     
        
        view.setVisible(true);
        hide.setVisible(false);
        registerpassword.setEchoChar('*');
    }//GEN-LAST:event_hideMousePressed

    private void registercontactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registercontactKeyPressed
       
        //Assigns textfield variable
        String cnumber = registercontact.getText();
        
        //Assigns lenth int variable
        clength = cnumber.length();

        //if int lenth is less than 11 you can edit contacttextfield
        if(clength<11){
            registercontact.setEditable(true);
        }
        
        //Can edit the contacttextfield through backspace and delete
        else if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
            registercontact.setEditable(true);
        }
        
        //if int lenth is greater than 11, contacttextfield is not editable
        else{
            registercontact.setEditable(false);
        }
        
    
      
              
    }//GEN-LAST:event_registercontactKeyPressed

    private void registerusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerusernameKeyPressed
        //Assigns textfield variable
        String cnumber = registerusername.getText();
        
        //Assigns lenth int variable
        int ulength = cnumber.length();

        //if int lenth is less than 11 you can edit contacttextfield
        if(ulength<15){
            registerusername.setEditable(true);
        }
        
        //Can edit the contacttextfield through backspace and delete
        else if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
            registerusername.setEditable(true);
        }
        
        //if int lenth is greater than 11, contacttextfield is not editable
        else{
            registerusername.setEditable(false);
        }
    }//GEN-LAST:event_registerusernameKeyPressed

    private void registercontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registercontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registercontactActionPerformed
    


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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createaccpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backloginpage;
    private javax.swing.JTable clienttable;
    public javax.swing.JPanel createaccpage;
    private javax.swing.JButton hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField registeraddress;
    public javax.swing.JButton registerbutton;
    public javax.swing.JTextField registercontact;
    public javax.swing.JTextField registername;
    private javax.swing.JPasswordField registerpassword;
    public javax.swing.JTextField registerusername;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
