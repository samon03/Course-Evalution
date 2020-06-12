/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evalution;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Alien brains
 */
public class RegisterCover extends javax.swing.JFrame {

   
    public RegisterCover() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regPnl = new javax.swing.JPanel();
        userId = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();
        userIdTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(483, 350));
        setSize(new java.awt.Dimension(483, 350));

        regPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome!!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 102, 102))); // NOI18N
        regPnl.setAlignmentX(1.0F);
        regPnl.setAlignmentY(1.0F);
        regPnl.setPreferredSize(new java.awt.Dimension(380, 200));

        userId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userId.setText("Student Id :");

        password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        password.setText("Password :");

        loginBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setPreferredSize(new java.awt.Dimension(82, 23));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        regBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regBtn.setText("Register");
        regBtn.setPreferredSize(new java.awt.Dimension(82, 23));
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        userIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdTxtActionPerformed(evt);
            }
        });

        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Name :");

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Only required for Registration...");
        jTextField1.setToolTipText("");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout regPnlLayout = new javax.swing.GroupLayout(regPnl);
        regPnl.setLayout(regPnlLayout);
        regPnlLayout.setHorizontalGroup(
            regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(regPnlLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userIdTxt)
                    .addComponent(passTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        regPnlLayout.setVerticalGroup(
            regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId)
                    .addComponent(userIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(regPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void userIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdTxtActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        
        String name = jTextField1.getText();
        String id = userIdTxt.getText();
        String pass = passTxt.getText();
        
        try{
            
            if(name != null && id != null && pass != null)
            {
                Student obj= new Student(name, id, pass, 0.0, 1, 0);
                
                FileOutputStream fileOut = new FileOutputStream(new File(id+".save"));
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOut);
                objectOutput.writeObject(obj);
                objectOutput.flush();

                JOptionPane.showMessageDialog(null, "Registration Done!!");
                
                userIdTxt.setText("");
                passTxt.setText("");
                jTextField1.setText("Only required for Registration...");
                jTextField1.setForeground(new Color(153,153,153));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_regBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
//        this.hide();
        
        try
        {
            File isThere = new File(userIdTxt.getText()+".save");
            if(isThere.exists())
            {
                try{
                    FileInputStream input = new FileInputStream(new File(userIdTxt.getText()+ ".save"));
                    ObjectInputStream inputObject = new ObjectInputStream(input);

                    Object ob = inputObject.readObject();
                    Student obj = (Student) ob;
                    System.out.println(obj.getName());
                    System.out.println(obj.getId());
                    Cover cov = new Cover(obj.getName(), obj.getId());
                    cov.setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User does not Exist !!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Only required for Registration..."))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0, 0, 0));
        }
        
    }//GEN-LAST:event_jTextField1MousePressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Only required for Registration..."))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCover().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passTxt;
    private javax.swing.JLabel password;
    private javax.swing.JButton regBtn;
    private javax.swing.JPanel regPnl;
    private javax.swing.JLabel userId;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables

    public void close() 
    {
         WindowEvent windowEve = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowEve);
    }  



}
