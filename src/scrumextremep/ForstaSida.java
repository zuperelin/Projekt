/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

/**
 *
 * @author Axel D
 */
public class ForstaSida extends javax.swing.JFrame {

    private String anvID;
    /**
     * Creates new form Startsida
     */
    public ForstaSida() {
        initComponents();
        fetchBlognamesInformell();
        lbl_anvnamn.setForeground(Color.BLACK);
        lbl_losenord.setForeground(Color.BLACK);
        informellFlode();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new java.awt.Label();
        lbl_anvnamn = new javax.swing.JLabel();
        lbl_losenord = new javax.swing.JLabel();
        txt_anvnamn = new javax.swing.JTextField();
        txt_losenord = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        spBlogFlow = new javax.swing.JScrollPane();
        taBlogFlow = new javax.swing.JTextArea();
        spBlogTitlar = new javax.swing.JScrollPane();
        tblBlogTitlar = new javax.swing.JTable();
        btn_oppnaFil = new javax.swing.JButton();
        lblBakgrundVit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(790, 623));
        getContentPane().setLayout(null);

        lblRubrik.setAlignment(java.awt.Label.CENTER);
        lblRubrik.setBackground(new java.awt.Color(255, 255, 255));
        lblRubrik.setFont(new java.awt.Font("Impact", 0, 52)); // NOI18N
        lblRubrik.setText("Informatikblogg");
        getContentPane().add(lblRubrik);
        lblRubrik.setBounds(100, 20, 480, 120);

        lbl_anvnamn.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lbl_anvnamn.setText("Användarnamn");
        getContentPane().add(lbl_anvnamn);
        lbl_anvnamn.setBounds(600, 30, 150, 22);

        lbl_losenord.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lbl_losenord.setText("Lösenord");
        getContentPane().add(lbl_losenord);
        lbl_losenord.setBounds(600, 80, 120, 22);

