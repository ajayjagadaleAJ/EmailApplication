package com.example.demo.Service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Email;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	 public void sendMail(Email em)
	    {
	        try {
	            MimeMessage message = javaMailSender.createMimeMessage();
	            MimeMessageHelper helper = new MimeMessageHelper(message);
	            
	            // Define the sender's email and name
	            String senderName = "Ajay Jagadale";
	            String senderEmail = "ajayhjagadale.sknsits.comp@gmail.com";
	            String fromAddress = String.format("%s <%s>", senderName, senderEmail);
	            
	            
	            
	            
	            helper.setFrom(fromAddress);
	            helper.setTo(em.getTo());
	            helper.setSubject(em.getSubject());
	            helper.setText(em.getMessage());
	            javaMailSender.send(message);
	            
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
}
