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
public class AccepteraMotesforslag extends javax.swing.JFrame {

    private String anvID;
     
    public AccepteraMotesforslag(String anvandarID) {
        initComponents();
        anvID = anvandarID;
        fyllMotesforslag();
        fyllTabell();
        setLocationRelativeTo(null);
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
        cbValjMotesforslag = new javax.swing.JComboBox<>();
        cbValjDatum = new javax.swing.JComboBox<>();
        cbValjTid = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_valdaMotesforslag = new javax.swing.JTable();
        btn_laggTillMig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(818, 557));

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbValjMotesforslag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Mötesförslag" }));
        cbValjMotesforslag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjMotesforslagActionPerformed(evt);
            }
        });

        cbValjDatum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Datum" }));
        cbValjDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjDatumActionPerformed(evt);
            }
        });

        cbValjTid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Tid" }));
        cbValjTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjTidActionPerformed(evt);
            }
        });

        tbl_valdaMotesforslag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titel", "Datum", "Tid"
            }
        ));
        tbl_valdaMotesforslag.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_valdaMotesforslag);
        if (tbl_valdaMotesforslag.getColumnModel().getColumnCount() > 0) {
            tbl_valdaMotesforslag.getColumnModel().getColumn(0).setResizable(false);
            tbl_valdaMotesforslag.getColumnModel().getColumn(1).setResizable(false);
            tbl_valdaMotesforslag.getColumnModel().getColumn(2).setResizable(false);
        }

        btn_laggTillMig.setText("Lägg till mig");
        btn_laggTillMig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laggTillMigActionPerformed(evt);
            }
        });

        jLabel1.setText("Vilka tider du accepterat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbValjMotesforslag, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_laggTillMig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbValjDatum, 0, 149, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(cbValjTid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbValjMotesforslag, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjTid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btn_laggTillMig, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new Calendar(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbValjMotesforslagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjMotesforslagActionPerformed
        try{
            cbValjDatum.removeAllItems();
            String get = cbValjMotesforslag.getSelectedItem().toString();
            String sql = "SELECT DATUM FROM MFTIDDATUM JOIN MOTESFORSLAG ON MOTESFORSLAG.MF_ID = MFTIDDATUM.MF_ID WHERE TITEL = '" + get + "'";

            ArrayList<HashMap<String, String>> datum = Databas.getDatabas().fetchRows(sql);
            for (int i = 0; i < datum.size(); i++){
                cbValjDatum.addItem(datum.get(i).get("DATUM"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_cbValjMotesforslagActionPerformed

    private void cbValjDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjDatumActionPerformed
        try{
            cbValjTid.removeAllItems();
            String getDatum = cbValjDatum.getSelectedItem().toString();
            String getTitle = cbValjMotesforslag.getSelectedItem().toString();
            String fyll = "SELECT TID FROM MFTIDDATUM WHERE DATUM = '" + getDatum + "' AND MF_ID = (SELECT MF_ID FROM MOTESFORSLAG WHERE TITEL = '" + getTitle + "')";
            ArrayList<HashMap<String, String>> datum = Databas.getDatabas().fetchRows(fyll);
            for (int i = 0; i < datum.size(); i++){
                cbValjTid.addItem(datum.get(i).get("TID"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cbValjDatumActionPerformed

    private void cbValjTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjTidActionPerformed
        
    }//GEN-LAST:event_cbValjTidActionPerformed

    private void btn_laggTillMigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laggTillMigActionPerformed
        clearTbl();    
        
            String getTid = cbValjTid.getSelectedItem().toString();
            String getDatum = cbValjDatum.getSelectedItem().toString();
            String getTitel = cbValjMotesforslag.getSelectedItem().toString();
            
            if(Validering.matchString(getTitel)
                && Validering.tomCombo(cbValjDatum)
                     && Validering.tomCombo(cbValjMotesforslag))
            {
            
            try {
                String tiddatum_ID = "SELECT TIDDATUM_ID FROM MFTIDDATUM \n" +
                        "WHERE MF_ID = (SELECT MF_ID FROM MOTESFORSLAG \n" + 
                        "WHERE TITEL = '" + getTitel + "') \n" +
                        "AND DATUM = '" + getDatum + "' \n" +
                        "AND TID = " + getTid + ""; 
                
                tiddatum_ID = Databas.getDatabas().fetchSingle(tiddatum_ID);
                
                try {
                    
                String sql = "INSERT INTO ACCEPTERADEMOTEN \n" + 
                    "VALUES (" + anvID + ", " + tiddatum_ID +")";
                    
                String sqlString = "SELECT * FROM ACCEPTERADEMOTEN WHERE A_ID = " + anvID + " AND TIDDATUM_ID = " + tiddatum_ID + "";
                sqlString = Databas.getDatabas().fetchSingle(sqlString);
 
                if(sqlString == null) {
                    Databas.getDatabas().insert(sql);
                    JOptionPane.showMessageDialog(null, "Du är nu anmäld på det valda förslaget.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Det valda förslaget är du redan anmäld på.");
                }
                
                fyllTabell();
                    }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            }
            
            
    }//GEN-LAST:event_btn_laggTillMigActionPerformed

    private void fyllTabell()
    {
        try {
            String sqlFraga = "SELECT TITEL, DATUM, TID FROM MOTESFORSLAG \n" +
                    "JOIN MFTIDDATUM ON MOTESFORSLAG.MF_ID = MFTIDDATUM.MF_ID \n" +
                    "JOIN ACCEPTERADEMOTEN on MFTIDDATUM.TIDDATUM_ID = ACCEPTERADEMOTEN.TIDDATUM_ID \n" +
                    "WHERE ACCEPTERADEMOTEN.A_ID = " + anvID +"";
                    
            
            ArrayList<HashMap<String, String>> database = Databas.getDatabas().fetchRows(sqlFraga);
            
            for(int i = 0; i < database.size(); i++) {
                String titel = database.get(i).get("TITEL");
                String datum = database.get(i).get("DATUM");
                String tid = database.get(i).get("TID");
            
            DefaultTableModel dmt = (DefaultTableModel)tbl_valdaMotesforslag.getModel();
                dmt.addRow(new Object[] {titel, datum, tid});
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void fyllMotesforslag(){ 
 
        try{
        String fyll = "SELECT MF_ID FROM MOTESFORSLAG"; 
        ArrayList<String> motesforslag = Databas.getDatabas().fetchColumn(fyll);
        for (String ettID : motesforslag){
            cbValjMotesforslag.addItem(Databas.getDatabas().fetchSingle("select titel from motesforslag where mf_id = " + ettID));
           
                                                  }
           }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    
    private void clearTbl() {
 
        DefaultTableModel dm = (DefaultTableModel) tbl_valdaMotesforslag.getModel();

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
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btn_laggTillMig;
    private javax.swing.JComboBox<String> cbValjDatum;
    private javax.swing.JComboBox<String> cbValjMotesforslag;
    private javax.swing.JComboBox<String> cbValjTid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_valdaMotesforslag;
    // End of variables declaration//GEN-END:variables
}
