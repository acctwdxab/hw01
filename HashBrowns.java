package quintrix01;
import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {

	public static void main(String[] args) {
		Set<String> h = new HashSet<String>();
		h.add("kitty");
		h.add("chickens");
		h.add("doggie");
		h.add("silkie");
		
//		
//		System.out.println(h);
//		System.out.println(h.size());
//		System.out.println(h.isEmpty());
//		System.out.println(h.contains("lily"));
		
		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(13);
		hashbrowns.add(10);
		hashbrowns.add(15);
		hashbrowns.add(14324);
		
		Iterator<Integer> it = hashbrowns.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("MxxY");
		System.out.println("Input String matches regex - "+matcher.matches());
		// bad regular expression
		pattern = Pattern.compile("*xx*");
		

	}

}
