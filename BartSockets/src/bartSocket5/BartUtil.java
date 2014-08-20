package bartSocket5;
import java.util.ArrayList;

//possible where message info will be stored
public class BartUtil {
	ArrayList<String> q = new ArrayList<String>();
	
	public BartUtil() {
		q.add("I will not waste chalk.");
		q.add("Statement 2");
		q.add("Statement 3");
		q.add("Statement 4");
		q.add("Statement 5");
		q.add("Statement 6");
		q.add("Statement 7");
	}
	
	public String getQuote() {
		int i = (int) (Math.random() * q.size());
		return q.get(i);
	}
}


class ClientUtil
{
	/*
	public static void handleGreet(Scanner in) {
		//discard the welcome message
		in.nextLine();
		
		//discard the exit instructions
		in.nextLine();
	}
	/**/
	
	public static void handleGreet(SocketWrapper3 connect) {
		//discard the welcome message
		//in.nextLine();
		connect.read();
		
		//discard the exit instructions
		//in.nextLine();
		connect.read();
	}
}




class ServerUtil
{
	//greet the client
	/*
	static void greet(PrintWriter out) {
		out.println("Welcome to the Bart Server");
		out.println("Enter BYE to exit.");
	}
	/**/
	
	static void greet(SocketWrapper3 connect) {
		connect.write("Welcome to the Bart Server");
		connect.write("Enter BYE to exit.");
	}
}

