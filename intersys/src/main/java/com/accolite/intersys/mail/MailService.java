package com.accolite.intersys.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

@Repository
public class MailService {
	
	 private JavaMailSender javaMailSender;
	
  @Autowired
	public MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	public void sendEmail(String from, String to, String gmeet_link) {
		
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom(from);
		mail.setTo(to);
		mail.setSubject("Testing Mail API");
		
		mail.setText(gmeet_link);

		javaMailSender.send(mail);
		
	}

}