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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import oru.inf.InfException;
/**
 *
 * @author Ola Vognild
 */
public class Validering {
    
    static public Boolean tomtTextfalt(JTextField tf)
    {
        if(tf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ett eller flera textfält är tomma");
            tf.requestFocus();
            return false;
        }
        
        return true;
    }
        static public Boolean tomtTextArea(String tf)
    {
        if(tf.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ett eller flera textfält är tomma");
            
            return false;
        }
        
        return true;
    }
    
    static public Boolean anvandareUnik(JTextField anvnamn)
    {
        try{
            String sql = "SELECT ANVNAMN FROM ANVANDARE";
            ArrayList<HashMap<String, String>> sqllista = Databas.getDatabas().fetchRows(sql);
            for(int i = 0; i < sqllista.size(); i++){
                if(anvnamn.equals(sqllista.get(i).get("ANVNAMN"))){
                    JOptionPane.showMessageDialog(null, "Användarnamnet måste vara unikt!");
                    anvnamn.requestFocus();
                    anvnamn.setText("");
                    return false;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    static public Boolean motesforslagUnik(JTextField motesforslag)
    {
        try{
            String sql = "SELECT TITEL FROM MOTESFORSLAG";
            ArrayList<HashMap<String, String>> sqllista = Databas.getDatabas().fetchRows(sql);
            for(int i = 0; i < sqllista.size(); i++){
                if(motesforslag.equals(sqllista.get(i).get("TITEL"))){
                    JOptionPane.showMessageDialog(null, "Du måste ange en unik titel.");
                    motesforslag.requestFocus();
                    motesforslag.setText("");
                    return false;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    static public Boolean giltigMail(JTextField mailen)
    {
        String mail = mailen.getText();
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(!mail.matches(EMAIL_REGEX)){
        JOptionPane.showMessageDialog(null, "Du har angivit en felaktig mailadress!");
        mailen.requestFocus();
        mailen.setText("");
            return false;
        }
        return true;
    }
    
        static public Boolean mailUnik(JTextField mailen){
            String mail = mailen.getText();
        try{
            String sql = "SELECT ANVANDARE.EMAIL FROM ANVANDARE";
            ArrayList<HashMap<String, String>> sqllista = Databas.getDatabas().fetchRows(sql);
            for(int i = 0; i < sqllista.size(); i++){
                if(mail.equals(sqllista.get(i).get("EMAIL"))){
                    JOptionPane.showMessageDialog(null, "Denna email används redan av en annan användare");
                    mailen.setText("");
                    mailen.requestFocus();
                    return false;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    static public boolean forKort(JTextField langd){
            boolean forkort = true; 
            if(langd.getText().length() < 2){
                forkort = false;
                JOptionPane.showMessageDialog(null, "Texten är för kort, du måste ha mer än 2 tecken!");
                langd.requestFocus();
                langd.setText("");
            }
            return forkort;
        }
    
    static public boolean datumKorrekt(JDateChooser nyttdatum){
        Date datum = nyttdatum.getDate();
        Date dagensdatum = new Date();
        if(datum.before(dagensdatum)){
            JOptionPane.showMessageDialog(null, "Du kan endast lägga in möten efter dagens datum.");
            return false;
        }
        return true;
    }
         static public boolean emptyDateChooser(JDateChooser dt) {
         
            if (dt.getDate() == null) 
            {
                JOptionPane.showMessageDialog(null, "Var vänlig välj ett datum");
            return false;
         }
            else{
                    return true;
                    }
     }
     
     
     static public boolean ingaMoten(JDateChooser mote){
   
        
       
        try {
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dFormat.format(mote.getDate());
            String sqlfraga = "Select mote.namn from mote where datum = '"+date+"'";
            ArrayList<HashMap<String, String>> m = Databas.getDatabas().fetchRows(sqlfraga);
            
            
            if(m == null) {
               return true;  
             
            }
        }
        catch (InfException ex) {
            System.out.println("Fel");
        }
        return false;
     }
     
     static public boolean valideraNamn (JTextField text){
        String namn = text.getText();
        if(!namn.matches("[a-öA-Ö -]+")){
            JOptionPane.showMessageDialog(null, "Ogiltigt namn\n" +
                                       "Namn kan endast innehålla bokstäver");
            text.requestFocus();
            return false;
        } 
       return true;
    }
     
    static public boolean valideraLosenLangd(JTextField langd){
            boolean forkort = true; 
            if(langd.getText().length() < 6){
                forkort = false;
                JOptionPane.showMessageDialog(null, "Lösenordet måste innehålla minst 6 tecken");
                langd.requestFocus();
                langd.setText("");
            }
            return forkort;
        }
    static public boolean tomCombo(JComboBox cb){
        boolean forkort = true;
        if(cb.getSelectedItem() == null){
            forkort = false;
            JOptionPane.showMessageDialog(null, "Var vänlig en tid");
            cb.requestFocus();
        }
        return forkort;
    }
    
        static public boolean tomttable(JTable jt) {
        boolean tom = true;
        int rows = jt.getRowCount();
        
        if(rows == 0){
            tom = false;
            JOptionPane.showMessageDialog(null, "Välj ett förslag med kollegor som kan, tack");
        }
     return tom;
    }
}
