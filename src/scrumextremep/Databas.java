/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;
import java.io.File;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Alfred
 */
public class Databas {
    private static InfDB idb;
    
    public static InfDB getDatabas() {
        
        
            try {
            File db = new File("ORUDB.FDB");
            idb = new InfDB(db.getAbsolutePath());
            System.out.println("Lyckades!");
            }
            
             catch (InfException ex) {
                System.out.println(ex.getMessage());
            }
        
        return idb;
    }
}
