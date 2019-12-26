package pl.flaaaxxx.springhomeworkweek6;

public interface MailSender {
    boolean sendEmail(String to, String subject, String content);
}
