/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

/**
 *
 * @author thapaniwas
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Authenticator;

public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String to = "dahalruksha@gmail.com";
        final String user = "tsauravi72@gmail.com";//change accordingly  
        final String password = "jerryMarleY72";//change accordingly  

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(props,
                new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("ping");
            message.setText("Trying to Send mail from Java Coding if successfull dance");

            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (AddressException ex) {
            System.out.println(ex);
        } catch (MessagingException e) {
            System.out.println(e);
        }

    }

}
