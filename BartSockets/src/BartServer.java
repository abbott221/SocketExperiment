import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class BartServer {
	
	
	public static void main(String[] args) {
		int port = 1234;
		
		BartQuote bart = new BartQuote();
		
		try {
			System.out.println("BartServer 1.0");
			System.out.println("Listening on port " + port);
			
			ServerSocket ss;
			ss = new ServerSocket(port);
			
			
			
			
			
			
			
			
			Socket s;
			
			//blocks until a connection is made
			s = ss.accept();
			
			
			
			
			
			
			
			//THREAD START
			
			String client;
			client = s.getInetAddress().toString();
			System.out.println("Connected to " + client);
			
			
			Scanner in;
			in = new Scanner(s.getInputStream());
			
			PrintWriter out;
			out = new PrintWriter(s.getOutputStream(), true);
			
			out.println("Welcome to BartServer 1.0");
			out.println("Enter GET to get a quote or BYE to exit");
			
			while (true) {
				String input = in.nextLine();
				
				if ( input.equalsIgnoreCase("bye") ) {
					break;
				}
				else if ( input.equalsIgnoreCase("get") ) {
					out.println( bart.getQuote() );
					System.out.println("Serving " + client);
				}
				else {
					out.println("Huh?");
				}
				
			}
			
			out.println("So long, suckers!");
			s.close();
			System.out.println("Closed connection to " + client);
			
			//THREAD END
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
