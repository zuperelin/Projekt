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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Timmy
 */
public class Motesforslag extends javax.swing.JFrame {
    
    private String anvID;
    private String mfID = "";
    int index = 0;
    boolean motesForslagSkickat = false;
    boolean mfIDInteFinns = true;
    String nyttID = "";

    /**
     * Creates new form Motesforslag
     */
    public Motesforslag(String anvandarID) {
        initComponents();
        anvID = "1";
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
        txt_motestitel = new javax.swing.JTextField();
        datechooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_text = new javax.swing.JTextArea();
        btnSkickaForslag = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_forslag = new javax.swing.JTable();
        lblDatumForslag = new javax.swing.JLabel();
        btnLaggTillForslag = new javax.swing.JButton();
        lblTidOchDatum = new javax.swing.JLabel();
        txt_tid = new javax.swing.JTextField();
        lblTidForslag = new javax.swing.JLabel();
        lblForslagSkickat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMotesTitel.setText("Mötestitel");

        lblText.setText("Text");

        txt_text.setColumns(20);
        txt_text.setRows(5);
        jScrollPane1.setViewportView(txt_text);

        btnSkickaForslag.setText("Skicka förslag");
        btnSkickaForslag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkickaForslagActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        tbl_forslag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Tid"
            }
        ));
        jScrollPane2.setViewportView(tbl_forslag);

        lblDatumForslag.setText("Datumsförslag");

        btnLaggTillForslag.setText("Lägg till");
        btnLaggTillForslag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillForslagActionPerformed(evt);
            }
        });

        lblTidOchDatum.setText("Dina datum- & tidsförslag");

        txt_tid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tidFocusGained(evt);
            }
        });

        lblTidForslag.setText("Tidsförslag");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblText)
                            .addComponent(lblMotesTitel))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTidForslag)
                            .addComponent(lblDatumForslag))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_motestitel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datechooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txt_tid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLaggTillForslag))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTidOchDatum)
                                .addGap(46, 98, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSkickaForslag, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblForslagSkickat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_motestitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMotesTitel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblText))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumForslag))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTidForslag)
                    .addComponent(btnLaggTillForslag))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSkickaForslag, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForslagSkickat))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTidOchDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkickaForslagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkickaForslagActionPerformed
   
        DefaultTableModel dmt = (DefaultTableModel)tbl_forslag.getModel();
        
        if(dmt.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Det finns inga möteförslag att välja");
        } else {
        dmt.getDataVector().removeAllElements();
        revalidate();
        txt_motestitel.setText("");
        txt_text.setText("");
        datechooser = new JDateChooser();
        datechooser.setCalendar(null);
        txt_tid.setText("t.ex 14:30");
        lblForslagSkickat.setText("Mötesförslag skickat!");
        dmt.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnSkickaForslagActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        String sqlQueryDeleteTidDatumNyttID = "delete from mftiddatum where mf_id = " +nyttID;
        String sqlQueryDeleteTidDatumGammaltID = "delete from mftiddatum where mf_id = " +mfID;
        String sqlQueryDeleteMFNyttID = "delete from motesforslag where mf_id = " +nyttID;
        String sqlQueryDeleteMFGammaltID = "delete from motesforslag where mf_id = " +mfID;
        try
        {
            if(!motesForslagSkickat) {
                if(mfIDInteFinns) {
                    Databas.getDatabas().delete(sqlQueryDeleteTidDatumNyttID);
                    Databas.getDatabas().delete(sqlQueryDeleteMFNyttID);
                } else {
                    Databas.getDatabas().delete(sqlQueryDeleteTidDatumGammaltID);
                    Databas.getDatabas().delete(sqlQueryDeleteMFGammaltID);
                } 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        new Calendar(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnLaggTillForslagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillForslagActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String info = txt_text.getText();
        DefaultTableModel dmt = (DefaultTableModel)tbl_forslag.getModel();
        String titel = txt_motestitel.getText();
        String text = txt_text.getText();
        String valtDatum = dFormat.format(datechooser.getDate());
        String tiden = txt_tid.getText();
        String valdTid = tiden.replaceAll("[^0-9]", "");
        String nyttID = "";
        
        if(datechooser.getDate() == null) {
            Validering.emptyDateChooser(datechooser);
        } else if(Validering.tomtTextfalt(txt_motestitel)
               && Validering.tomtTextArea(info)
                && Validering.emptyDateChooser(datechooser)
                && Validering.datumKorrekt(datechooser)
                && Validering.tomtTextfalt(txt_tid))
               
        {
        
        
        boolean mfIDInteFinns = true;
        try
        {
            String finnsID = Databas.getDatabas().fetchSingle("Select mf_id from motesforslag where titel = '" +titel+ "'");
            String mfNyttID = Databas.getDatabas().getAutoIncrement("MOTESFORSLAG", "MF_ID");
            String sqlQueryInsertMF = "Insert into motesforslag values (" +mfNyttID+ ", '" +titel+ "', '" +text+ "', " +anvID+ ")";
            String sqlQueryHamtaNyttID = "select mf_id from motesforslag where titel = '" +titel+ "'";
                if(finnsID != null) {
                    mfIDInteFinns = false;
                    mfID = finnsID;
                }
                
            if(mfIDInteFinns) {
                Databas.getDatabas().insert(sqlQueryInsertMF);
                nyttID = Databas.getDatabas().fetchSingle(sqlQueryHamtaNyttID);
            } 
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        try
        {
            String tidDatumNyttID = Databas.getDatabas().getAutoIncrement("MFTIDDATUM", "TIDDATUM_ID");
            String sqlQueryInsertTidDatumNyttMF = "insert into mftiddatum values (" +tidDatumNyttID+ ", '" +valtDatum+ "', " +valdTid+ ", " +nyttID+ ")";
            String sqlQueryInsertTidDatum = "insert into mftiddatum values (" +tidDatumNyttID+ ", '"+valtDatum+ "', " +valdTid+ ", " +mfID+ ")";
            if(mfIDInteFinns) {
                Databas.getDatabas().insert(sqlQueryInsertTidDatumNyttMF);
                System.out.println("Ett nytt datumförslag har registrerats med ett nytt mötesförslag!");
            } else {
                Databas.getDatabas().insert(sqlQueryInsertTidDatum);
                System.out.println("Ett nytt datumförslag har registrerats!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        try
        {
            dmt.addRow(new Object[] {});
            tbl_forslag.setValueAt(valtDatum, index, 0);
            tbl_forslag.setValueAt(valdTid, index, 1);
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        index++;
        dmt.fireTableDataChanged();
        }
        txt_tid.setText("");
        
    }//GEN-LAST:event_btnLaggTillForslagActionPerformed

    private void txt_tidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tidFocusGained
        txt_tid.setText("");
    }//GEN-LAST:event_txt_tidFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillForslag;
    private javax.swing.JButton btnSkickaForslag;
    private javax.swing.JButton btnTillbaka;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatumForslag;
    private javax.swing.JLabel lblForslagSkickat;
    private javax.swing.JLabel lblMotesTitel;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTidForslag;
    private javax.swing.JLabel lblTidOchDatum;
    private javax.swing.JTable tbl_forslag;
    private javax.swing.JTextField txt_motestitel;
    private javax.swing.JTextArea txt_text;
    private javax.swing.JTextField txt_tid;
    // End of variables declaration//GEN-END:variables
}
