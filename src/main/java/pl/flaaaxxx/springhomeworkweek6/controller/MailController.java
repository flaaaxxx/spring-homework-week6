package pl.flaaaxxx.springhomeworkweek6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.flaaaxxx.springhomeworkweek6.MailSender;

@Controller
public class MailController {

    private MailSender mailSender;

    @Autowired
    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    public String send() {
        mailSender.sendEmail("flaaaxxx@wp.pl", "Mail from spring boot", "Check my new movies!!!");
        return "redirect:/show";
    }
}
