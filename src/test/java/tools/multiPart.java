package tools;

/*
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

public class multiPart {

	   public static void check(String host, String storeType, String user,
	      String password) 
	   {
	      try {

	      //create properties field
	      Properties properties = new Properties();

	      properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	  
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");

	      store.connect(host, user, password);

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_ONLY);

	      // retrieve the messages from the folder in an array and print it
	      Message[] messages = emailFolder.getMessages();
	      System.out.println("messages.length---" + messages.length);
	      
	      
	      for (int i = 0, n = messages.length; i < n; i++) {
	    	  String content= messages[i].getContent().toString();
	    	  Multipart multipart = (Multipart) messages[i].getContent();

		      for (int j = 0; j < multipart.getCount(); j++) {

		          BodyPart bodyPart = multipart.getBodyPart(j);

		          String disposition = bodyPart.getDisposition();

		            if (disposition != null && (disposition.equalsIgnoreCase("ATTACHMENT"))) { // BodyPart.ATTACHMENT doesn't work for gmail
		                System.out.println("Mail have some attachment");

		                DataHandler handler = bodyPart.getDataHandler();
		                System.out.println("file name : " + handler.getName());                                 
		              }
		            else { 
		                System.out.println("Body: "+bodyPart.getContent());
		                content= bodyPart.getContent().toString();
		              }

	      }
	      
	      

	      //close the store and folder objects
	      emailFolder.close(false);
	      store.close();

	      } catch (NoSuchProviderException e) {
	         e.printStackTrace();
	      } catch (MessagingException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	   public static void main(String[] args) {

	      String host = "pop.gmail.com";// change accordingly
	      String mailStoreType = "pop3";
	      String username = "emilian.melian1@gmail.com";// change accordingly
	      String password = "Emilian25";// change accordingly

	      check(host, mailStoreType, username, password);

	   }

	}\
*/