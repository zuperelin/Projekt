/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Alfred
 */
public class BlockeraNotis extends javax.swing.JFrame {

    private String valdPerson = "";
    private String anvID;
    public BlockeraNotis(String anvandarID) {
        initComponents();
        anvID = anvandarID;
        fillCbAnvandare();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_Anvandare = new javax.swing.JComboBox<>();
        btn_Tillbaka = new javax.swing.JButton();
        chb_Blockera = new javax.swing.JCheckBox();
        btn_Utför = new javax.swing.JButton();
        lbl_AnvandareBlockad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_Anvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AnvandareActionPerformed(evt);
            }
        });

        btn_Tillbaka.setText("Tillbaka");
        btn_Tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TillbakaActionPerformed(evt);
            }
        });

        chb_Blockera.setText("Blockera");

        btn_Utför.setText("Utför");
        btn_Utför.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UtförActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Tillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Utför)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_AnvandareBlockad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_Anvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chb_Blockera)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Tillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Anvandare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_Blockera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Utför)
                    .addComponent(lbl_AnvandareBlockad))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UtförActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UtförActionPerformed
        boolean villBlockera = chb_Blockera.isSelected();
        String anvandare = (String)cb_Anvandare.getSelectedItem();
        String anvandareID= anvandare.replaceAll("[^0-9]", "");
        String sqlQueryBlockera = "insert into anvandareblock values (" +anvID+ ", " +anvandareID+ ")";
        String sqlQueryAvblockera = "delete from anvandareblock where a_id = " +anvID+ " and blockad_id = " +anvandareID;
        
        try
        {
            if(villBlockera) {
                Databas.getDatabas().insert(sqlQueryBlockera);
            } else {
                Databas.getDatabas().delete(sqlQueryAvblockera);
            }
            lbl_AnvandareBlockad.setText("Användare blockerad!");
            fillCbAnvandare();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_UtförActionPerformed

    private void cb_AnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AnvandareActionPerformed
        String anvandare = (String)cb_Anvandare.getSelectedItem();
        String anvandareID= anvandare.replaceAll("[^0-9]", "");
        String sqlQueryKollaBlock = "select a_id, blockad_id from anvandareblock where a_id = " +anvID+ " and blockad_id = " +anvandareID;
        
        try
        {
            if(Databas.getDatabas().fetchSingle(sqlQueryKollaBlock) == null) {
                chb_Blockera.setSelected(false);
            } else {
                chb_Blockera.setSelected(true);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cb_AnvandareActionPerformed

    private void btn_TillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TillbakaActionPerformed
        new RedigeraAnv(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_TillbakaActionPerformed

    private void fillCbAnvandare()
    {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel() ;
        String sqlQueryHamtaAnvandare = "select a_id, fornamn, efternamn from anvandare";
        
        try
        {
            ArrayList<HashMap<String, String>> anvFornamnEfternamn = Databas.getDatabas().fetchRows(sqlQueryHamtaAnvandare);
            for(int i = 0; i<anvFornamnEfternamn.size(); i++) {
                String fornamn = anvFornamnEfternamn.get(i).get("FORNAMN");
                String efternamn = anvFornamnEfternamn.get(i).get("EFTERNAMN");
                String a_id = anvFornamnEfternamn.get(i).get("A_ID");
                cbModel.addElement(fornamn + " " +efternamn+ " " +a_id);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        cb_Anvandare.setModel(cbModel);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(BlockeraNotis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlockeraNotis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlockeraNotis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlockeraNotis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlockeraNotis("1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Tillbaka;
    private javax.swing.JButton btn_Utför;
    private javax.swing.JComboBox<String> cb_Anvandare;
    private javax.swing.JCheckBox chb_Blockera;
    private javax.swing.JLabel lbl_AnvandareBlockad;
    // End of variables declaration//GEN-END:variables
}
