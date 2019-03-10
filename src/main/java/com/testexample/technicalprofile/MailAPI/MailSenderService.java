package com.testexample.technicalprofile.MailAPI;

import com.testexample.technicalprofile.model.MailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    // Use it to send Simple text emails
    public void sendSimpleMail(MailDetails mailDetails, SimpleMailModel mail) {
        if (mailDetails!=null) {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(mail.getTo());
            message.setSubject(mail.getSubject());
            message.setText(mail.getContent(mailDetails));

            mailSender.send(message);
        }

    }

 /*   // Use it to send HTML emails
    public void sendHTMLMail(HTMLMailModel mail) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");

        helper.setTo(mail.getTo());
        helper.setSubject(mail.getSubject());
        message.setContent(mail.getContent(), "text/html");

        mailSender.send(message);
    }*/
}