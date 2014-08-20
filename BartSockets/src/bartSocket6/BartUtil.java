package bartSocket6;
import java.util.ArrayList;

//possible where message info will be stored
public class BartUtil {
	//
}


class ClientUtil
{
	public static void handleGreet(SocketWrapper3 connect) {
		//discard the welcome message
		connect.read();
		
		//discard the exit instructions
		connect.read();
	}
}




class ServerUtil
{
	static void greet(SocketWrapper3 connect) {
		connect.write("Welcome to the Bart Server");
		connect.write("Enter BYE to exit.");
	}
}




