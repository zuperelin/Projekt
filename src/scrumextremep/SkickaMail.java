/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Timmy
 */
public class SkickaMail {
    	public static void skickaEttMail(String anvID, String selectedMFID) {

		final String username = "grupp6projekt@gmail.com";
		final String password = "axeduvan";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
                    
                    String datumvald = new String();
                    String tidvald = new String();
                    String sqlfraga = "select email from anvandare where anvandare.a_id not in ( select anvandareblock.a_id from anvandareblock  where anvandareblock.blockad_id = " +anvID+ ")";
                    ArrayList<HashMap<String, String>> email = Databas.getDatabas().fetchRows(sqlfraga);
                            String sqldatum = "select MFTIDDATUM.DATUM from MFTIDDATUM\n" +
                                "join MOTESFORSLAG\n" +
                                "on MOTESFORSLAG.MF_ID = MFTIDDATUM.MF_ID\n" +
                                "join ANVANDARE\n" +
                                "on ANVANDARE.A_ID = MOTESFORSLAG.A_ID\n" +
                                "where ANVANDARE.A_ID = " + anvID + "\n" +
                                "and MOTESFORSLAG.MF_ID = " + selectedMFID;
                                String sqltid = "select MFTIDDATUM.TID from MFTIDDATUM\n" +
                                "join MOTESFORSLAG\n" +
                                "on MOTESFORSLAG.MF_ID = MFTIDDATUM.MF_ID\n" +
                                "join ANVANDARE\n" +
                                "on ANVANDARE.A_ID = MOTESFORSLAG.A_ID\n" +
                                "where ANVANDARE.A_ID = " + anvID + "\n" +
                                "and MOTESFORSLAG.MF_ID = " + selectedMFID;
                                ArrayList<HashMap<String, String>> datum = Databas.getDatabas().fetchRows(sqldatum);
                                ArrayList<HashMap<String, String>> tid = Databas.getDatabas().fetchRows(sqltid);

                           
                                
                                String datumOchTider = "";
                                for (int i = 0; i < tid.size(); i++) {
                                    if(Integer.parseInt(tid.get(i).get("TID")) >10) {
                                        tidvald = "0" + tid.get(i).get("TID");
                                    } else {
                                        tidvald = tid.get(i).get("TID");
                                    }
                                    String timmar = tidvald.substring(0, 2);
                                    String minuter = tidvald.substring(2, 4);
                                    datumvald = datum.get(i).get("DATUM");
                                    datumOchTider += "\n\n Datum " +datumvald + " Tid " + timmar + ":" +minuter;
                                }
                                
                                
                    for (int i = 0; i < email.size(); i++) {
                        String lista = email.get(i).get("EMAIL");
                
                     

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("grupp6projekt@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(lista));
			message.setSubject("Testing Subject");
			message.setText("Hej!"
				+ "\n\n Det finns ett nytt mötesförslag att svara på."
                                + "\n\n Dessa datum och tider har föreslagits:"
                                + datumOchTider);

			Transport.send(message);
                        }

			System.out.println("Skickat!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
                    System.out.println(e.getMessage());
                }
	}
}
