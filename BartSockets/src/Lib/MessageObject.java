package Lib;
import java.util.ArrayList;


public abstract class MessageObject {
	String text;
	//also int or "byte" for compression or something like that? 
	
	//ArrayList<String> q = new ArrayList<String>();
	
	public MessageObject(String t) {
		
		//text = "message";
		text = t;
		
		
		/*
		q.add("I will not waste chalk.");
		q.add("Statement 2");
		q.add("Statement 3");
		q.add("Statement 4");
		q.add("Statement 5");
		q.add("Statement 6");
		q.add("Statement 7");
		q.add("Statement 8");
		/**/
	}
	
	
	//or rename to "messageResponse" or "response"
	//clientLocal, clientConnection, serverLocal, serverConnection?
	public abstract void action();
	
	public abstract void actionLocal();
	
	
	
	
	
	/**
	 * method is called if the message was received from the connection
	 */
	//public abstract void actionServer();
	public abstract void actionConnection();
	
	
	
	
	
	/*
	public String getQuote() {
		int i = (int) (Math.random() * q.size());
		return q.get(i);
	}
	/**/
	
}






