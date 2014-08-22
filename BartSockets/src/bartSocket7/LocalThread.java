package bartSocket7;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class LocalThread implements Runnable
{
	Scanner in;
	PrintWriter out;
	
	public LocalThread() {
		in = new Scanner(System.in);
		//out = new PrintWriter(s.getOutputStream(), true);
		out = new PrintWriter(System.out, true);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//messages
		
		//ClientUtil.handleGreet(connection);
		
		
		String input;
		while (true) {
			
			System.out.print("Type GET for a quote or BYE to exit: ");
			
			input = in.nextLine();
			
			
			
			//connection.write(input);
			
			if (input.equalsIgnoreCase("bye")) {
				//reads "So long, suckers!"
				//connection.read();
				
				return;
			}
			else if (input.equalsIgnoreCase("get")) {
				
				//String quote = connection.read();
				
				//for (int i = 0; i < 20; i++) {
				for (int i = 0; i < 5; i++) {
					//System.out.println(quote);
				}
			}
			else {
				//reads "Huh?"
				//connection.read();
			}
			
		}
	}
}
