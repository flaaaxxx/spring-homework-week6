package pl.flaaaxxx.springhomeworkweek6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import pl.flaaaxxx.springhomeworkweek6.MailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService implements MailSender {

    private JavaMailSender javaMailSender;

    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public boolean sendEmail(String to, String subject, String content) {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setTo(to);
            helper.setText(content);
            helper.setSubject(subject);
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }

        try {
            javaMailSender.send(message);
        }
        catch (MailException ex){
            return false;
        }

        return true;
    }

}

