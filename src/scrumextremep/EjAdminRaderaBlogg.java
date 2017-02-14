/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

/**
 *
 * @author Axel D
 */
public class EjAdminRaderaBlogg extends javax.swing.JFrame {

    private String anvID;
    
    File filnamn;        
    String bild = "";
    String filpath;
    String sokvag;
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
        btn_LaggTillBild = new javax.swing.JButton();
        btn_LaggTillFil = new javax.swing.JButton();
        lbl_Fil = new javax.swing.JLabel();
        lbl_Bild = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btn_LaggTillBild.setText("Lägg till bild");
        btn_LaggTillBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaggTillBildActionPerformed(evt);
            }
        });

        btn_LaggTillFil.setText("Lägg till fil");
        btn_LaggTillFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaggTillFilActionPerformed(evt);
            }
        });

        lbl_Bild.setMaximumSize(new java.awt.Dimension(300, 180));
        lbl_Bild.setMinimumSize(new java.awt.Dimension(300, 180));
        lbl_Bild.setRequestFocusEnabled(false);

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_nyTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_LaggTillBild)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_LaggTillFil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_Fil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Bild, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnRedigera, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Bild, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nyTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LaggTillBild)
                    .addComponent(btn_LaggTillFil)
                    .addComponent(lbl_Fil))
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
        String sqlfraga = "SELECT ADMINISTRATOR FROM ANVANDARE WHERE A_ID = " + anvID;
        String admin = new String();
        try {
            admin = Databas.getDatabas().fetchSingle(sqlfraga);
            if(admin.contains("T")) {
                new RaderaBlogg(anvID).setVisible(true);
                dispose();
            }
            else {
                new InloggadSida(anvID).setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
            InloggadSida.bild(tableValue, lbl_Bild);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblBlogTitlarMouseClicked

    private void btnRedigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraActionPerformed
        if(Validering.tomtTextfalt(tf_nyTitel)
            && Validering.tomtTextfalt(tf_nyText)) {        
                redigeraInlagg();
                clearTbl();
                tf_nyText.setText("");
                tf_nyTitel.setText("");
                fetchTitlar();
        }
    }//GEN-LAST:event_btnRedigeraActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        raderaInlagg();
        clearTbl();
        tf_nyText.setText("");
        tf_nyTitel.setText("");
        fetchTitlar();
        JOptionPane.showMessageDialog(null, "Blogginlägget är raderat!");
    }//GEN-LAST:event_btnRaderaActionPerformed

    private void btn_LaggTillBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaggTillBildActionPerformed
        JFileChooser jfc = new JFileChooser(); 
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
            String bildVag = jfc.getSelectedFile().getAbsolutePath();
            ImageIcon bilden = new ImageIcon(new ImageIcon(bildVag).getImage().getScaledInstance(300, 180, Image.SCALE_DEFAULT));
            lbl_Bild.setIcon(bilden);
            
            File mappen = new File("bilder");
            sokvag = mappen.getAbsolutePath();
            filnamn = jfc.getSelectedFile();
            bild = jfc.getName(filnamn);
            filpath = filnamn.getAbsolutePath();
        } 
    }//GEN-LAST:event_btn_LaggTillBildActionPerformed

    private void btn_LaggTillFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaggTillFilActionPerformed
        oppnaChooser();
    }//GEN-LAST:event_btn_LaggTillFilActionPerformed

    private void fetchTitlar() {
        String sqlquery = "select BI_ID, BLOGGINLAGG.TITEL from BLOGGINLAGG where a_ID = " + anvID + " order by BI_ID DESC";
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
        String titel = tf_nyTitel.getText();
        String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);
        String filen = lbl_Fil.getText();
        
        try {
            
            
        
            
            String biid = Databas.getDatabas().fetchSingle("Select BI_ID from BLOGGINLAGG where TITEL = '" + tableValue + "';");
            if(!textValue.equals("") || textValue != null) {
                Databas.getDatabas().update("Update blogginlagg set text = '" +textValue+ "' where bi_id = " +biid);
            }
            if(!titel.equals("") || titel != null) {
                Databas.getDatabas().update("Update blogginlagg set titel = '" +titel+ "' where bi_id = " +biid);
            }
            if(!filen.equals("") || filen != null) {
                Databas.getDatabas().update("Update blogginlagg set fil = '" +filen+ "' where bi_id = " +biid);
            }
            if(Validering.ingenBild(biid)){
              int j = JOptionPane.showConfirmDialog(null, "Detta blogginlägg har redan en bild. Vill du byta?", "BILD", JOptionPane.YES_NO_OPTION);
              if(j==0){
              
                if(!bild.equals("") || bild != null) {
                    FileInputStream stream = new FileInputStream(filpath);
                    FileOutputStream to = new FileOutputStream(sokvag + "//" +  bild);

                    byte [] buffer = new byte[81920];
                    int byteRead;
                    while((byteRead = stream.read(buffer)) != -1) {
                    to.write(buffer,0,byteRead);
                    }
                    Databas.getDatabas().update("Update blogginlagg set bild = '" +bild+ "' where bi_id = " +biid);

                    JOptionPane.showMessageDialog(null, "Blogginlägget är redigerat!");
                }
                } else {
                  JOptionPane.showMessageDialog(null,"Inlägget är ej uppdaterad");
                }
            }
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
    public String oppnaChooser()
    {
        String stringfil = "";
        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(EjAdminRaderaBlogg.this);
    
        if(Desktop.isDesktopSupported())
        {
                 File mappen = new File("src\\scrumextremep\\resources");
                 String mappensPath = mappen.getAbsolutePath();
            
                 File filnamnet = fc.getSelectedFile();
                 String filpathen = filnamnet.getAbsolutePath();
        
                  File filen = fc.getSelectedFile();
                 stringfil = filen.getName();
         try
         {
                    FileInputStream stream = new FileInputStream(filpathen);
                    FileOutputStream to = new FileOutputStream(mappensPath + "//" +  stringfil);
                         
                            byte [] buffer = new byte[24576000];
                            int byteRead;
                            while((byteRead = stream.read(buffer)) != -1) {
                            to.write(buffer,0,byteRead);
                            System.out.println(mappensPath + stringfil);
                            lbl_Fil.setText(stringfil);
         return stringfil;
            }
            }       
         catch (FileNotFoundException ex) 
         {
                Logger.getLogger(CreateBlogg.class.getName()).log(Level.SEVERE, null, ex);
            } 
         catch (IOException ex) 
         {
                Logger.getLogger(CreateBlogg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return stringfil;
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnRedigera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btn_LaggTillBild;
    private javax.swing.JButton btn_LaggTillFil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bild;
    private javax.swing.JLabel lbl_Fil;
    private javax.swing.JTable tblBlogTitlar;
    private javax.swing.JTextField tf_nyText;
    private javax.swing.JTextField tf_nyTitel;
    // End of variables declaration//GEN-END:variables
}
