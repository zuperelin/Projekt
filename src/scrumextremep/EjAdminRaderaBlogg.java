/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Axel D
 */
public class EjAdminRaderaBlogg extends javax.swing.JFrame {

    private String anvID;
    /**
     * Creates new form EjAdminRaderaBlogg
     */
    public EjAdminRaderaBlogg(String anvandarID) {
        initComponents();
        anvID = anvandarID;
        setLocationRelativeTo(null);
        fetchTitlar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        tf_nyTitel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBlogTitlar = new javax.swing.JTable();
        tf_nyText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRedigera = new javax.swing.JButton();
        btnRadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 523));

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        tblBlogTitlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBlogTitlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBlogTitlarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBlogTitlar);

        jLabel1.setText("Ändra Titel");

        jLabel2.setText("Ändra Text");

        btnRedigera.setText("Redigera inlägg");
        btnRedigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraActionPerformed(evt);
            }
        });

        btnRadera.setText("Radera inlägg");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nyText, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nyTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnRedigera, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nyTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nyText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedigera, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnRadera, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new InloggadSida(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void tblBlogTitlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBlogTitlarMouseClicked

        int a = tblBlogTitlar.getSelectedRow();
        int b = tblBlogTitlar.getSelectedColumn();
        String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);

        String sqlquery = "Select TEXT from BLOGGINLAGG where TITEL = '" + tableValue + "'";
        String text = new String();
        String sqlfraga = "Select TITEL from BLOGGINLAGG where TITEL = '" + tableValue + "'";
        String titel = new String();

        try {
            text = Databas.getDatabas().fetchSingle(sqlquery);
            titel = Databas.getDatabas().fetchSingle(sqlfraga);
            tf_nyText.setText(text);
            tf_nyTitel.setText(titel);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblBlogTitlarMouseClicked

    private void btnRedigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraActionPerformed
        redigeraInlagg();
        clearTbl();
        tf_nyText.setText("");
        tf_nyTitel.setText("");
        fetchTitlar();
        JOptionPane.showMessageDialog(null, "Blogginlägget är redigerat!");
    }//GEN-LAST:event_btnRedigeraActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        raderaInlagg();
        clearTbl();
        tf_nyText.setText("");
        tf_nyTitel.setText("");
        fetchTitlar();
        JOptionPane.showMessageDialog(null, "Blogginlägget är raderat!");
    }//GEN-LAST:event_btnRaderaActionPerformed

    private void fetchTitlar() {
        String sqlquery = "select BLOGGINLAGG.TITEL from BLOGGINLAGG where a_ID = " + anvID;
        ArrayList<HashMap<String, String>> blognames = new ArrayList<>();
        DefaultTableModel dmt = (DefaultTableModel)tblBlogTitlar.getModel();
        dmt.getDataVector().removeAllElements();
        revalidate();
        try {
         blognames = Databas.getDatabas().fetchRows(sqlquery);
         
         for(int i = 0; i < blognames.size(); i++) {
             String names = blognames.get(i).get("TITEL");
             
             dmt.addRow(new Object[] {names});
                 }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     private void raderaInlagg() {
        int a = tblBlogTitlar.getSelectedRow();
        int b = tblBlogTitlar.getSelectedColumn();
        String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);
        try {
        String biid = Databas.getDatabas().fetchSingle("Select BI_ID from BLOGGINLAGG where TITEL = '" + tableValue + "';");
        Databas.getDatabas().delete("DELETE FROM BLOGGINLAGG WHERE BI_ID = " + biid + ";");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void redigeraInlagg() {
        int a = tblBlogTitlar.getSelectedRow();
        int b = tblBlogTitlar.getSelectedColumn();
        String textValue = tf_nyText.getText();
        String tableValör = tf_nyTitel.getText();
        String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);
        
        try {
            String biid = Databas.getDatabas().fetchSingle("Select BI_ID from BLOGGINLAGG where TITEL = '" + tableValue + "';");
            Databas.getDatabas().update("UPDATE BLOGGINLAGG SET TEXT = '" + textValue + "', TITEL = '" + tableValör + "' WHERE BI_ID = " + biid + ";");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void clearTbl() {
 
        DefaultTableModel dm = (DefaultTableModel) tblBlogTitlar.getModel();

        for (int i = 0; i < dm.getRowCount(); i++) {
            for (int j = 0; j < dm.getColumnCount(); j++) {
                dm.setRowCount(0);
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnRedigera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBlogTitlar;
    private javax.swing.JTextField tf_nyText;
    private javax.swing.JTextField tf_nyTitel;
    // End of variables declaration//GEN-END:variables
}
