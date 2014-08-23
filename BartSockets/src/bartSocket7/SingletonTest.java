package bartSocket7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;


public class SingletonTest {
	
	//static String stored;
	static String stored = "blank";
	
	public static void main(String[] args) {
		int port = 1234;
		
		
		
		//Test if the \"stored\" variable is stored across multiple running programs
		//answer: it does not
		//thus, I can run my client class multiple times on localhost
		
		
		
		System.out.println("Initial message");
		
		
		
		//=======================================================
		String text;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("EXIT; PRINT stored value; or enter a new stored value ");
			
			text = sc.nextLine();
			
			//System.out.
			
			
			if (text.equalsIgnoreCase("print")) {
				//print value
				System.out.println(stored);
			}
			else if (text.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				//set value
				stored = text;
				System.out.println("Stored: " + stored);
			}
			
		}
		
		System.out.println("Bye");
	}
	
	
}