        txt_anvnamn.setRequestFocusEnabled(true);
        txt_anvnamn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_anvnamnFocusGained(evt);
            }
        });
        getContentPane().add(txt_anvnamn);
        txt_anvnamn.setBounds(600, 50, 160, 30);

        txt_losenord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_losenordFocusGained(evt);
            }
        });
        getContentPane().add(txt_losenord);
        txt_losenord.setBounds(600, 100, 160, 30);

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoggaIn);
        btnLoggaIn.setBounds(670, 140, 90, 23);

        taBlogFlow.setEditable(false);
        taBlogFlow.setColumns(20);
        taBlogFlow.setLineWrap(true);
        taBlogFlow.setRows(5);
        taBlogFlow.setWrapStyleWord(true);
        spBlogFlow.setViewportView(taBlogFlow);

        getContentPane().add(spBlogFlow);
        spBlogFlow.setBounds(20, 210, 510, 360);

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
        spBlogTitlar.setViewportView(tblBlogTitlar);
        if (tblBlogTitlar.getColumnModel().getColumnCount() > 0) {
            tblBlogTitlar.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(spBlogTitlar);
        spBlogTitlar.setBounds(560, 210, 210, 360);

        btn_oppnaFil.setText("Öppna fil");
        btn_oppnaFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oppnaFilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_oppnaFil);
        btn_oppnaFil.setBounds(20, 170, 100, 23);

        lblBakgrundVit.setBackground(java.awt.Color.white);
        lblBakgrundVit.setForeground(new java.awt.Color(255, 255, 255));
        lblBakgrundVit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scrumextremep/Namnlös.jpg"))); // NOI18N
        lblBakgrundVit.setText("jLabel1");
        getContentPane().add(lblBakgrundVit);
        lblBakgrundVit.setBounds(0, 0, 790, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed

        if(Validering.tomtTextfalt(txt_anvnamn) && Validering.tomtTextfalt(txt_losenord)){
            logInCheck();
        }
        
    }//GEN-LAST:event_btnLoggaInActionPerformed
    
    private void tblBlogTitlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBlogTitlarMouseClicked
        hamtaVarden();
    }//GEN-LAST:event_tblBlogTitlarMouseClicked

    private void txt_anvnamnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_anvnamnFocusGained
        txt_anvnamn.setText("");
    }//GEN-LAST:event_txt_anvnamnFocusGained

    private void txt_losenordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_losenordFocusGained
        txt_losenord.setText("");
    }//GEN-LAST:event_txt_losenordFocusGained

    private void btn_oppnaFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oppnaFilActionPerformed
        if(Desktop.isDesktopSupported())
        {

            File mappen = new File("src\\scrumextremep\\resources");
            String sokvag = mappen.getAbsolutePath();

            int a = tblBlogTitlar.getSelectedRow();
            int b = tblBlogTitlar.getSelectedColumn();
            String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);

            String sql = "SELECT FIL FROM BLOGGINLAGG WHERE TITEL ='" + tableValue + "'";

            try
            {
                String hej = Databas.getDatabas().fetchSingle(sql);
                String path = sokvag + "//" + hej;
                File myFile = new File(path);
                Desktop.getDesktop().open(myFile);
            }

            catch(IOException ex)
            {
                System.out.println(ex);
            }
            catch (InfException ex)
            {
                Logger.getLogger(ForstaSida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_oppnaFilActionPerformed
  
    private void fetchBlognamesInformell() {
        String sqlquery = "select BI_ID, blogginlagg.titel from blogginlagg where b_id = (select b_id from blogg where bloggnamn = 'Informell') order by BI_ID DESC";
        ArrayList<HashMap<String, String>> blognames = new ArrayList<>();
        try {
         blognames = Databas.getDatabas().fetchRows(sqlquery);
         
         for(int i = 0; i < blognames.size(); i++) {
             String names = blognames.get(i).get("TITEL");
             
             DefaultTableModel dmt = (DefaultTableModel)tblBlogTitlar.getModel();
             
             dmt.addRow(new Object[] {names});
                 }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     private void logInCheck() {
        try { // Code below gets the username and password from the database.
            String anvName = txt_anvnamn.getText();
            String sqlqueryAID = "Select A_ID FROM ANVANDARE WHERE ANVNAMN = '" + anvName + "'";
            anvID = Databas.getDatabas().fetchSingle(sqlqueryAID);
            String sqlqueryPass = "SELECT LOSENORD FROM ANVANDARE WHERE A_ID = " + anvID;
            String passwordUser = Databas.getDatabas().fetchSingle(sqlqueryPass);
            char[] triedPassword = txt_losenord.getPassword();
            String matchPassword = new String(triedPassword);

            if (passwordUser != null) { // If password exists
                if (passwordUser.equals(matchPassword)) { // and matches inserted password
                    this.dispose();
                    new InloggadSida(anvID).setVisible(true);               
                } else {
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord!");
                }
            } 
                else {
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord!");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     
    private void hamtaVarden() {
        taBlogFlow.removeAll();
        int a = tblBlogTitlar.getSelectedRow();
        int b = tblBlogTitlar.getSelectedColumn();
        String tableValue = (String) tblBlogTitlar.getModel().getValueAt(a, b);
        
        String sqlquery = "Select TEXT from BLOGGINLAGG where TITEL = '" + tableValue + "'";
        String titel = new String();
        
        try {
            titel = Databas.getDatabas().fetchSingle(sqlquery);
            
            
                taBlogFlow.setText(titel);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
     
     private void hamtaSenaste() {
         String sqlfraga = "SELECT TEXT FROM BLOGGINLAGG ORDER BY BI_ID DESC";
         String text = new String();
         try {
             text = Databas.getDatabas().fetchSingle(sqlfraga);
             taBlogFlow.setText(text);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }
     
     private void informellFlode() 
     {
        String sqlquery = "SELECT BLOGGINLAGG.TITEL, BLOGGINLAGG.TEXT FROM BLOGG JOIN BLOGGINLAGG ON BLOGG.B_ID = BLOGGINLAGG.B_ID WHERE BLOGG.BLOGGNAMN = 'Informell'";
        ArrayList<HashMap<String, String>> informell = new ArrayList<>();
        try {
         informell = Databas.getDatabas().fetchRows(sqlquery);
         
         for(int i = 0; i < informell.size(); i++) {
             String text = informell.get(i).get("TEXT");
             taBlogFlow.append(text +"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
                              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btn_oppnaFil;
    private javax.swing.JLabel lblBakgrundVit;
    private java.awt.Label lblRubrik;
    private javax.swing.JLabel lbl_anvnamn;
    private javax.swing.JLabel lbl_losenord;
    private javax.swing.JScrollPane spBlogFlow;
    private javax.swing.JScrollPane spBlogTitlar;
    private javax.swing.JTextArea taBlogFlow;
    private javax.swing.JTable tblBlogTitlar;
    private javax.swing.JTextField txt_anvnamn;
    private javax.swing.JPasswordField txt_losenord;
    // End of variables declaration//GEN-END:variables
}
