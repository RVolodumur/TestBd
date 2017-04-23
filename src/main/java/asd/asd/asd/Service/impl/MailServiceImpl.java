package asd.asd.asd.Service.impl;

import asd.asd.asd.Entity.User;
import asd.asd.asd.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private Environment environment;




    public void send(User user) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        try {
            helper.setFrom(new InternetAddress(environment.getProperty("myEmail")));
            System.out.println("!");
            helper.setTo(user.getEmail());
            System.out.println("!!");
            helper.setText("hello", true);
            System.out.println("!!!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }
        public JavaMailSender getJavaMailSender() {
            return javaMailSender;
        }

        public void setJavaMailSender(JavaMailSender javaMailSender) {
            this.javaMailSender = javaMailSender;
        }


}
