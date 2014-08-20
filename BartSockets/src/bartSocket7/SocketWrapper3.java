package bartSocket7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class SocketWrapper3 {
	
	Scanner in;
	PrintWriter out;
	
	public Socket socket;
	
	public SocketWrapper3(Socket s) {
		
		socket = s;
		try {
			in = new Scanner( s.getInputStream() );
			out = new PrintWriter(s.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	//write to connection
	public void write(String print) {
		out.println(print);
	}
	
	//read from connection
	public String read() {
		String print = "null";
		try {
			print = in.nextLine();
		} catch (Exception e) {
			System.out.println("Failed to read!");
			System.out.println("Connection closed?");
		}
		
		
		System.out.println("Read: " + print);
		
		return print;
	}
	
}
