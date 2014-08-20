package bartSocket6;
import java.util.ArrayList;


public class BartQuote {
	ArrayList<String> q = new ArrayList<String>();
	
	public BartQuote() {
		q.add("I will not waste chalk.");
		q.add("Statement 2");
		q.add("Statement 3");
		q.add("Statement 4");
		q.add("Statement 5");
		q.add("Statement 6");
		q.add("Statement 7");
		q.add("Statement 8");
	}
	
	public String getQuote() {
		int i = (int) (Math.random() * q.size());
		return q.get(i);
	}
}
