package com.example.javaservlet.utility;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mailer {
    private final static String USER = "bosskiller872@gmail.com";
    private final static String PASS = "fhihajevrhpqnyup";

    public static Boolean send(String to, String subject, String msg) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "mail.javatpoint.com");//change accordingly
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER, PASS);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USER));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
            return null;
        }

    }
}
