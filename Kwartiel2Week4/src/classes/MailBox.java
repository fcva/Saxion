package classes;

import java.util.ArrayList;

public class MailBox {
	
	private static ArrayList<Message> inbox;
	
	public MailBox() {
		inbox = new ArrayList<Message>();
	}
	
	public void addMessage(Message m) {
		inbox.add(m);
	}
	
	public void removeMessage(int i) {
		inbox.remove(i);
	}
	
	public Message getMessage(int i) {
		return inbox.get(i);
	}
	
}
