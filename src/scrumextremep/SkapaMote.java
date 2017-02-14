/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

/**
 *
 * @author Alfred
 */
public class SkapaMote extends javax.swing.JFrame {

    String anvID;
    ArrayList<String> anvandareSomSkaDelta = new ArrayList<>();
    /**
     * Creates new form SkapaMote
     */
    public SkapaMote(String anvandarID) {
        initComponents();
        anvID = anvandarID;
        fillComboBoxes();
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

        lblMotesTitel = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        spMotesText = new javax.swing.JScrollPane();
        txt_text = new javax.swing.JTextArea();
        lblDatumForslag = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        lblTidForslag = new javax.swing.JLabel();
        btnSkapaMote = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        cbMotesForslag = new javax.swing.JComboBox<>();
        lblMoteSkapat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_anvandare = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_timmar = new javax.swing.JComboBox<>();
        cb_minuter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMotesTitel.setText("Möte att skapa");

        lblText.setText("Text");

        txt_text.setColumns(20);
        txt_text.setRows(5);
        spMotesText.setViewportView(txt_text);

        lblDatumForslag.setText("Välj datum");

        lblTidForslag.setText("Välj tid");

        btnSkapaMote.setText("Skapa Möte");
        btnSkapaMote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaMoteActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbMotesForslag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotesForslagActionPerformed(evt);
            }
        });

        tbl_anvandare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Användare", "Datum", "Tid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_anvandare);
        if (tbl_anvandare.getColumnModel().getColumnCount() > 0) {
            tbl_anvandare.getColumnModel().getColumn(0).setResizable(false);
            tbl_anvandare.getColumnModel().getColumn(1).setResizable(false);
            tbl_anvandare.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Mötesdeltagare");

        cb_timmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(lblMoteSkapat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblText)
                                    .addComponent(lblMotesTitel))
                                .addComponent(lblDatumForslag, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblTidForslag, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMotesForslag, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spMotesText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_timmar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_minuter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSkapaMote, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMotesTitel)
                            .addComponent(cbMotesForslag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spMotesText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatumForslag))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTidForslag)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(btnSkapaMote, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMoteSkapat)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSkapaMoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaMoteActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel dm = (DefaultTableModel)tbl_anvandare.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();
        String titel = (String)cbMotesForslag.getSelectedItem();
        String text = txt_text.getText();
        String valdTimme = (String)cb_timmar.getSelectedItem();
        String valdMinut = (String)cb_minuter.getSelectedItem();
        String valdTid = valdTimme + valdMinut;
        String sqlQueryMotesForslagsID = "select mf_id from motesforslag where titel = '" +titel+ "'";
        String sqlQueryHamtaMotesID = "select m_id from mote";
        String textArea = txt_text.getText();
        
        if(datechooser.getDate() == null) {
            Validering.emptyDateChooser(datechooser);
        } else if(Validering.tomtTextArea(textArea)
                && Validering.datumKorrekt(datechooser)
                 && Validering.tomCombo(cb_timmar)
                    && Validering.tomCombo(cb_minuter)
                        && Validering.tomttable(tbl_anvandare)){
            
        String valtDatum = dFormat.format(datechooser.getDate());
        try
        {
            String moteIdIncrement = Databas.getDatabas().getAutoIncrement("MOTE", "M_ID");
            String mfID = Databas.getDatabas().fetchSingle(sqlQueryMotesForslagsID);
            String sqlQueryHamtaTidDatumid = "select tiddatum_id from mftiddatum where mf_id = " +mfID;
            String sqlQyeryTaBortMFtid = "delete from mftiddatum where mf_id = " +mfID;
            String sqlQueryTaBortMotesForslag = "delete from motesforslag where mf_id = " +mfID;
            String sqlQueryInsertIntoMote = "Insert into mote values (" +moteIdIncrement+ ", '" +titel+ "', '" +valtDatum+ "', '" +text+ "', " +anvID+ ", " +valdTid+ ")";
            Databas.getDatabas().insert(sqlQueryInsertIntoMote);
            ArrayList<String> allaMotesID = Databas.getDatabas().fetchColumn(sqlQueryHamtaMotesID);
            String sistaID = allaMotesID.get(allaMotesID.size() -1);
            for(String anvandare : anvandareSomSkaDelta) {
                String anvandarID = Databas.getDatabas().fetchSingle("select a_id from anvandare where fornamn = '" +anvandare+ "'");
                Databas.getDatabas().insert("insert into anvandaredeltarmote values (" +anvandarID+ ", " +sistaID+ ")");
            }
            ArrayList<String> allaTidDatumID = Databas.getDatabas().fetchColumn(sqlQueryHamtaTidDatumid);
            for(String ettTidDatumID : allaTidDatumID) {
                Databas.getDatabas().delete("delete from accepterademoten where tiddatum_id = " +ettTidDatumID);
            }
            Databas.getDatabas().delete(sqlQyeryTaBortMFtid);
            Databas.getDatabas().delete(sqlQueryTaBortMotesForslag);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        fillComboBoxes();
        txt_text.setText("");
        datechooser = new JDateChooser();
        datechooser.setCalendar(null);
        lblMoteSkapat.setText("Möte Skapat!");
        dm.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnSkapaMoteActionPerformed

    private void fillCbMotesForslag()
    {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel() ;
        
        String sqlFraga = "Select titel from motesforslag where a_id = " +anvID;
        try{
            ArrayList<String> motesForslag = Databas.getDatabas().fetchColumn(sqlFraga);
            for (String forslag : motesForslag) {
            cbModel.addElement(forslag);
            }
        } catch (InfException e) {
            System.out.println(e.getMessage()); 
        }
        cbMotesForslag.setModel(cbModel);
    }
    
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new Calendar(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbMotesForslagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotesForslagActionPerformed
        DefaultTableModel dm = (DefaultTableModel)tbl_anvandare.getModel();
        dm.getDataVector().removeAllElements();
        String motesForslag = (String)cbMotesForslag.getSelectedItem();
        String sqlQueryHamtaMotesForslagsText = "select text from motesforslag where titel = '" +motesForslag+ "'";
        String sqlQueryHamtaMotesDeltagare = "select fornamn, datum, tid from anvandare join ACCEPTERADEMOTEN on anvandare.a_id = ACCEPTERADEMOTEN.A_ID join MFTIDDATUM on ACCEPTERADEMOTEN.TIDDATUM_ID = MFTIDDATUM.TIDDATUM_ID join MOTESFORSLAG on MFTIDDATUM.MF_ID = MOTESFORSLAG.MF_ID where MOTESFORSLAG.TITEL = '" +motesForslag+ "'";
        try
        {
            if(Databas.getDatabas().fetchColumn(sqlQueryHamtaMotesDeltagare) != null) {
               ArrayList<HashMap<String, String>> anvandare = Databas.getDatabas().fetchRows(sqlQueryHamtaMotesDeltagare);
                
                for(int i = 0; i < anvandare.size(); i++) 
                {
                String fornamn = anvandare.get(i).get("FORNAMN");
                String datum = anvandare.get(i).get("DATUM");
                         String tid = anvandare.get(i).get("TID");
                    
                    dm.addRow(new Object[] {fornamn, datum, tid});
                }
            }
            String text = Databas.getDatabas().fetchSingle(sqlQueryHamtaMotesForslagsText);
            txt_text.setText(text);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        dm.fireTableDataChanged();
        
    }//GEN-LAST:event_cbMotesForslagActionPerformed

    private void cb_timmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_timmarActionPerformed

    private void fillComboBoxes()
    {
        fillCbTimmar();
        fillCbMinuter();
        fillCbMotesForslag();
    }
    
    private void fillCbTimmar()
    {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel() ;
        for(int i = 0; i<24; i++) {
            String a = Integer.toString(i);
            if(i<=9) {
                cbModel.addElement("0"+a);
            } else {
                cbModel.addElement(a);
            }
        }
        cb_timmar.setModel(cbModel);
    }
    
    private void fillCbMinuter()
    {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel() ;
        for(int i = 0; i<60; i++) {
            String a = Integer.toString(i);
            if(i<9) {
            cbModel.addElement("0"+a);
            } else {
                cbModel.addElement(a);
            }
        }
        cb_minuter.setModel(cbModel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkapaMote;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbMotesForslag;
    private javax.swing.JComboBox<String> cb_minuter;
    private javax.swing.JComboBox<String> cb_timmar;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatumForslag;
    private javax.swing.JLabel lblMoteSkapat;
    private javax.swing.JLabel lblMotesTitel;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTidForslag;
    private javax.swing.JScrollPane spMotesText;
    private javax.swing.JTable tbl_anvandare;
    private javax.swing.JTextArea txt_text;
    // End of variables declaration//GEN-END:variables
}
