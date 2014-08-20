package bartSocket4;

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
		//SocketWrapper3 connection = new SocketWrapper3(s);
		
		
		try {
			SocketWrapper3 connection = new SocketWrapper3(s);
			
			
			
			System.out.println("Connected on port " + port);
			
			//Scanner in = new Scanner( s.getInputStream() );
			//PrintWriter out = new PrintWriter(s.getOutputStream(), true);
			
			
			
			//ClientUtil.handleGreet(in);
			ClientUtil.handleGreet(connection);
			
			
			
			//get a quote
			
			//out.println("get");
			connection.write("get");
			//String quote = in.nextLine();
			String quote = connection.read();
			
			
			
			//disconnect from the server
			connection.write("bye");
			//out.println("bye");
			s.close();
			
			//write the quote
			for (int i = 0; i < 20; i++) {
				System.out.println(quote);
			}
			
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
			System.out.print("What server do you want to connect to?");
			
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



