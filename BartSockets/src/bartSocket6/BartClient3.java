package bartSocket6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;


public class BartClient3 {
	
	
	public static void main(String[] args) {
		int port = 1234;
		
		System.out.println("Welcome to the Bart Client\n");
		
		Socket s = getSocket(port);
		SocketWrapper3 connection = new SocketWrapper3(s);
		
		
		try {
			
			
			System.out.println("Connected on port " + port);
			
			
			ClientUtil.handleGreet(connection);
			
			
			
			sessionLoop(connection);
			
			
			s.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private static Socket getSocket(int port) {
		Socket s;
		String host;
		InetAddress ip;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("What server do you want to connect to? ");
			
			host = sc.nextLine();
			try {
				ip = InetAddress.getByName(host);
				s = new Socket(ip, port);
				return s;
			} catch (UnknownHostException e) {
				System.out.println("The host is unknown.");
			} catch (IOException e) {
				System.out.println("Network error.");
			}
		}
		
	}
	
	
	
	private static void sessionLoop(SocketWrapper3 connection) {
		
		
		String input;
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.print("Type GET for a quote or BYE to exit: ");
			
			input = sc.nextLine();
			
			
			
			connection.write(input);
			
			if (input.equalsIgnoreCase("bye")) {
				//reads "So long, suckers!"
				connection.read();
				
				return;
			}
			else if (input.equalsIgnoreCase("get")) {
				
				String quote = connection.read();
				
				//for (int i = 0; i < 20; i++) {
				for (int i = 0; i < 5; i++) {
					System.out.println(quote);
				}
			}
			else {
				//reads "Huh?"
				connection.read();
			}
			
		}
		
	}
	
	
	
}






