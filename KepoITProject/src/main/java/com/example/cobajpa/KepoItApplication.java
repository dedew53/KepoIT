package com.example.cobajpa;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class KepoItApplication {

	public static void main(String[] args) {
		SpringApplication.run(KepoItApplication.class, args);
		
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailsender = new JavaMailSenderImpl();
		mailsender.setHost("smtp.gmail.com");
		mailsender.setPort(587);
		mailsender.setUsername("send.kepoit@gmail.com");
		mailsender.setPassword("sumatera1");
		Properties p = mailsender.getJavaMailProperties();
		p.put("mail.transport.protocol","smtp");
		p.put("mail.smtp.auth","true");
		p.put("mail.smtp.starttls.enable","true");
		p.put("mail.debug","true");
		return mailsender;

	}

	@Bean
	public SimpleMailMessage getTemplate() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setText("selamat datang %s");
		return message;
	}
	
}
