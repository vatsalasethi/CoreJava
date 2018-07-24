
public class TwitterFeedReader implements SocialFeedReader {

	public Message1 pollForNewMessage() {
		
		Message1 m1=new Message1();
		m1.setMessageId(1);
		m1.setMessage("Hey! Vatsala this side");
		m1.setMessageSource("Twitter");
		m1.setMessageType("String");
		m1.setSenderId(2);
		m1.setSenderName("Vatsala");
		m1.setSenderSource("Bangalore");
		return m1;
		
	}
}
