package classes;

public class Message {
	private String recipient, sender, messageText, messageTextDebug;
	
	public Message(String recipient, String sender) {
		this.recipient = recipient;
		this.sender = sender;
		this.messageText = "";
	}
	
	public void append(String line) {
		if(messageText != "") {
		this.messageText += "\n" + line;
		this.messageTextDebug += "\\n" + line;
		} else {
			this.messageText = line;
			this.messageTextDebug = line;
		}
	}
	
	public String getMessageTextDebug() {
		return messageTextDebug;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
}
