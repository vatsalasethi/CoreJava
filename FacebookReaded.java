
public class FacebookReaded implements SocialFeedReader {
public Message1 pollForNewMessage() {
		
		Message1 m1=new Message1();
		m1.setMessageId(1);
		m1.setMessage("Hey! Vatsala this side");
		m1.setMessageSource("Facebook");
		m1.setMessageType("String");
		m1.setSenderId(4);
		m1.setSenderName("Vatsala FROM FACEBOOK");
		m1.setSenderSource("Bangalore FACEBOOK");
		return m1;
		
	}
}
