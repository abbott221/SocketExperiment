package bartSocket5;
import java.util.ArrayList;


public class BartQuote {
	ArrayList<String> q = new ArrayList<String>();
	
	public BartQuote() {
		q.add("I will not waste chalk.");
		q.add("Statement 2");
		q.add("Statement 3");
	}
	
	public String getQuote() {
		int i = (int) (Math.random() * q.size());
		return q.get(i);
	}
}
