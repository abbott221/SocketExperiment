package bartSocket4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class SocketWrapper3 {
	
	Scanner in;
	PrintWriter out;
	
	public Socket socket;
	
	public SocketWrapper3(Socket s) throws IOException {
		
		socket = s;
		in = new Scanner( s.getInputStream() );
		out = new PrintWriter(s.getOutputStream(), true);
		
		/*
		try {
			Scanner in = new Scanner( s.getInputStream() );
			
			PrintWriter out;
			out = new PrintWriter(s.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**/
		
	}
	
	
	
	//write to connection
	public void write(String print) {
		out.println(print);
	}
	
	//read from connection
	public String read() {
		String print = in.nextLine();
		
		System.out.println("Read: " + print);
		
		return print;
	}
	
}
