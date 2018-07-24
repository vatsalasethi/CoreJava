interface SocialFeedReader{
		Message1 pollForNewMessage();
	
}	



class Message1{
	int messageId;
	String messageSource;
	String messageType;
	String message;
	int senderId;
	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderSource() {
		return senderSource;
	}

	public void setSenderSource(String senderSource) {
		this.senderSource = senderSource;
	}

	String senderName;
	String senderSource;
	
	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
	



	public class Message {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwitterFeedReader tfr=new TwitterFeedReader();
		Message1 m= tfr.pollForNewMessage();
		System.out.println(m.getMessage());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessageId());
		System.out.println(m.getMessageType());
		System.out.println(m.getSenderId());
		System.out.println(m.getSenderName());
		System.out.println(m.getSenderSource());


		FacebookReaded fb=new FacebookReaded();
		Message1 f= fb.pollForNewMessage();
		System.out.println(f.getMessage());
		System.out.println(f.getMessageSource());                  
		System.out.println(f.getMessageId());
		System.out.println(f.getMessageType()); 
		System.out.println(f.getSenderId());
		System.out.println(f.getSenderName());
		System.out.println(f.getSenderSource());


	}

}
