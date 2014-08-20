package bartSocket5;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class BartServer3 {
	
	
	public static void main(String[] args) {
		int port = 1234;
		
		BartQuote bart = new BartQuote();
		
		SocketWrapper3 connection;
		
		try {
			System.out.println("BartServer 2.0");
			System.out.println("Listening on port " + port);
			
			
			
			ServerSocket ss = new ServerSocket(port);
			
			
			while (true) {
				
				//ss.accept() blocks until a connection is made
				Socket s = ss.accept();
				connection = new SocketWrapper3(s);
				
				
				System.out.println("Connection Established!");
				
				
				//Thread t = new Thread(new BartThread3(s, bart));
				Thread t = new Thread(new BartThread3(connection, bart));
				
				t.start();
			}
			
			
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("System exception!");
		}
	}
	
	
}



class BartThread3 implements Runnable
{
	//private Socket s;
	private BartQuote bart;
	
	private SocketWrapper3 connection;
	
	
	
	
	public BartThread3(SocketWrapper3 connect, BartQuote bart) {
		this.connection = connect;
		this.bart = bart;
	}
	
	@Override
	public void run() {
		String client = connection.socket.getInetAddress().toString();
		System.out.println("Connected to " + client);
		
		try {
			
			ServerUtil.greet(connection);
			
			
			while (true) {
				
				Thread.sleep(50);
				
				String input = connection.read();
				
				if (input.equalsIgnoreCase("bye")) {
					connection.write("So long, suckers!");
					connection.socket.close();
					break;
				}
				else if (input.equalsIgnoreCase("get")) {
					connection.write(bart.getQuote());
					System.out.println("Serving " + client);
				}
				else {
					connection.write("Huh?");
				}
			}
			
			//connection.write("So long, suckers!");
			//connection.socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Closed connection to " + client);
	}
	
	
}





