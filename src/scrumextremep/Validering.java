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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
            JOptionPane.showMessageDialog(null, "Du måste ange ett värde!");
            tf.requestFocus();
            return false;
        }
        
        return true;
    }
    
    static public Boolean anvandareUnik(String anvnamn)
    {
        try{
            String sql = "SELECT ANVNAMN FROM ANVANDARE";
            ArrayList<HashMap<String, String>> sqllista = Databas.getDatabas().fetchRows(sql);
            for(int i = 0; i < sqllista.size(); i++){
                if(anvnamn.equals(sqllista.get(i).get("ANVNAMN"))){
                    JOptionPane.showMessageDialog(null, "Användarnamnet måste vara unikt!");
                    return false;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    static public Boolean motesforslagUnik(String motesforslag)
    {
        try{
            String sql = "SELECT TITEL FROM MOTESFORSLAG";
            ArrayList<HashMap<String, String>> sqllista = Databas.getDatabas().fetchRows(sql);
            for(int i = 0; i < sqllista.size(); i++){
                if(motesforslag.equals(sqllista.get(i).get("TITEL"))){
                    JOptionPane.showMessageDialog(null, "Du måste ange en unik titel.");
                    return false;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    static public Boolean giltigMail(String mailen)
    {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(!mailen.matches(EMAIL_REGEX)){
        JOptionPane.showMessageDialog(null, "Du har angivit en felaktig mailadress!");
            return false;
        }
        return true;
    }
    
    static public boolean forKort(JTextField langd){
            boolean forkort = true; 
            if(langd.getText().length() < 2){
                forkort = false;
                JOptionPane.showMessageDialog(null, "Texten är för kort, du måste ha mer än 2 tecken!");
                langd.requestFocus();
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
                JOptionPane.showMessageDialog(null, "Var vänlig välj ett datum");
            return false;
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
}
