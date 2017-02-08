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
    	public static void skickaEttMail(String anvID, String mfID) {

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
                    String sqlfraga = "select email from anvandare where anvandare.a_id not in ( select anvandareblock.a_id from anvandareblock  where anvandareblock.blockad_id = " +anvID+ ")";
                    String sqlQueryTidDatum = "select Datum, tid from mftiddatum where mf_id = " +mfID;
                    ArrayList<HashMap<String, String>> email = Databas.getDatabas().fetchRows(sqlfraga);
                    ArrayList<HashMap<String, String>> tidDatum = Databas.getDatabas().fetchRows(sqlQueryTidDatum);

                    System.out.println(tidDatum);
                    for (int i = 0; i < email.size(); i++) {
                        String lista = email.get(i).get("EMAIL");
                
                     

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("grupp6projekt@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(lista));
			message.setSubject("Testing Subject");
			message.setText("Hej!"
				+ "\n\n Det finns ett nytt mötesförslag att svara på."
                                + "\n\n "+tidDatum);

			Transport.send(message);
                        }

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
                    System.out.println(e.getMessage());
                }
	}
}
