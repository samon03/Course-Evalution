
package Evalution;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Table extends javax.swing.JFrame {

    DefaultTableModel model;
    Object row[];
    
    
    public Table() 
    {
        initComponents();
        this.setVisible(false);
        
        model = (DefaultTableModel) jTable1.getModel();
        jTable1 = new JTable(model);
        row = new Object[6];
    }
    public void setTable(String result[])
    {
                int counter = 0;
                boolean found = false;
                for(int i = 0; i < result.length; i++)
                {
                    if(result[i] != null)
                    {
                        row[0] = Integer.toString(++counter);
                        
                        for(int m = 0; m<Cover.courseList.size(); m++)
                        {
                            if(result[i].equals(Cover.courseList.get(m).getCourseName()))
                            {
                                row[1] = Cover.courseList.get(m).getCourseCode();
                                row[3] = Cover.courseList.get(m).getCourseCredit();
                            }
                        }                        
                        row[2] = result[i];
                        model.addRow(row);       
                    } 
                   
                    
                    
                } 
                jTable1.revalidate();
                model.addRow(new String[]{"---", "---", "---", "---", "---", "---"});
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selectBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        selectTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Combination of Courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Code", "Title", "Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setDoubleBuffered(true);
        jTable1.setOpaque(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        selectBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        selectBtn.setText("Select");
        selectBtn.setMaximumSize(new java.awt.Dimension(60, 25));
        selectBtn.setMinimumSize(new java.awt.Dimension(60, 25));
        selectBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setMaximumSize(new java.awt.Dimension(60, 25));
        saveBtn.setMinimumSize(new java.awt.Dimension(60, 25));
        saveBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        backBtn.setText("Back");
        backBtn.setMaximumSize(new java.awt.Dimension(60, 25));
        backBtn.setMinimumSize(new java.awt.Dimension(60, 25));
        backBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        selectTxtField.setColumns(10);
        selectTxtField.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Select Combinalion :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        ArrayList<Courses> takenCourse = new  ArrayList<Courses>();
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

                int start = 0, end = 0;
                int counter = 0;
                int value = Integer.parseInt(selectTxtField.getText());
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                
                for(int i = 0; i< model.getRowCount(); i++)
                {
                    if(jTable1.getValueAt(i, 0).equals("1"))
                    {
                        counter += 1;
                    }
                    
                    if(counter == value)
                    {
                        start = i;
                        break;
                    }
                }
                
                for(int i = start; i<model.getRowCount(); i++)
                {
                    if(jTable1.getValueAt(i, 0).equals("---"))
                    {
                        end = i-1;
                        break;
                    }
                }
                
                System.out.println(start + " " + end);
                
                //this.setVisible(false);
                Object[] row = new Object[5];
                SelectedTable selTab = new SelectedTable();
                DefaultTableModel model2 = (DefaultTableModel) selTab.jTable2.getModel();
                for(int i = start; i <= end; i++)
                {
                    row[0] = jTable1.getValueAt(i, 0);
                    row[1] = jTable1.getValueAt(i, 1);
                    row[2] = jTable1.getValueAt(i, 2);
                    row[3] = jTable1.getValueAt(i, 3);
                    
                    model2.addRow(row);
                }
                
                selTab.jTable2.setModel(model2);
                selTab.jTable2.revalidate();
                
                
                
                
    }//GEN-LAST:event_selectBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
//       Table table = new Table();
//       table.setVisible(false);
      
//       this.hide();
       Cover cover = new Cover();
       String name = cover.nametxt.getText();
       String id = cover.idtxt.getText();
       Cover cov = new Cover(name,id);
       cov.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
       
       int index = jTable1.getSelectedRow();
       int col = jTable1.getSelectedColumn();
       
       TableModel model = jTable1.getModel();
       
       int start = index;
       String value1 = null, value2 = null, value3 = null, value4 = null;
       
       ArrayList<String[]> takenComb = null;
       
       if(evt.getSource().equals(index))
       {
           while(!jTable1.getValueAt(index, 1).equals("---"))
           {
                start++;
           }
           int end = start-1;
           
           for(int i = index; i <= end; i++)
           {
               value1 = (String) model.getValueAt(i, 0);
               value2 = (String) model.getValueAt(i, 1);
               value3 = (String) model.getValueAt(i, 2);
               value4 = (String) model.getValueAt(i, 3);
           }
           String[] combo = new  String[]{value1, value2, value3, value4};
           takenComb.add(combo);
           System.out.println(combo);
       }   
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_jTable1MouseReleased

//   
//    public static void main(String args[]) {
//       
//        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Table().setVisible(true);
//            }
//        });
//    }
    public void close() 
    {
         WindowEvent windowEve = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowEve);
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JButton saveBtn;
    public javax.swing.JButton selectBtn;
    private javax.swing.JTextField selectTxtField;
    // End of variables declaration//GEN-END:variables
}
