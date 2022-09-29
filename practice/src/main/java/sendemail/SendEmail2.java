package sendemail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail2 {
	
	public static void main(String [] args) {
		
		String to = "×××@qq.com";
		
		String from = "×××@qq.com";
		
		String host = "smtp.qq.com";
		
		Properties properties = System.getProperties();
		
		properties.setProperty("mail.smtp.host",host);
		
		properties.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(properties,new Authenticator() {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication("×××@qq.com","qq邮箱授权码");
		
		}
	});
	try {
		MimeMessage message = new MimeMessage(session);
		
		message.setFrom(new InternetAddress(from));
		
		message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		
		message.setSubject("This is the Subject Line!");
		
		message.setText("This is actual message");
		
		Transport.send(message);
		System.out.println("Sent message successfully....from runoob.com");
	}catch (MessagingException mex) {
		mex.printStackTrace();
	}
  }
}
