
package  Evalution;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cover extends javax.swing.JFrame {

    public static ArrayList<Courses> courseList = null;

    String name, id;
    
     public Cover()
     {
        initComponents();
        idtxt.setText(id);
        nametxt.setText(name);
       
     }
    
    public Cover(String name, String id) {
        
        initComponents();
        this.name = name;
        this.id = id;
        idtxt.setText(id);
        nametxt.setText(name);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        semesterlbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        takenlbl = new javax.swing.JLabel();
        takentxt = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        semestertxt = new javax.swing.JTextField();
        cgpalbl = new javax.swing.JLabel();
        cgpatxt = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI Light", 1, 11), new java.awt.Color(51, 255, 153)), "Student Informision", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI Light", 1, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("Informision"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 390));

        namelbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        namelbl.setText("Name :");

        nametxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        idtxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        semesterlbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        semesterlbl.setText("Semester :");

        idlbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idlbl.setText("ID :");

        enterButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        enterButton.setText("Enter");
        enterButton.setMaximumSize(new java.awt.Dimension(53, 23));
        enterButton.setMinimumSize(new java.awt.Dimension(53, 23));
        enterButton.setPreferredSize(new java.awt.Dimension(53, 23));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        takenlbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        takenlbl.setText("Take Credit :");

        takentxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        takentxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takentxtActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        semestertxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        semestertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestertxtActionPerformed(evt);
            }
        });

        cgpalbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cgpalbl.setText("Cgpa :");

        cgpatxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semesterlbl)
                    .addComponent(cgpalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takenlbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cgpatxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(nametxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgpatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgpalbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takenlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(takentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
       
    }//GEN-LAST:event_nametxtActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
      
    }//GEN-LAST:event_idtxtActionPerformed

    private void semestertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestertxtActionPerformed

    private void takentxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takentxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takentxtActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed

        courseList = new ArrayList<>();

        String courseCode;
        String courseName;
        double courseCredit;
        String prefferedSem;
        String preRequisite;

        String semester = semestertxt.getText();

        try {
            
            if (new File(semester + ".txt").exists()) {
                FileReader fread = new FileReader(semester + ".txt");
                BufferedReader bread = new BufferedReader(fread);
                String line = bread.readLine();
                while (line != null) 
                {
                    String[] splitCourse = line.split(",");

                    courseCode = splitCourse[0];
                    courseName = splitCourse[1];
                    courseCredit = Double.parseDouble(splitCourse[2]);
                    prefferedSem = splitCourse[3];
                    preRequisite = splitCourse[4];

                    Courses courseObj = new Courses(courseCode, courseName, courseCredit, prefferedSem, preRequisite);
                    courseList.add(courseObj);
                    line = bread.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        close();
        
        new CourseSerialList(takentxt.getText());
        
    }//GEN-LAST:event_enterButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            close();      
    }//GEN-LAST:event_backButtonActionPerformed
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButton;
    public javax.swing.JLabel cgpalbl;
    public javax.swing.JTextField cgpatxt;
    public javax.swing.JButton enterButton;
    public javax.swing.JLabel idlbl;
    public javax.swing.JTextField idtxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel namelbl;
    public javax.swing.JTextField nametxt;
    public javax.swing.JLabel semesterlbl;
    public javax.swing.JTextField semestertxt;
    public javax.swing.JLabel takenlbl;
    public javax.swing.JTextField takentxt;
    // End of variables declaration//GEN-END:variables

    public void close() 
    {
         WindowEvent windowEve = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowEve);
    }  
}
