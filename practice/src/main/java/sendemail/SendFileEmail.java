package sendemail;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.activation.*;


public class SendFileEmail {
	public static void main(String[] args) {
		
		//收件人电子邮箱
		String to = "abcd@gmail.com";
		
		//发件人电子邮箱
		String from = "web@gmail.com";
		
		//指定发送邮件的主机为 localhost
		String host = "localhost";
		
		//获取系统属性
		Properties properties = System.getProperties();
		
		//设置邮件服务器
		properties.setProperty("mail.smtp.host", host);
		
		//获取默认的 Session 对象。
		Session session = Session.getDefalutInstance(properties);
		
		try {
			
			// 创建默认的 MimeMessage 对象。
			MimeMessage message = new Mimemessaga(session);
			
			//Set From: 头部头字段
			message.setFrom(new InternetAddress(form));
			
			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.To,new InternetAddress(to));
			
			//Set Subject: 头字段
			message.setSubject("This is the Subject Line!");
			
			//创建消息部分
			BodyPart messageBodyPart = new MimeBodyPart();
			
			//消息
			messageBodyPart.setText("This is message body");
			
			// 创建多重消息
			Multipart multipart = new Multipart();
			
			// 设置文本消息部分
			multipart.addBodyPart(messageBodyPart);
			
			//附件部分
			messageBodyPart = new MimeBodyPart();
			String filename = "file.txt";
			DataSource source = new DataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			
			//发送完整消息
			message.setContent(multipart);
			
			//发送消息
			Transport.send(message);
			System.out.println("Sent message successfully....");
		}catch (MessagingException mex ) {
			mex.printStackTrace();
		}
		
	}

}
