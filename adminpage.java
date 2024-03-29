/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dsafinalproject2;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;





public class adminpage extends javax.swing.JFrame {
    
 
    //String variables initialization
    String adname, adusername, adpassword, adcontact, adaddress, cnumber;
    //ArrayList variable initialization
    ArrayList admincuser;
    
    //integer variable for contact textfield
    int clength;
    public adminpage() {
        initComponents();
        
        //clienttable Row Sorter
         clienttable.setAutoCreateRowSorter(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        nameadmin = new javax.swing.JTextField();
        usernameadmin = new javax.swing.JTextField();
        contactadmin = new javax.swing.JTextField();
        addressadmin = new javax.swing.JTextField();
        javax.swing.JButton adminupdate = new javax.swing.JButton();
        passwordadmin = new javax.swing.JPasswordField();
        javax.swing.JButton adminclear = new javax.swing.JButton();
        javax.swing.JButton admincreate = new javax.swing.JButton();
        view = new javax.swing.JButton();
        hide = new javax.swing.JButton();
        javax.swing.JButton backtologin = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        clienttable = new javax.swing.JTable();
        javax.swing.JButton admindelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        searchfield = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spring N' Flow - Administrator");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1322, 758));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1322, 758));
        jPanel1.setMinimumSize(new java.awt.Dimension(1322, 758));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Client Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, 444, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 228, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 311, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Delivery Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 394, -1, -1));

        nameadmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        nameadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameadminActionPerformed(evt);
            }
        });
        jPanel3.add(nameadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 450, 47));

        usernameadmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        usernameadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameadminKeyPressed(evt);
            }
        });
        jPanel3.add(usernameadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, 450, 47));

        contactadmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        contactadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactadminActionPerformed(evt);
            }
        });
        contactadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactadminKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactadminKeyTyped(evt);
            }
        });
        jPanel3.add(contactadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 341, 450, 47));

        addressadmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        addressadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(addressadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 424, 450, 47));

        adminupdate.setBackground(new java.awt.Color(255, 153, 51));
        adminupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminupdate.setForeground(new java.awt.Color(255, 255, 255));
        adminupdate.setText("UPDATE");
        adminupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminupdateActionPerformed(evt);
            }
        });
        jPanel3.add(adminupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 515, 135, 62));

        passwordadmin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        passwordadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(passwordadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 440, 47));

        adminclear.setBackground(new java.awt.Color(153, 51, 0));
        adminclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminclear.setForeground(new java.awt.Color(255, 255, 255));
        adminclear.setText("CLEAR");
        adminclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminclearActionPerformed(evt);
            }
        });
        jPanel3.add(adminclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 515, 130, 62));

        admincreate.setBackground(new java.awt.Color(51, 204, 0));
        admincreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admincreate.setForeground(new java.awt.Color(255, 255, 255));
        admincreate.setText("CREATE");
        admincreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admincreateActionPerformed(evt);
            }
        });
        jPanel3.add(admincreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 515, 135, 62));

        view.setText("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewMousePressed(evt);
            }
        });
        jPanel3.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 90, 30));

        hide.setText("Hide");
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        jPanel3.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 90, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 460, 630));

        backtologin.setBackground(new java.awt.Color(153, 153, 153));
        backtologin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        backtologin.setText("Back");
        backtologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtologinActionPerformed(evt);
            }
        });
        jPanel2.add(backtologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, -1));

        clienttable.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        clienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Contact", "Delivery Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clienttable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 726, 480));

        admindelete.setBackground(new java.awt.Color(204, 0, 0));
        admindelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admindelete.setForeground(new java.awt.Color(255, 255, 255));
        admindelete.setText("DELETE");
        admindelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 0, true));
        admindelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admindeleteActionPerformed(evt);
            }
        });
        jPanel2.add(admindelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 726, 70));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 153, 51))); // NOI18N

        searchfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchfieldMouseClicked(evt);
            }
        });
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 450, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Order History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 254, 77));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Administrator");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsafinalproject2/pxfuel (4).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 760));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1322, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backtologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtologinActionPerformed
        
        
        //Shows Login page and dispose adminpage
        loginpage lp = new loginpage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backtologinActionPerformed

    private void admindeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admindeleteActionPerformed

        
        
        //int variable for clienttable selected row
        int row = clienttable.getSelectedRow();
        
        
        //Settext for account details textfields
            nameadmin.setText("");
            usernameadmin.setText("");
            passwordadmin.setText("");
            contactadmin.setText("");
            addressadmin.setText("");
            
            
        //If no row is selected or existing in the cliettable    
        if (row < 0) {
              JOptionPane.showMessageDialog(this,"Empty Row", "Select Row", JOptionPane.ERROR_MESSAGE);
          
        }
       
        //Deletes selected row in clienttable
        else{
            
            int p =  JOptionPane.showConfirmDialog(null, "Do you really want to delete account", "Delete",JOptionPane.YES_NO_OPTION);

            if(p == 0){
                     DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
            mod.removeRow(row);
            JOptionPane.showMessageDialog(this,"Account Deleted", "Info", JOptionPane.INFORMATION_MESSAGE);

            }
       
        }
 

    }//GEN-LAST:event_admindeleteActionPerformed

    private void nameadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadminActionPerformed

    private void admincreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admincreateActionPerformed

        
        
            //ArrayList values of username column in clienttable
            admincuser = new ArrayList();
            for(int i = 0;i<clienttable.getModel().getRowCount();i++)
            {
                //Adds data to admincuser arraylist, getting values of column 1 in clienttable
                admincuser.add(clienttable.getModel().getValueAt(i,1)); //get the all row values at column index 0
            }
        
        
        
        
        //Gets string values of Account details textfields
            
        adname = nameadmin.getText();
        adusername = usernameadmin.getText();
        adpassword = passwordadmin.getText();
        adcontact = contactadmin.getText();
        adaddress = addressadmin.getText();
        
        
        
        //If any of textfields are empty it will popup an error message
        
        if (adname.isEmpty() || adusername.isEmpty() || adpassword.isEmpty() || adcontact.isEmpty() || adaddress.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input all fields", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        
        //If the admincuser ArrayList does contain the Textfield value of adusername
              else if(admincuser.contains(adusername)){

        // A popup message will show saying "Username already in use"          
               JOptionPane.showMessageDialog(this,"Username already in use", "Try again", JOptionPane.ERROR_MESSAGE); 
        
        //If the adusername is a unique username it will add values along the other Textfields to the table      
              } 
              
                       
            // If contact number digits is not equal to 11        
            
            else if (adcontact.length() != 11){
               JOptionPane.showMessageDialog(this,"Invalid contact number (11 digits)", "Try again", JOptionPane.ERROR_MESSAGE);
            }      
            
              else{
            DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
            mod.addRow(new Object[]{adname, adusername, adpassword, adcontact, adaddress});
            
            nameadmin.setText("");
            usernameadmin.setText("");
            passwordadmin.setText("");
            contactadmin.setText("");
            addressadmin.setText("");
        }
        
     
            
            
    }//GEN-LAST:event_admincreateActionPerformed

    private void adminclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminclearActionPerformed
        
        //It will clear texts in textfields
        
            nameadmin.setText("");
            usernameadmin.setText("");
            passwordadmin.setText("");
            contactadmin.setText("");
            addressadmin.setText("");
    }//GEN-LAST:event_adminclearActionPerformed

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

    private void adminupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminupdateActionPerformed

        //Getting the clienttable model to be utilized   
        DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
        
        //String variables for getting the values of TextFields
        String name = nameadmin.getText();
        String user = usernameadmin.getText();
        String pass = passwordadmin.getText();
        String contact = contactadmin.getText();
        String address = addressadmin.getText();
        
        
        int upcontact = contact.length();
        
       //If any of these textfields are Empty it will show a pop up message "Please input all fields"
       
       if (name.isEmpty() || user.isEmpty() || pass.isEmpty() || contact.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input all fields", "Try again", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_adminupdateActionPerformed
          
       //If updated contact is not equal to 11
       
       else if (upcontact != 11){
               JOptionPane.showMessageDialog(this,"Invalid contact number (11 digits)", "Try again", JOptionPane.ERROR_MESSAGE);
            }  
       //If there is chosen/selected row
       else if(clienttable.getSelectedRowCount()== 1){
         
        //It will set the updated values from Textfields back to its original row Columns
        mod.setValueAt(name, clienttable.getSelectedRow(), 0);
        mod.setValueAt(user, clienttable.getSelectedRow(), 1);
        mod.setValueAt(pass, clienttable.getSelectedRow(), 2);
        mod.setValueAt(contact, clienttable.getSelectedRow(), 3);
        mod.setValueAt(address, clienttable.getSelectedRow(), 4);
        
         JOptionPane.showMessageDialog(this,"Updated Successfully", "Update", JOptionPane.INFORMATION_MESSAGE);
            
  
        }

        
       //If there is no row existing in the clienttable
        else {
            if(clienttable.getRowCount() == 0 ){
                JOptionPane.showMessageDialog(this,"Table is Empty", "Try again", JOptionPane.ERROR_MESSAGE);
            }
   
            

        //If the user don't selected a existing row    
            else{
                JOptionPane.showMessageDialog(this,"Please Select a Row", "Try again", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        

    }

    
    private void clienttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienttableMouseClicked
         
        
        //Getting the clienttable model to be utilized   
        DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
        
         //It will get values from Selected row columns
        String clickname = mod.getValueAt(clienttable.getSelectedRow(), 0). toString();
        String clickuser = mod.getValueAt(clienttable.getSelectedRow(), 1). toString();
        String clickpass = mod.getValueAt(clienttable.getSelectedRow(), 2). toString();
        String clickcontact = mod.getValueAt(clienttable.getSelectedRow(), 3). toString();
        String clickaddress = mod.getValueAt(clienttable.getSelectedRow(), 4). toString();
        
        //SetTexts the Textfields from the values got in the selected row columns
          nameadmin.setText(clickname);
          usernameadmin.setText(clickuser);
          passwordadmin.setText(clickpass);
          contactadmin.setText(clickcontact);
          addressadmin.setText(clickaddress);
    }//GEN-LAST:event_clienttableMouseClicked

    private void contactadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactadminActionPerformed
        
    }//GEN-LAST:event_contactadminActionPerformed

    private void contactadminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactadminKeyTyped
        
        //When a String is entered in your keyboard it will decline, but when an integer is typed it will show in Contact Textfield
        
        char num = evt.getKeyChar();
        
        if(!Character.isDigit(num)){
            evt.consume();
        }
        
  
        
    }//GEN-LAST:event_contactadminKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

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

    private void viewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMousePressed
      
        //When View Button is pressed, the PasswordField will show characters.    

        view.setVisible(false);
        hide.setVisible(true);
        passwordadmin.setEchoChar((char)0);
    }//GEN-LAST:event_viewMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
      
        //When Hide Button is pressed, the PasswordField characters will become asterisks.  
        
        view.setVisible(true);
        hide.setVisible(false);
        passwordadmin.setEchoChar('*');
    }//GEN-LAST:event_hideMousePressed

    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased

         //Getting the clienttable model to be utilized  
         
        DefaultTableModel mod = (DefaultTableModel) clienttable.getModel();
        
        //RowTable Sort initialize variable
        TableRowSorter<DefaultTableModel> objl = new TableRowSorter<>(mod);
        
        //Sets Rowsorter for clienttable
        clienttable.setRowSorter(objl);
        
        //It gets very Text being Released or typed by the user in the searchfield
        objl.setRowFilter(RowFilter.regexFilter(searchfield.getText()));
        
    }//GEN-LAST:event_searchfieldKeyReleased

    private void searchfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyPressed

    }//GEN-LAST:event_searchfieldKeyPressed

    private void searchfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfieldMouseClicked
      
    }//GEN-LAST:event_searchfieldMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //When view order history is clicked it will show orderlog history
        
        new orderlog().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void contactadminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactadminKeyPressed
        
        //Assigns textfield variable
        cnumber = contactadmin.getText();
        
        //Assigns lenth int variable
        clength = cnumber.length();

        //if int lenth is less than 11 you can edit contacttextfield
        if(clength<11){
            contactadmin.setEditable(true);
        }
        
        //Can edit the contacttextfield through backspace and delete
        else if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
            contactadmin.setEditable(true);
        }
        
        //if int lenth is greater than 11, contacttextfield is not editable
        else{
            contactadmin.setEditable(false);
        }
    }//GEN-LAST:event_contactadminKeyPressed

    private void usernameadminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameadminKeyPressed
        

        //Assigns textfield variable
        String cnumber = usernameadmin.getText();
        
        //Assigns lenth int variable
        int length = cnumber.length();

        //if int lenth is less than 11 you can edit contacttextfield
        if(length<15){
            usernameadmin.setEditable(true);
        }
        
        //Can edit the contacttextfield through backspace and delete
        else if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
            usernameadmin.setEditable(true);
        }
        
        //if int lenth is greater than 11, contacttextfield is not editable
        else{
            usernameadmin.setEditable(false);
        }
    }//GEN-LAST:event_usernameadminKeyPressed

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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressadmin;
    private static javax.swing.JTable clienttable;
    public javax.swing.JTextField contactadmin;
    private javax.swing.JButton hide;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField nameadmin;
    private javax.swing.JPasswordField passwordadmin;
    private javax.swing.JTextField searchfield;
    public javax.swing.JTextField usernameadmin;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
